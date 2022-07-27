import java.lang.reflect.Array;
import java.util.Arrays; // 🔸 requerido para imprimir arrays

public class _18Arrays {
    public static void main(String[] args) {

        // Se pueden declarar así
        String[] androidVersions = new String[18];

        // O se pueden declarar así
        String iOsVersions[] = new String[14];

        // Matrices
        String[][] cities = new String[4][2]; // 4filas, 2 columnas 👇🏻

        /*
         * --------------------------
         * |Country | City |
         * --------------------------
         * | Colombia | Bogotá |
         * | Colombia | Medellín |
         * | México | CMDX |
         * | México | Guadalajara |
         * --------------------------
         */

        // ** Insertando valores **
        // indice = n-1 (1er elemento => posición 0)
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println(androidVersions); // [Ljava.lang.String;@7344699f
        System.out.println(Arrays.toString(androidVersions)); // 🔸 [Apple Pie, Banana bread, Cupcake, Donut, null...]
        System.out.println(androidVersions[2]); // "cupcake"

        System.out.println("**  **");

        // Llenando matrices
        // Funciona como coordenadas
        cities[0][0] = "Colombia";
        cities[1][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[0][1] = "Bogota";

        System.out.println(Arrays.toString(cities));
        /*
         * --------------------------
         * |Country | City |
         * --------------------------
         * | Colombia | Bogotá |
         * | Colombia | Medellín |
         * | México | CMDX |
         * | México | Guadalajara |
         * --------------------------
         */

        // Ubicar al chango
        String[][][][] animals = new String[2][3][2][2]; // Se define las longitudes del array
        animals[1][0][0][1] = "monkey";

        System.out.println(animals[1][0][0][1]);
    }
}
