package com.example.userservice.repositories;

import com.example.userservice.models.Suplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuplierRepository extends JpaRepository<Suplier, Long> {
}
