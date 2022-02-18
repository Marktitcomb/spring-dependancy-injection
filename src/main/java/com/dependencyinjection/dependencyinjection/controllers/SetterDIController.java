package com.dependencyinjection.dependencyinjection.controllers;

import com.dependencyinjection.dependencyinjection.services.DrivingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterDIController {

    private DrivingService driverService;

    @Autowired
    public void setDrivingService(DrivingService driverService){
        this.driverService = driverService;
    }

    public String getVehicle(){
        return driverService.getVehicle();
    }


}
