/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proxectoempleado;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class EmpregadoTest {
    
    public EmpregadoTest() {
    }

    @Test
    public void testObterSalarioAnual() {
        System.out.println("obterSalarioAnual");
        Empregado instance = new Empregado(01,"nerea","trillo","perez",1200);
        double expResult = 14400;
        double result = instance.obterSalarioAnual();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIncrementarSalario() {
        System.out.println("incrementarSalario");
        int porcentaxe = 40;
        Empregado instance = new Empregado(02,"patricia","trillo","perez",1200);
        double expResult = 1680;
        double result = instance.incrementarSalario(porcentaxe);
        assertEquals(expResult, result, 0.0);
    }
    
}
