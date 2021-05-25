package com.example.petclinicexample.repository;

import com.example.petclinicexample.model.Owner;
import com.example.petclinicexample.model.Pet;

import java.util.List;

public interface IPetRepository {
    Pet findById(Long id);
    List<Pet> findByLastName(String lastName);
    void create(Pet pet);
    Pet  update(Pet pet);
    void delete(Pet pet);
    void  deleteOwnerId(Long ownerId);
}
