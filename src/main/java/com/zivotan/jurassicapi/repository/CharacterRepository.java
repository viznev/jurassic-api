package com.zivotan.jurassicapi.repository;

import com.zivotan.jurassicapi.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, String> {
}
