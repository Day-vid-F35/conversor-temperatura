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
    @Test
    @DisplayName("100ºC debe ser 212.0ºF (Ebullición)")
    void testCelsiusAFahrenheitEbullicion() {
        assertEquals(212.0, conversor.celsiusAFahrenheit(100.0), 0.001);
    }

    @Test
    @DisplayName("-40ºC debe ser -40.0ºF (Punto de cruce)")
    void testCelsiusAFahrenheitNegativo() {
        assertEquals(-40.0, conversor.celsiusAFahrenheit(-40.0), 0.001);
    }

    @Test
    @DisplayName("37ºC debe ser 98.6ºF (Temperatura corporal)")
    void testCelsiusAFahrenheitCorporal() {
        assertEquals(98.6, conversor.celsiusAFahrenheit(37.0), 0.001);
    }

    @Test
    @DisplayName("25ºC debe ser 77.0ºF (Clima templado)")
    void testCelsiusAFahrenheitTemplado() {
        assertEquals(77.0, conversor.celsiusAFahrenheit(25.0), 0.001);
    }

    @Test
    @DisplayName("-15ºC debe ser 5.0ºF (Clima muy frío)")
    void testCelsiusAFahrenheitFrio() {
        assertEquals(5.0, conversor.celsiusAFahrenheit(-15.0), 0.001);
    }

    @Test
    @DisplayName("10ºC debe ser 50.0ºF")
    void testCelsiusAFahrenheitDiez() {
        assertEquals(50.0, conversor.celsiusAFahrenheit(10.0), 0.001);
    }

    @Test
    @DisplayName("50ºC debe ser 122.0ºF")
    void testCelsiusAFahrenheitCincuenta() {
        assertEquals(122.0, conversor.celsiusAFahrenheit(50.0), 0.001);
    }
    
}