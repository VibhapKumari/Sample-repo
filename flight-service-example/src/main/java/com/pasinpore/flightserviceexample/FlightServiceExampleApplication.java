package com.pasinpore.flightserviceexample;

import com.pasinpore.flightserviceexample.dto.FlightBookingAcknowledgement;
import com.pasinpore.flightserviceexample.dto.FlightBookingRequest;
import com.pasinpore.flightserviceexample.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class FlightServiceExampleApplication {

	@Autowired
	private FlightBookingService flightBookingService;

	@PostMapping("/booFlightTicket")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request){
		return  flightBookingService.bookFlightTicket(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(FlightServiceExampleApplication.class, args);
	}

}
