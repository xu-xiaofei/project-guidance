package com.techshard.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.dao.entity.Vehicle;
import com.techshard.graphql.service.VehicleService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;


@Controller
public class VehicleMutation implements GraphQLMutationResolver {

    @Resource
    private VehicleService vehicleService;

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName) {
        return this.vehicleService.createVehicle(type, modelCode, brandName);
    }
}
