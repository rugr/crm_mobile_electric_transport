package com.vntu.pipz.crm_mobile_electric_transport.models;

import java.math.BigDecimal;

public class PowerElectricTransport {
    final private static BigDecimal COEFFICIENT_PERFORMANCE = BigDecimal.valueOf(0.8);
    final private static BigDecimal COEFFICIENT_AIR_RESISTANCE = BigDecimal.valueOf(0.89);
    final private static BigDecimal COEFFICIENT_FRICTION_FORCE = BigDecimal.valueOf(0.0343);

    private BigDecimal speedMovement;
    private BigDecimal massElectricTransport;
    private BigDecimal massDriver;

    public PowerElectricTransport(BigDecimal speedMovement, BigDecimal massElectricTransport, BigDecimal massDriver) {
        this.speedMovement = speedMovement;
        this.massElectricTransport = massElectricTransport;
        this.massDriver = massDriver;
    }

    public BigDecimal getPower() {
        if (speedMovement != null && massElectricTransport != null && massDriver != null) {
            BigDecimal mass = massElectricTransport.add(massDriver);
            BigDecimal fFriction = COEFFICIENT_FRICTION_FORCE.multiply(mass);
            BigDecimal fAirResistance = speedMovement.multiply(speedMovement).divide(BigDecimal.valueOf(2.0))
                    .multiply(COEFFICIENT_AIR_RESISTANCE);
            BigDecimal fSum = fFriction.add(fAirResistance);
            return fSum.multiply(speedMovement).divide(COEFFICIENT_PERFORMANCE);
        }
        return null;
    }
}
