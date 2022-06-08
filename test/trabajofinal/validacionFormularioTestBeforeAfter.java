/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


/**
 *
 * @author javi
 */
public class validacionFormularioTestBeforeAfter {
    

  private validacionFormulario instance;

     @Before
    public void before() {
        System.out.println("before()");
        instance = new validacionFormulario();
    }

    @After
    public void after() {
        System.out.println("after()");
        instance = null;
    }

      public validacionFormularioTestBeforeAfter() {
    }
    /**
     * Test of validacionRegistro method, of class validacionFormulario.
     */
    @Test
    public void testValidacionRegistroCP1() throws Exception {
        System.out.println("validacionRegistro");
        
        instance.setUsuario("erkapitan72");
        instance.setPassword("a123456");
        instance.setFechaNacimiento("07/04/1972");
        instance.setSaldoInicial(40.00);
       
        String expResult = "Registro completado de forma correcta";
        String result = instance.validacionRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testValidacionRegistroCP2() throws Exception {
        System.out.println("validacionRegistro");
        
        instance.setUsuario("erka");
        instance.setPassword("a123456");
        instance.setFechaNacimiento("07/04/1972");
        instance.setSaldoInicial(40.00);
        
        
        String expResult = "E4 Registro no permitido por cadena de usuario propuesta no válida: Longitud";
        String result = instance.validacionRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testValidacionRegistroCP3() throws Exception {
        System.out.println("validacionRegistro");
        
        instance.setUsuario("72erkapitan");
        instance.setPassword("a123456");
        instance.setFechaNacimiento("07/04/1972");
        instance.setSaldoInicial(40.00);
        
        String expResult = "E4 Registro no permitido por cadena de usuario propuesta no válida: Primer carácter no válido";
        String result = instance.validacionRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testValidacionRegistroCP4() throws Exception {
        System.out.println("validacionRegistro");
        
        instance.setUsuario("*/-@#~$");
        instance.setPassword("a123456");
        instance.setFechaNacimiento("07/04/1972");
        instance.setSaldoInicial(40.00);        
        

        String expResult = "E4 Registro no permitido por cadena de usuario propuesta no válida: Formato incorrecto";
        String result = instance.validacionRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        @Test
    public void testValidacionRegistroCP5() throws Exception {
        System.out.println("validacionRegistro");
        
        instance.setUsuario("erkapitan72");
        instance.setPassword("a123");
        instance.setFechaNacimiento("07/04/1972");
        instance.setSaldoInicial(40.00);     
  
        String expResult = "E3 Registro no permitido por contraseña incorrecta: Longitud";
        String result = instance.validacionRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
            @Test
    public void testValidacionRegistroCP6() throws Exception {
        System.out.println("validacionRegistro");
        
        instance.setUsuario("erkapitan72");
        instance.setPassword("a1234567890");
        instance.setFechaNacimiento("07/04/1972");
        instance.setSaldoInicial(40.00);  
        
        String expResult = "E3 Registro no permitido por contraseña incorrecta: Longitud";
        String result = instance.validacionRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
            @Test
    public void testValidacionRegistroCP7() throws Exception {
        System.out.println("validacionRegistro");
        
        instance.setUsuario("erkapitan72");
        instance.setPassword("a.123456");
        instance.setFechaNacimiento("07/04/1972");
        instance.setSaldoInicial(40.00);  
        
        String expResult = "E3 Registro no permitido por contraseña incorrecta: Formato";
        String result = instance.validacionRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testValidacionRegistroCP8() throws Exception {
        System.out.println("validacionRegistro");
        
        instance.setUsuario("erkapitan72");
        instance.setPassword("a123456");
        instance.setFechaNacimiento("07/04/2015");
        instance.setSaldoInicial(40.00);         
        
        String expResult = "E1 Registro no permitido a menores de edad.";
        String result = instance.validacionRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
            @Test
    public void testValidacionRegistroCP9() throws Exception {
        System.out.println("validacionRegistro");
        
        instance.setUsuario("erkapitan72");
        instance.setPassword("a123456");
        instance.setFechaNacimiento("07/04/1972");
        instance.setSaldoInicial(60); 

        String expResult = "E2 Registro no permitido por saldo superior a 50,00 €.";
        String result = instance.validacionRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
