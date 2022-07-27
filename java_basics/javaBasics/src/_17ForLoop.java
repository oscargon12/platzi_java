public class _17ForLoop {
    static boolean isTurnOnLight = false; // 1. lampara inicia apagada

    public static void main(String[] args) {
        turnOnOffLight(); // 4. llamo la funcion que prende

        // 5. define el ciclo, previo valido si lampara está prendida
        if (isTurnOnLight) {
            for (int i = 0; i <= 10; i++) {
                printSOS();
            }
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
