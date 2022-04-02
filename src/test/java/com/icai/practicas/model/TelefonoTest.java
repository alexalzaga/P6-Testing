package com.icai.practicas.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TelefonoTest {

    private Telefono telefono;

    @Test
    void testDNI() {

        telefono= new Telefono("+34 987654321"); //correcto
        Boolean expectedResult= true;
        Boolean result = telefono.validar();

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    void testCorrecto2() {

        telefono= new Telefono("987654321"); //correcto
        Boolean expectedResult= true;
        Boolean result = telefono.validar();

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    void testFalso() {

        telefono= new Telefono("9876S4321"); //formato incorrecto
        Boolean expectedResult= false;
        Boolean result = telefono.validar();

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    void testFalso2() {

        telefono= new Telefono("987654321123456789"); //longitud incorrecta
        Boolean expectedResult= false;
        Boolean result = telefono.validar();

        Assertions.assertEquals(expectedResult,result);
    }
}