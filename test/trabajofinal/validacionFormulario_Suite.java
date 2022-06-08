/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Michelle
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({trabajofinal.validacionFormularioTestBasico.class,
    trabajofinal.validacionFormularioTestBeforeAfter.class,
    trabajofinal.validacionFormularioTestBeforeAfterClass.class,
    trabajofinal.validacionFormularioParametrizadasTest.class })
public class validacionFormulario_Suite {
    
}
