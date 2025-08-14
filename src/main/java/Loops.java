public class Loops {
    /**
     * Reto 1: Suma de elementos con while
     * Usa un bucle while para recorrer el array "numbers" y sumar todos sus elementos.
     * No cambies los valores del array.
     * Crea una variable llamada "sum" donde acumules el resultado y devuélvela.
     *
     * Resultado esperado: 24
     */
    public int sumArrayWhile() {
        int[] numbers = {4, 6, 9, 5};
        // Tu código aquí (usa while)
        // consejo: declara la variable "sum" fuera del loop
        return 0; // Sustituye el 0 por la variable sum
    }

    /**
     * Reto 2: Contar números pares con do-while
     * Usa un bucle do-while para contar cuántos números pares hay en el array.
     * No modifiques el array "numbers".
     * Crea una variable llamada "count" y devuélvela.
     *
     * Resultado esperado: 4
     */
    public int countEvensDoWhile() {
        int[] numbers = {1,2,3,4,5,6,7,8};
        // Tu código aquí (usa do-while)
        return 0; // Sustituye el 0 por count
    }

    /**
     * Reto 3: Primer número mayor que 50 con do-while
     * Usa un bucle do-while para encontrar el PRIMER número estrictamente mayor que 50.
     * Debes recorrer el array en orden y parar cuando lo encuentres.
     * Si lo encuentras, guarda el valor en una variable llamada "result" y devuélvela.
     * No modifiques el array.
     *
     * Resultado esperado: 51
     */
    public int firstGreaterThan50DoWhile() {
        int[] numbers = {10, 25, 50, 51, 60};
        // Tu código aquí (usa do-while)
        return -1; // Sustituye -1 por result
    }

    /**
     * Reto 4: Factorial con while
     * Calcula el factorial del número n usando un bucle while.
     * n = 6. (Factorial de 6 = 720)
     * Crea una variable llamada "factorial" (tipo long) e inicialízala correctamente.
     * Factorial significa multiplicar todos los números desde 1 hasta n.
     *
     * Resultado esperado: 720 (1 * 2 * 3 * 4 * 5 * 6 = 720)
     */
    public long factorialWhile() {
        int n = 6;
        // Tu código aquí (usa while)
        return 0L; // Sustituye 0L por factorial
    }

    /**
     * Reto 5: Concatenar palabras con for-each
     * Usa un bucle for-each para construir una frase con las palabras del array separadas por un espacio.
     * No debe quedar un espacio al final.
     * Guarda el resultado en una variable llamada "sentence" y devuélvela.
     *
     * Resultado esperado: "Java es genial"
     */
    public String concatWordsForEach() {
        String[] words = {"Java", "es", "genial"};
        // Tu código aquí (usa for-each)
        return ""; // Sustituye "" por sentence
    }

    /**
     * Reto 6: Buscar palabra con for-each
     * Usa un bucle for-each para comprobar si la palabra almacenada en "target" existe en el array.
     * Si la encuentras, asigna true a una variable llamada "found" y deja de buscar.
     * Devuelve esa variable.
     *
     * Resultado esperado: true
     */
    public boolean containsWordForEach() {
        String[] colors = {"rojo", "verde", "azul", "amarillo"};
        String target = "azul";
        // Tu código aquí (usa for-each)
        return false; // Sustituye false por found
    }

    /**
     * Reto 7: Suma de cuadrados con for-each
     * Usa un bucle for-each para sumar el cuadrado de cada número del array.
     * Guarda el resultado en una variable llamada "sumSquares" y devuélvela.
     *
     * El símbolo ^ representa la potencia, por lo que:
     * numbers = {2,3,4} -> 2^2 + 3^2 + 4^2 = 4 + 9 + 16 = 29
     * Resultado esperado: 29
     */
    public int sumSquaresForEach() {
        int[] numbers = {2,3,4};
        // Tu código aquí (usa for-each)
        return 0; // Sustituye 0 por sumSquares
    }

    public static void main(String[] args) {
        // Puedes probar tus métodos aquí si quieres.
    }
}
