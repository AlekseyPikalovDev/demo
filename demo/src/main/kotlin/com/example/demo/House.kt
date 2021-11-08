package com.example.demo;

//import lombok.Data;

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * @author Julius Krah
 */
@Entity
class House(
    @Id
    @GeneratedValue
    var id: Int? = null,
    var owner: String? = null,
    var fullyPaid: Boolean = false

) : Serializable {

    companion object {
        private const val serialVersionUID = 1L
    }
}