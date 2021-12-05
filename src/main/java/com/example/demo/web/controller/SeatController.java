package com.example.demo.web.controller;

import com.example.demo.domain.SeatDomain;
import com.example.demo.domain.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/seats")
public class SeatController {
    @Autowired
    private SeatService seatService;

    @GetMapping("")
    public List<SeatDomain> getAll() {
        return seatService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<SeatDomain> getSeat(@PathVariable("id") int id) {
        return seatService.getById(id);
    }
}
