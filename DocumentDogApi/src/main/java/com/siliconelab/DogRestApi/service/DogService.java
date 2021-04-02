package com.siliconelab.DogRestApi.service;

import com.siliconelab.DogRestApi.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
