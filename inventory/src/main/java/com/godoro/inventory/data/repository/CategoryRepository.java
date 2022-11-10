package com.godoro.inventory.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.godoro.inventory.data.entity.Category;

public interface CategoryRepository extends CrudRepository<Category,Long>{

}
