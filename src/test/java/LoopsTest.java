import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoopsTest {
    private final Loops loops = new Loops();

    @Test
    @Order(1)
    @DisplayName("Reto 1: Suma de elementos con while")
    void testSumArrayWhile() {
        assertEquals(24, loops.sumArrayWhile(), "Reto 1: La suma calculada no es correcta. Asegúrate de usar while y acumular en 'sum'.");
    }

    @Test
    @Order(2)
    @DisplayName("Reto 2: Contar números pares con do-while")
    void testCountEvensDoWhile() {
        assertEquals(4, loops.countEvensDoWhile(), "Reto 2: El conteo de números pares no es correcto. Usa un do-while y comprueba cada elemento.");
    }

    @Test
    @Order(3)
    @DisplayName("Reto 3: Primer número mayor que 50 con do-while")
    void testFirstGreaterThan50DoWhile() {
        assertEquals(51, loops.firstGreaterThan50DoWhile(), "Reto 3: No has devuelto el primer número > 50. Recorre con do-while y detente al encontrarlo.");
    }

    @Test
    @Order(4)
    @DisplayName("Reto 4: Factorial con while")
    void testFactorialWhile() {
        assertEquals(720L, loops.factorialWhile(), "Reto 4: El factorial de 6 debe ser 720. Usa while y multiplica correctamente.");
    }

    @Test
    @Order(5)
    @DisplayName("Reto 5: Concatenar palabras con for-each")
    void testConcatWordsForEach() {
        assertEquals("Java es genial", loops.concatWordsForEach(), "Reto 5: La frase no coincide. Usa for-each y controla los espacios.");
    }

    @Test
    @Order(6)
    @DisplayName("Reto 6: Buscar palabra con for-each")
    void testContainsWordForEach() {
        assertTrue(loops.containsWordForEach(), "Reto 6: Debes devolver true porque 'azul' está en el array. Usa for-each y corta cuando la encuentres.");
    }

    @Test
    @Order(7)
    @DisplayName("Reto 7: Suma de cuadrados con for-each")
    void testSumSquaresForEach() {
        assertEquals(29, loops.sumSquaresForEach(), "Reto 7: La suma de cuadrados (2^2 + 3^2 + 4^2) debe ser 29. Usa for-each.");
    }
}

