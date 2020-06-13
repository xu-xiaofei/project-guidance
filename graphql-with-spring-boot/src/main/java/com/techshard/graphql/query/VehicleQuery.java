package com.techshard.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.dao.entity.Vehicle;
import com.techshard.graphql.service.VehicleService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class VehicleQuery implements GraphQLQueryResolver {

    @Resource
    private VehicleService vehicleService;

    public List<Vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count);
    }

    public Vehicle getVehicle(final int id) {
        return this.vehicleService.getVehicle(id);
    }
}
