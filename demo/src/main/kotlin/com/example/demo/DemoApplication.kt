package com.example.demo

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication{
    @Bean
    fun init(houseRepository: HouseRepository): CommandLineRunner? {
        return CommandLineRunner { args: Array<String?>? ->
            val house = House()
            house.owner = "Julius Krah"
            house.fullyPaid = true
            houseRepository.save(house)

        }
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
