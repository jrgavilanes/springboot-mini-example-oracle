package com.example.demo.persistence.crud;

import com.example.demo.persistence.entity.Seat;
import org.springframework.data.repository.CrudRepository;

public interface SeatCrudRepository extends CrudRepository<Seat, Integer> {
}
