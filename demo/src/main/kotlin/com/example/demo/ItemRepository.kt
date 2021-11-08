package com.example.demo;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component

import java.util.Optional;


/**
 * @author Julius Krah
 */
@Component
interface ItemRepository: Repository<Item, Int> {
    /**
     * Save a given House
     *
     * @param house must not be null
     * @return the saved house
     */
    fun save(house: Item): Item;

    /**
     * Retrieves a House by it's id
     *
     * @param id must not be null
     * @return the House with the given id or empty
     */
    fun findById(id: Int ): Item?
}
