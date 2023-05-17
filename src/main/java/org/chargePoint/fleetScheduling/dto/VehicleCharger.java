package org.chargePoint.fleetScheduling.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VehicleCharger {

    private int chargerId;
    private int chargingRate;


}
