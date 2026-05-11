/**
 * =====================================================
 *  PRÁCTICA DE PRUEBAS - ENTORNOS DE DESARROLLO
 *  Proyecto: Conversor de Temperatura
 *  Nivel:    Medio ⭐⭐
 *  Estado:   Funciona correctamente
 * =====================================================
 *
 *  INSTRUCCIONES PARA EL ALUMNO:
 *  --------------------------------
 *  Diseña casos de prueba para cada método.
 *  Usa valores conocidos para verificar:
 *    · 0°C   = 32°F   = 273.15 K
 *    · 100°C = 212°F
 *    · -273.15°C = 0 K (cero absoluto)
 *
 *  Piensa también en:
 *    · ¿Qué pasa con valores negativos?
 *    · ¿La conversión de ida y vuelta da el mismo número?
 * =====================================================
 */
public class ConversorTemperatura {

    /**
     * Convierte grados Celsius a Fahrenheit.
     * Fórmula: F = (C × 9/5) + 32
     *
     * Ejemplo: 0°C → 32°F,  100°C → 212°F
     */
    public double celsiusAFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    /**
     * Convierte grados Fahrenheit a Celsius.
     * Fórmula: C = (F - 32) × 5/9
     *
     * Ejemplo: 32°F → 0°C,  212°F → 100°C
     */
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    /**
     * Convierte grados Celsius a Kelvin.
     * Fórmula: K = C + 273.15
     *
     * Ejemplo: 0°C → 273.15 K,  -273.15°C → 0 K
     */
    public double celsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }

    /**
     * Redondea un número a los decimales indicados.
     *
     * Ejemplo: redondear(3.14159, 2) → 3.14
     */
    public double redondear(double valor, int decimales) {
        double factor = Math.pow(10, decimales);
        return Math.round(valor * factor) / factor;
    }

    // -------------------------------------------------------
    // Método main para pruebas manuales en Eclipse
    // -------------------------------------------------------
    public static void main(String[] args) {
        ConversorTemperatura c = new ConversorTemperatura();

        System.out.println("0°C  → " + c.celsiusAFahrenheit(0)   + "°F  (esperado: 32.0)");
        System.out.println("100°C → " + c.celsiusAFahrenheit(100) + "°F  (esperado: 212.0)");
        System.out.println("32°F  → " + c.fahrenheitACelsius(32)  + "°C  (esperado: 0.0)");
        System.out.println("0°C  → " + c.celsiusAKelvin(0)        + " K  (esperado: 273.15)");
        System.out.println("Redondeado: " + c.redondear(3.14159, 2) + "  (esperado: 3.14)");
    }
}
