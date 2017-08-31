/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author usuario
 */

public class UtilitiesTest {
    
    
    public UtilitiesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getResume method, of class Utilities.
     */
    @Test
    public void testGetResume() {
        System.out.println("getResume");
        String texto = "Bienvenidos a la materia de Programación 3 Ciclo II 2017.";
        Utilities instance = new Utilities();
        String expResult = "Bienvenidos a la mat";
        String result = instance.getResume(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of capitalizar method, of class Utilities.
     */
    @Test
    public void testCapitalizar() {
        System.out.println("capitalizar");
        String texto = "prueBas de UNIDAD con JUnit & arQuillian";
        Utilities instance = new Utilities();
        String expResult = "Pruebas De Unidad Con Junit & Arquillian";
        String result = instance.capitalizar(texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarOnincidencias method, of class Utilities.
     */
    @Test
    public void testContarOnincidencias() {
        System.out.println("contarOnincidencias");
        String frase = "2017";
        String texto = "Bienvenidos a la materia de Programación 3 Ciclo II 2017.";
        Utilities instance = new Utilities();
        int expResult = 1;
        int result = instance.contarOnincidencias(frase, texto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
