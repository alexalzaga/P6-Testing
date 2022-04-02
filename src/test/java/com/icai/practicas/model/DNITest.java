package com.icai.practicas.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DNITest {

    private DNI dni;

    @Test
    void testCorrecto() {

        dni = new DNI("02364298J"); //correcto
        Boolean expectedResult = true;
        Boolean result = dni.validar();

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    void testFalso1() {

        dni = new DNI("v2364298J"); //formato incorrecto
        Boolean expectedResult = false;
        Boolean result = dni.validar();

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    void testFalso2() {

        dni = new DNI("02364298Ñ"); //letra Ñ no valida
        Boolean expectedResult = false;
        Boolean result = dni.validar();

        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    void testFalso3() {

        dni = new DNI("99999999R"); //un dni inválido
        Boolean expectedResult = false;
        Boolean result = dni.validar();

        Assertions.assertEquals(expectedResult,result);
    }
}