/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajofinal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author javie
 */
public class TrabajoFinal {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        String sRespuesta;
        
        validacionFormulario miFormulario = new validacionFormulario ("usuario","12345678", "07/04/2012", 25.50);
        
        sRespuesta = miFormulario.validacionRegistro();
        
        System.out.println(sRespuesta);
        
        
        //(String usuario, String password, Date fechaNacimiento, double saldoInicial )
        
    }
    
}
