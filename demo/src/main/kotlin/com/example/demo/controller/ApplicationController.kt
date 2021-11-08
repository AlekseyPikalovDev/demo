package com.example.demo.controller

import com.example.demo.House
import com.example.demo.HouseRepository
import com.example.demo.Item
import com.example.demo.ItemRepository
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/application")
class ApplicationController(
    @Value("\${test.name}")
    private val testProperty: String,
//    @Autowired
    private val houseRepository: HouseRepository,
    private val itemRepository: ItemRepository
) {

    private val log = KotlinLogging.logger { }

    @PostMapping("/house")
    fun createItem(@RequestBody house: House): ResponseEntity<House> {
        return ResponseEntity.ok(houseRepository.save(house))
    }

    @PostMapping("/item")
    fun createItem(@RequestBody item: Item): ResponseEntity<Item> {
        return ResponseEntity.ok(itemRepository.save(item))
    }

    @GetMapping("/house/{id}")
    fun getHouse(@PathVariable("id") id: Int): ResponseEntity<House> {
        return ResponseEntity.ok(
            houseRepository.findById(id) ?: error("House not found")
        )
    }

    @GetMapping("/item/{id}")
    fun getItem(@PathVariable("id") id: Int): ResponseEntity<Item> {
        return ResponseEntity.ok(
            itemRepository.findById(id) ?: error("Item not found")
        )
    }
}
