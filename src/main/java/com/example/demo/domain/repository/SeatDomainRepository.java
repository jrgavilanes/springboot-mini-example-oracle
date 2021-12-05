package com.example.demo.domain.repository;

import com.example.demo.domain.SeatDomain;
import com.example.demo.persistence.entity.Seat;

import java.util.List;
import java.util.Optional;

public interface SeatDomainRepository {
    List<SeatDomain> getAll();
    Optional<SeatDomain> getById(int id);
}
