/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajofinal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/**
 *
 * @author javie
 */
public class validacionFormulario {
    private String usuario;
    private String password;
    private String fechaNacimiento;
    private double saldoInicial;
    
    public validacionFormulario(String usuario, String password, String fechaNacimiento, double saldoInicial ) {
        this.usuario = usuario;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
        this.saldoInicial = saldoInicial;
    }

    validacionFormulario() {
    }

    
    public String validacionRegistro () throws ParseException {
        String sResultado = "Registro completado de forma correcta";
        
        
        // Por hacer, configurar la lógica de comprobación de formulario correcto
        // en función a los mensajes de respuesta que se presentan en el enunciado.
        
        // Usuario
            if (usuario.length() < 5) {
                sResultado = "E4 Registro no permitido por cadena de usuario propuesta no válida: Longitud";
                return sResultado;
            }
            
            if (usuario.substring(0, 1).matches("[0-9]")) {
                sResultado = "E4 Registro no permitido por cadena de usuario propuesta no válida: Primer carácter no válido";
                return sResultado;
            }
            
            boolean alfa = Pattern.matches("^[a-zA-Z0-9]*$", usuario);
            if (!alfa) {
                sResultado = "E4 Registro no permitido por cadena de usuario propuesta no válida: Formato incorrecto";
                return sResultado;
            } 

        // Password
        if (!(password.length() > 6 && password.length() <10)) {
                sResultado = "E3 Registro no permitido por contraseña incorrecta: Longitud";
                return sResultado;
            }
        alfa = Pattern.matches("^[a-zA-Z0-9]*$", password);
        if (!alfa) {
                sResultado = "E3 Registro no permitido por contraseña incorrecta: Formato";
                return sResultado;
            } 
        
        // Mayor de Edad
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date firstDate = sdf.parse(fechaNacimiento); 
        Date secondDate = sdf.parse("27/05/2022"); // Consideraremos esta fecha como la fecha actual del sistema.

        long diff = secondDate.getTime() - firstDate.getTime();
        TimeUnit time = TimeUnit.DAYS;
        long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
        
        long anyos = diffrence / 365; 
        
        if (anyos < 18 ) {
            sResultado = "E1 Registro no permitido a menores de edad.";
            return sResultado;
        }
        
        // Saldo Inicial
         if (saldoInicial < 50.00) {
                sResultado = "Registro completado de forma correcta";
                return sResultado;
            } else {
             sResultado = "E2 Registro no permitido por saldo superior a 50,00 €.";
             return sResultado;
         }
    
        
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
    
}
