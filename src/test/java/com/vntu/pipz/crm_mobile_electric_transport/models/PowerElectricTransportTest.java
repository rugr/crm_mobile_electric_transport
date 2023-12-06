package com.vntu.pipz.crm_mobile_electric_transport.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PowerElectricTransportTest {
    private final BigDecimal speedMovement = BigDecimal.valueOf(13.9);
    private final BigDecimal massElectricTransport = BigDecimal.valueOf(35.0);
    private final BigDecimal massDriver = BigDecimal.valueOf(82.0);

    @Test
    void getPower() {
        PowerElectricTransport powerElectricTransport =
                new PowerElectricTransport(speedMovement, massElectricTransport, massDriver);
        BigDecimal powerActual = powerElectricTransport.getPower().setScale(0, BigDecimal.ROUND_HALF_DOWN);
        BigDecimal powerExpected = BigDecimal.valueOf(1564);
        assert powerExpected.compareTo(powerActual) == 0;
    }
}