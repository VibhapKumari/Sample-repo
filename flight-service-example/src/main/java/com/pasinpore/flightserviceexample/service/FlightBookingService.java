package com.pasinpore.flightserviceexample.service;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.pasinpore.flightserviceexample.dto.FlightBookingAcknowledgement;
import com.pasinpore.flightserviceexample.dto.FlightBookingRequest;
import com.pasinpore.flightserviceexample.entity.PassengerInfo;
import com.pasinpore.flightserviceexample.entity.PaymentInfo;
import com.pasinpore.flightserviceexample.repo.PassengerInfoRepository;
import com.pasinpore.flightserviceexample.repo.PaymentInfoRepository;
import com.pasinpore.flightserviceexample.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional
    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request){

        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();
        PaymentUtils.validateCredential(paymentInfo.getAccountNo(),passengerInfo.getFare());
        paymentInfo.setPassengerId(passengerInfo.getPId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return  new FlightBookingAcknowledgement("Success",passengerInfo.getFare(), UUID.randomUUID()
                .toString().split("-")[0],passengerInfo);

    }

   /*
    URL : http://localhost:9090/booFlightTicket
    Json Response:
    {
        "passengerInfo":{
        "name": "basant",
                "email": "basant@gmail.com",
                "source":"Bangalore",
                "destination":"Gaya",
                "travelDate":"31-07-2021",
                "pickupTime":"4.0 PM",
                "arrivalTime":"6.0 PM",
                "fare":"18000.0"
    },
        "paymentInfo":{
        "accountNo":"acc1",
                "cardType":"DEBIT"
    }

    }*/



}
