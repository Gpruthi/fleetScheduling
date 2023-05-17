package org.chargePoint.fleetScheduling;

import org.chargePoint.fleetScheduling.dto.Capacity;
import org.chargePoint.fleetScheduling.dto.Vehicle;
import org.chargePoint.fleetScheduling.dto.VehicleCharger;
import org.chargePoint.fleetScheduling.enums.CapacityUnit;
import org.chargePoint.fleetScheduling.service.FleetSchedulingService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FleetSchedulingService fleetScheduling = new FleetSchedulingService();
        List<VehicleCharger> chargersList = new ArrayList<>();
        chargersList.add(new VehicleCharger(1, 40));
        chargersList.add(new VehicleCharger(2, 100));
        chargersList.add(new VehicleCharger(3, 20));

//        chargersList.add(new VehicleCharger(1, 110));
//        chargersList.add(new VehicleCharger(2, 140));
//        chargersList.add(new VehicleCharger(3, 84));

        List<Vehicle> trucks = new ArrayList<>();

        trucks.add(new Vehicle(101, new Capacity(100, CapacityUnit.KWH), new Capacity(10, CapacityUnit.KWH)));
        trucks.add(new Vehicle(102, new Capacity(100, CapacityUnit.KWH), new Capacity(50, CapacityUnit.KWH)));
        trucks.add(new Vehicle(103, new Capacity(100, CapacityUnit.KWH), new Capacity(25, CapacityUnit.KWH)));
        trucks.add(new Vehicle(104, new Capacity(100, CapacityUnit.KWH), new Capacity(15, CapacityUnit.KWH)));
        trucks.add(new Vehicle(105, new Capacity(100, CapacityUnit.KWH), new Capacity(20, CapacityUnit.KWH)));
        trucks.add(new Vehicle(106, new Capacity(100, CapacityUnit.KWH), new Capacity(16, CapacityUnit.KWH)));

//        trucks.add(new Vehicle(101, new Capacity(100, CapacityUnit.KWH), new Capacity(20, CapacityUnit.KWH)));
//        trucks.add(new Vehicle(102, new Capacity(100, CapacityUnit.KWH), new Capacity(27, CapacityUnit.KWH)));
//        trucks.add(new Vehicle(103, new Capacity(100, CapacityUnit.KWH), new Capacity(25, CapacityUnit.KWH)));
//        trucks.add(new Vehicle(104, new Capacity(100, CapacityUnit.KWH), new Capacity(24, CapacityUnit.KWH)));
//        trucks.add(new Vehicle(105, new Capacity(100, CapacityUnit.KWH), new Capacity(26, CapacityUnit.KWH)));
//        trucks.add(new Vehicle(106, new Capacity(100, CapacityUnit.KWH), new Capacity(22, CapacityUnit.KWH)));


        fleetScheduling.getFleetScheduling(2, chargersList, trucks);    }
}