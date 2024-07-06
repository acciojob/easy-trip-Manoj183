package com.driver.service;

import com.driver.model.Airport;
import com.driver.model.City;
import com.driver.model.Flight;
import com.driver.model.Passenger;
import com.driver.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;

@Service
public class AirportService {
    //@Autowired
    //AirportRepository repository;

    AirportRepository repository = new AirportRepository();
    public void addAirport(Airport airport){
        repository.addAirport(airport);
    }

    public String getLargestAirportName() {
        return repository.getLargestAirportName();
    }

    public void addFlight(@RequestBody Flight flight) {
        repository.addFlight(flight);
    }

    public String getAirportNameFromFlightId(Integer flightId) {
        return repository.getAirportNameFromFlightId(flightId);
    }

    public void addPassenger(Passenger passenger) {
        repository.addPassenger(passenger);
    }

    public String bookATicket(Integer flightId, Integer passengerId) {
        return repository.bookATicket(flightId,passengerId);
    }

    public String cancelATicket(Integer flightId, Integer passengerId) {
        return repository.cancelATicket(flightId,passengerId);
    }

    public int calculateFlightFare(Integer flightId) {
        return repository.calculateFlightFare(flightId);
    }

    public double getShortestDurationOfPossibleBetweenTwoCities(City fromCity, City toCity) {
        return repository.getShortestDurationOfPossibleBetweenTwoCities(fromCity, toCity);
    }

    public int countOfBookingsDoneByPassengerAllCombined(Integer passengerId) {
        return repository.countOfBookingsDoneByPassengerAllCombined(passengerId);
    }

    public int calculateRevenueOfAFlight(Integer flightId) {
        return repository.calculateRevenueOfAFlight(flightId);
    }

    public int getNumberOfPeopleOn(Date date, String airportName) {
        return repository.getNumberOfPeopleOn(date, airportName);
    }
}
