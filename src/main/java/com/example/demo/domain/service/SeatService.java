package com.example.demo.domain.service;

import com.example.demo.domain.SeatDomain;
import com.example.demo.domain.repository.SeatDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeatService {
    @Autowired
    private SeatDomainRepository seatDomainRepository;

    public List<SeatDomain> getAll() {
        return seatDomainRepository.getAll();
    }

    public Optional<SeatDomain> getById(int id) {
        return seatDomainRepository.getById(id);
    }
}
