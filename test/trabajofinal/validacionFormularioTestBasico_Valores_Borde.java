/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author javi
 */
public class validacionFormularioTestBasico_Valores_Borde {
    
    public validacionFormularioTestBasico_Valores_Borde() {
    }
  private validacionFormulario instance;

    /**
     * Test of validacionRegistro method, of class validacionFormulario.
     */
        @Test
    public void testValidacionRegistroCPBorde() throws Exception {
        System.out.println("validacionRegistro");
        
        
        instance= new validacionFormulario("erkapitan72","a123456","07/04/1972", 49.98);
        String expResult = "Registro completado de forma correcta";
        String result = instance.validacionRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
                @Test
    public void testValidacionRegistroCPBorde2() throws Exception {
        System.out.println("validacionRegistro");
        
        
        instance= new validacionFormulario("erkapitan72","a123456","07/04/1972", 50);
        String expResult = "E2 Registro no permitido por saldo superior a 50,00 €.";
        String result = instance.validacionRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
