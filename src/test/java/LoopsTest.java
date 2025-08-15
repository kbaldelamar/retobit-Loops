import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoopsTest {

    @Test
    @Order(1)
    @DisplayName("Reto 1: Suma de elementos con while")
    void testSumArrayWhile() {
        assertEquals(24, Loops.sumArrayWhile(), "Reto 1: La suma calculada no es correcta. Asegúrate de usar while y acumular en 'sum'.");
    }

    @Test
    @Order(2)
    @DisplayName("Reto 2: Contar números pares con do while")
    void testCountEvenNumbersDoWhile() {
        assertEquals(3, Loops.countEvenNumbersDoWhile(), "Reto 2: El conteo de números pares no es correcto. Revisa el uso de do while y la variable 'count'.");
    }

    @Test
    @Order(3)
    @DisplayName("Reto 3: Máximo con for básico")
    void testFindMaxWithFor() {
        assertEquals(9, Loops.findMaxWithFor(), "Reto 3: El valor máximo esperado es 9. Asegúrate de actualizar 'max' correctamente en el for.");
    }
}
