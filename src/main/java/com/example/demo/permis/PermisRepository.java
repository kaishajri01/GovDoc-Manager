package com.example.demo.permis;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PermisRepository extends JpaRepository<Permis,Long> {

    Optional<Permis> findPermisById(Long id);

}
