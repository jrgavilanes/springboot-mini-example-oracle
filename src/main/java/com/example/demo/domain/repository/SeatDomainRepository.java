package com.example.demo.domain.repository;

import com.example.demo.persistence.entity.Seat;

import java.util.List;

public interface SeatDomainRepository {
    List<Seat> getAll();
}
