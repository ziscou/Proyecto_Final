/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author javi
 */
@RunWith(Parameterized.class)
public class validacionFormularioParametrizadasTest {
    private String usuario;
    private String password;
    private String fechaNacimiento;
    private double saldoInicial;
    private String res;

    public validacionFormularioParametrizadasTest(String usuario, String password, String fechaNacimiento, double saldoInicial, String res) {
        this.usuario = usuario;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
        this.saldoInicial = saldoInicial;
        this.res = res;
    }
    

    /**
     * Test of main method, of class Prestamo.
     */
    @Parameters
    public static Iterable<Object[]> getData() {
        return Arrays.asList(new Object[][]{
            {"erkapitan72","a123456","07/04/1972", 40.00,"Registro completado de forma correcta"},
            {"erka","a123456","07/04/1972", 40.00,"E4 Registro no permitido por cadena de usuario propuesta no válida: Longitud"},
            {"72erkapitan","a123456","07/04/1972", 40.00,"E4 Registro no permitido por cadena de usuario propuesta no válida: Primer carácter no válido"},
            {"*/-@#~$","a123456","07/04/1972", 40.00,"E4 Registro no permitido por cadena de usuario propuesta no válida: Formato incorrecto"},
            {"erkapitan72","a123","07/04/1972", 40.00,"E3 Registro no permitido por contraseña incorrecta: Longitud"},
            {"erkapitan72","a1234567890","07/04/1972", 40.00,"E3 Registro no permitido por contraseña incorrecta: Longitud"},
            {"erkapitan72","a.123456","07/04/1972", 40.00, "E3 Registro no permitido por contraseña incorrecta: Formato"},
            {"erkapitan72","a123456","07/04/2015", 40.00, "E1 Registro no permitido a menores de edad."},
            {"erkapitan72","a123456","07/04/1972", 60, "E2 Registro no permitido por saldo superior a 50,00 €."},
            {"erkapitan72","a123456","07/04/1972", 49.98, "Registro completado de forma correcta"},
            {"erkapitan72","a123456","07/04/1972", 50, "E2 Registro no permitido por saldo superior a 50,00 €."}
        });
    }

    /**
     * Test of estudio method, of class Prestamo.
     */
    @Test
    public void testEstudio() throws Exception {
        System.out.println("Validacion Formulario");
        validacionFormulario instance = new validacionFormulario(usuario,password,fechaNacimiento,saldoInicial);
        String result = instance.validacionRegistro();
        assertEquals(res, result);
    }

}
