package com.vntu.pipz.crm_mobile_electric_transport.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class EnergyCapacityBatteryTest {
    private final BigDecimal distance = BigDecimal.valueOf(100.0);
    private final BigDecimal speedMovementKilometersPerHour = BigDecimal.valueOf(50.0);
    private final BigDecimal power = BigDecimal.valueOf(1564.0);
    private final BigDecimal voltage = BigDecimal.valueOf(60.0);

    @Test
    void getEnergyCapacityBattery() {
        EnergyCapacityBattery energyCapacityBattery = new EnergyCapacityBattery(distance, speedMovementKilometersPerHour,
                power, voltage);
        BigDecimal energyCapacityActual = energyCapacityBattery.getEnergyCapacityBattery();
        BigDecimal energyCapacityExpected = BigDecimal.valueOf(52.1);
        assert energyCapacityExpected.compareTo(energyCapacityActual) == 0;
    }
}