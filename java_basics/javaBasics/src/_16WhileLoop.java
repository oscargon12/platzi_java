public class _16WhileLoop {

    static boolean isTurnOnLight = false; // 1. lampara inicia apagada

    public static void main(String[] args) {
        turnOnOffLight(); // 4. llamo la funcion que prende

        // 5. define el ciclo
        int i = 1;
        while (isTurnOnLight && i <= 10) { // Si la lampara esta prendida y las iteraciones son menores o iguales a 10
            printSOS(); // imprima el mensaje
            i++; // incremente de auno
        }
    }

    // 2. funcion que imprime el mensaje de ayuda
    public static void printSOS() {
        System.out.println("...---...");
    }

    // 3. función para prender la lampara
    public static boolean turnOnOffLight() {
        isTurnOnLight = (isTurnOnLight) ? false : true;
        return isTurnOnLight;
    }
}
