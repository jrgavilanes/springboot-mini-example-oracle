package com.example.demo.persistence.mapper;


import com.example.demo.domain.SeatDomain;
import com.example.demo.persistence.entity.Seat;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SeatMapper {
    @Mappings({
            @Mapping(source = "seatId", target = "seatId"),
            @Mapping(source = "passport", target = "passport"),
            @Mapping(source = "code", target = "code"),
            @Mapping(source = "seatNumber", target = "seatNumber")
    })
    SeatDomain toSeatDomain(Seat seat);
    List<SeatDomain> toSeatsDomain(List<Seat> seats);

    @InheritInverseConfiguration
//    @Mapping(target = "seatNumber", ignore = true)
    Seat toSeat(SeatDomain seatDomain);
}
