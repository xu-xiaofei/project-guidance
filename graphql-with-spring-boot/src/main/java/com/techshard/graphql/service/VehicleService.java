package com.techshard.graphql.service;

import com.techshard.graphql.dao.entity.Vehicle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class VehicleService {

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName) {
        final Vehicle vehicle = new Vehicle();
        vehicle.setType(type);
        vehicle.setModelCode(modelCode);
        vehicle.setBrandName(brandName);
        log.info("vehicle has been inserted");
        return vehicle;
    }

    public List<Vehicle> getAllVehicles(final int count) {

        Vehicle vehicle = new Vehicle();
        vehicle.setType("type");
        vehicle.setModelCode("modelCode");
        vehicle.setBrandName("brandName");
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(vehicle);
        log.info("vehicles have got from method getAllVehicles");
        return vehicles;
    }

    public Vehicle getVehicle(final int id) {

        Vehicle vehicle = new Vehicle();
        vehicle.setType("type");
        vehicle.setModelCode("modelCode");
        vehicle.setBrandName("brandName");
        log.info("vehicle has got from method  getVehicle");
        return vehicle;
    }
}
