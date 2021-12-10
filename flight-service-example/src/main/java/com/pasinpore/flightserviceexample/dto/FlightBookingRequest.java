package com.pasinpore.flightserviceexample.dto;

import com.pasinpore.flightserviceexample.entity.PassengerInfo;
import com.pasinpore.flightserviceexample.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

    private PaymentInfo paymentInfo;
    private PassengerInfo passengerInfo;
}
