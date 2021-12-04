package com.example.demo.persistence;

import com.example.demo.domain.SeatDomain;
import com.example.demo.domain.repository.SeatDomainRepository;
import com.example.demo.persistence.crud.SeatCrudRepository;
import com.example.demo.persistence.entity.Seat;
import com.example.demo.persistence.mapper.SeatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SeatRepository implements SeatDomainRepository {

    @Autowired
    private SeatCrudRepository seatCrudRepository;

    private SeatMapper seatMapper;

    public List<SeatDomain> getSeatsDomain() {
        List<Seat> seats = (List<Seat>) seatCrudRepository.findAll();
        return  seatMapper.toSeatsDomain(seats);
    }

    @Override
    public List<Seat> getAll() {
        return (List<Seat>) seatCrudRepository.findAll();
    }
}
