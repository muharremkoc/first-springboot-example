package com.example.petclinicexample.model;

import com.example.petclinicexample.repository.IPetRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PetRepository implements IPetRepository {
    @Override
    public Pet findById(Long id) {
        return null;
    }

    @Override
    public List<Pet> findByLastName(String lastName) {
        return null;
    }

    @Override
    public void create(Pet pet) {

    }

    @Override
    public Pet update(Pet pet) {
        return null;
    }

    @Override
    public void delete(Pet pet) {

    }

    @Override
    public void deleteOwnerId(Long ownerId) {

    }
}
