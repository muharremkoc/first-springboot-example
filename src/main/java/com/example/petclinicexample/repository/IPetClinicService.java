package com.example.petclinicexample.repository;

import com.example.petclinicexample.model.Owner;
import com.example.petclinicexample.service.OwnerNotFoundException;

import java.util.List;

public interface IPetClinicService {
     List<Owner> findOwners();
     List<Owner> findOwners(String lastName);
     Owner findOwner(Long id) throws OwnerNotFoundException;
     void createOwner(Owner owner);
     void updateOwner(Owner owner);
     void deleteOwner(Long id);

}
