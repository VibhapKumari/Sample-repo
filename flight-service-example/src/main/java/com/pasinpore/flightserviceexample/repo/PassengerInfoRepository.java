package com.pasinpore.flightserviceexample.repo;

import com.pasinpore.flightserviceexample.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
