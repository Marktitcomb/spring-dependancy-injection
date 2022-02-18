package com.dependencyinjection.dependencyinjection.controllers;

import com.dependencyinjection.dependencyinjection.services.DrivingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorDIController {


    private DrivingService drivingService;

    //public ConstructorDIController(@Qualifier("superCarDrivingService") DrivingService drivingService){
    public ConstructorDIController( DrivingService drivingService){
        this.drivingService = drivingService;
    }

    public String vehicleBeingDriven(){
        return drivingService.getVehicle();
    }
}
