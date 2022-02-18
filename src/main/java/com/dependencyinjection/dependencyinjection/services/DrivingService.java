package com.dependencyinjection.dependencyinjection.services;

import com.dependencyinjection.dependencyinjection.locations.Location;

public interface DrivingService {

     String getSpeedConfirmation();

     String getVehicle();

     static String destination(){
         return Location.Mars.toString();
     }
}
