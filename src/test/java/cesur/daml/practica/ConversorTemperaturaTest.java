package cesur.daml.practica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Clase de pruebas para ConversorTemperatura.
 */
class ConversorTemperaturaTest{

    // Instanciamos la clase que vamos a probar
    ConversorTemperatura conversor = new ConversorTemperatura();

    @Test
    @DisplayName("0ºC debe ser 32.0ºF")
    void testCelsiusAFahrenheitCero() {
        double esperado = 32.0;
        double real = conversor.celsiusAFahrenheit(0.0);
        // Comprobamos el resultado. El 0.001 es el margen de error permitido.
        assertEquals(esperado, real, 0.001);
    }
}