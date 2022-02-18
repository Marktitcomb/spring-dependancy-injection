package com.dependencyinjection.dependencyinjection.controllers;

import com.dependencyinjection.dependencyinjection.services.DrivingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FieldDIController {

    @Autowired
    DrivingService drivingService;

    public String getDrivingSpeed(){
        return drivingService.getSpeedConfirmation();
    }

    public String getVehcile(){
        return drivingService.getVehicle();
    }
}
