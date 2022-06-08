/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;


/**
 *
 * @author javi
 */
public class validacionFormularioTestBeforeAfterClass_Valores_Borde {
    

  private static validacionFormulario instance;

     @BeforeClass
    public static void before() {
        System.out.println("before()");
        instance = new validacionFormulario();
    }

    @AfterClass
    public static void after() {
        System.out.println("after()");
        instance = null;
    }

      public validacionFormularioTestBeforeAfterClass_Valores_Borde() {
    }
    /**
     * Test of validacionRegistro method, of class validacionFormulario.
     */
  
    @Test
    public void testValidacionRegistroCPBorde() throws Exception {
        System.out.println("validacionRegistro");
        
        instance.setUsuario("erkapitan72");
        instance.setPassword("a123456");
        instance.setFechaNacimiento("07/04/1972");
        instance.setSaldoInicial(49.98); 

        String expResult = "Registro completado de forma correcta";
        String result = instance.validacionRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
                @Test
    public void testValidacionRegistroCPBorde1() throws Exception {
        System.out.println("validacionRegistro");
        
        instance.setUsuario("erkapitan72");
        instance.setPassword("a123456");
        instance.setFechaNacimiento("07/04/1972");
        instance.setSaldoInicial(50); 

        String expResult = "E2 Registro no permitido por saldo superior a 50,00 €.";
        String result = instance.validacionRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
