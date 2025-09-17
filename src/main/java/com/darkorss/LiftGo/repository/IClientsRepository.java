package com.darkorss.LiftGo.repository;

import com.darkorss.LiftGo.model.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IClientsRepository extends JpaRepository<Clients, Long> {
    Optional<Clients> findByEmail(String email);
    Optional<Clients> findByPhone(String phone);
    boolean existsByEmail(String email);
    boolean existsByPhone(String phone);
}
