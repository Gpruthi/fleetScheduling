package org.chargePoint.fleetScheduling.dto;

import lombok.*;
import org.chargePoint.fleetScheduling.enums.CapacityUnit;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Capacity {

    private int capacity;

    private CapacityUnit unit;
}
