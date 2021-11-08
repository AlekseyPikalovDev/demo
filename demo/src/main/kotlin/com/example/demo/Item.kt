package com.example.demo;

//import lombok.Data;

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

/**
 * @author Julius Krah
 */
@Entity
class Item(
    @Id
    @GeneratedValue
    var id: Int? = null,
    var name: String? = null,
    @ManyToOne
    var house: House? = null

) : Serializable {

    companion object {
        private const val serialVersionUID = 1L
    }
}