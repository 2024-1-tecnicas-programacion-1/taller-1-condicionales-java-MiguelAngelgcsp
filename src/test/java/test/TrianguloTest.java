package test;

import ejercicios.Triangulo;
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
public class TrianguloTest {
    @Test
    public void testNoEsUnTrianguloValido() {
        String valorEsperado = "No es un triangulo valido";
        String valorActual = Triangulo.evaluar(3.9, 6.0, 1.2);
        assertEquals(valorEsperado, valorActual);
    }
    
    // TODO: Agrega tus otros casos de prueba aquí
    
    public void testequilatero() {
        String valorEsperado = "El triangulo es equilatero";
        String valorActual = Triangulo.evaluar(3, 3, 3);
        assertEquals(valorEsperado, valorActual);
    }
    public void testisoceles() {
        String valorEsperado = "El triangulo es isoceles";
        String valorActual = Triangulo.evaluar(1.9, 2, 2);
        assertEquals(valorEsperado, valorActual);
    }
    public void testescaleno() {
        String valorEsperado = "El triangulo es escaleno";
        String valorActual = Triangulo.evaluar(3.0, 5.0, 4.0);
        assertEquals(valorEsperado, valorActual);
    }
        
        
        
        
}
