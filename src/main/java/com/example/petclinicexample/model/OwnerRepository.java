package com.example.petclinicexample.model;

import com.example.petclinicexample.repository.IOwnerRepository;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;
@Repository
public class OwnerRepository implements IOwnerRepository {

    private Map<Long,Owner> ownerMap=new HashMap<>();
    public OwnerRepository() {
        Owner ownerOne=new Owner();
        Owner ownerTwo=new Owner();
        ownerOne.setId(1L);
        ownerOne.setFirstName("Mahmut");
        ownerOne.setLastName("Acamat");

        ownerTwo.setId(2L);
        ownerTwo.setFirstName("Muharrem");
        ownerTwo.setLastName("Koc");

        ownerMap.put(ownerOne.getId(),ownerOne);
        ownerMap.put(ownerTwo.getId(),ownerTwo);
    }


    @Override
    public List<Owner> findAll() {
        return new ArrayList<>(ownerMap.values());
    }

    @Override
    public Owner findById(Long id) {
        return ownerMap.get(id);
    }

    @Override
    public List<Owner> findByLastName(String lastName) {
        return ownerMap.values().stream().filter(owner ->owner.getLastName().equals(lastName)).collect(Collectors.toList());
    }

    @Override
    public void create(Owner owner) {
        owner.setId(new Date().getTime());
        ownerMap.put(owner.getId(),owner);

    }

    @Override
    public Owner update(Owner owner) {
        ownerMap.replace(owner.getId(),owner);
        return owner;
    }

    @Override
    public void delete(Long id) {
      ownerMap.remove(id);
    }
}
