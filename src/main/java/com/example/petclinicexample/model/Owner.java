package com.example.petclinicexample.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults (level = AccessLevel.PRIVATE)
public class Owner {
    Long id;
    String firstName;
    String lastName;
    private Set<Pet> pets=new HashSet<>();


}
