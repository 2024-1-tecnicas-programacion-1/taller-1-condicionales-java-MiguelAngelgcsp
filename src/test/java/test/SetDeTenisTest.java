package test;

import ejercicios.SetDeTenis;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenisTest {
    @Test
    public void testElresultadoesinvalido() 
    {
        String valorEsperado ="El resultado es invalido";
        String valorActual = SetDeTenis.evaluar(3,7);
        assertEquals(valorEsperado, valorActual);
    }        
    // TODO: Agrega tus otros casos de prueba aquí
    public void testAunnotermina()            
    {
        String valorEsperado = "Aun no termina";
        String valorActual = SetDeTenis.evaluar(4,5);
        assertEquals(valorEsperado, valorActual);
    } 
    public void testElganadoreselA() 
    {
        String valorEsperado = "El ganador es el A";
        String valorActual = SetDeTenis.evaluar(6,4);
        assertEquals(valorEsperado, valorActual);

    }
    public void testElganadoreselB() 
    {
        String valorEsperado = "El ganador es el B";
        String valorActual = SetDeTenis.evaluar(5,7);
        assertEquals(valorEsperado, valorActual);
    }
    
    
   
}
