package com.example.demo.persistence;

import com.example.demo.domain.SeatDomain;
import com.example.demo.domain.repository.SeatDomainRepository;
import com.example.demo.persistence.crud.SeatCrudRepository;
import com.example.demo.persistence.entity.Seat;
import com.example.demo.persistence.mapper.SeatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SeatRepository implements SeatDomainRepository {

    @Autowired
    private SeatCrudRepository seatCrudRepository;

    @Autowired
    private SeatMapper seatMapper;


    @Override
    public List<SeatDomain> getAll() {
        List<Seat> seats = (List<Seat>) seatCrudRepository.findAll();
        return seatMapper.toSeatsDomain(seats);
    }

    @Override
    public Optional<SeatDomain> getById(int id) {
        return seatCrudRepository.findById(id).map(p -> seatMapper.toSeatDomain(p));
    }


}
