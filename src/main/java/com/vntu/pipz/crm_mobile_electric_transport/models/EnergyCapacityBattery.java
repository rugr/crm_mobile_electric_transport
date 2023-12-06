package com.vntu.pipz.crm_mobile_electric_transport.models;

import java.math.BigDecimal;

public class EnergyCapacityBattery {
    private BigDecimal distance;
    private BigDecimal speedMovementKilometersPerHour;
    private BigDecimal power;
    private BigDecimal voltage;

    public EnergyCapacityBattery(BigDecimal distance, BigDecimal speedMovementKilometersPerHour, BigDecimal power, BigDecimal voltage) {
        this.distance = distance;
        this.speedMovementKilometersPerHour = speedMovementKilometersPerHour;
        this.power = power;
        this.voltage = voltage;
    }

    public BigDecimal getEnergyCapacityBattery() {
        if (distance != null && speedMovementKilometersPerHour != null && power != null && voltage != null) {
            return distance.divide(speedMovementKilometersPerHour).multiply(power).divide(voltage);
        }
        return null;
    }
}
