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

        // System.out.println(androidVersions); // [Ljava.lang.String;@7344699f
        // System.out.println(Arrays.toString(androidVersions)); // 🔸 [Apple Pie,
        // Banana bread, Cupcake, Donut, null...]

        for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(androidVersions[i]); // "cupcake"
        }

        System.out.println();
        System.out.println("** Sin los null **");

        for (int i = 0; i < androidVersions.length; i++) {
            if (androidVersions[i] == null) {
                continue;
            }
            System.out.println(androidVersions[i]);
        }

        System.out.println();
        System.out.println("** For Each **");

        for (String androidVersion : androidVersions) {
            System.out.println(androidVersion);
        }

        System.out.println();
        System.out.println("** EJEMPLO **");

        // Llenando matrices
        // Funciona como coordenadas
        cities[0][0] = "Colombia";
        cities[1][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[0][1] = "Bogota";

        // ** For anidado **/
        for (int i = 0; i < cities.length; i++) { // El primer for recorre las filas o renglones
            for (int j = 0; j < cities[i].length; j++) { // El segundo recorre las columnas cities[i] es en si otro
                                                         // array
                System.out.println(cities[i][j]);
            }
        }
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

        System.out.println();
        System.out.println("** for each anidado **");
        for (String[] pair : cities) {
            for (String name : pair) {
                System.out.println(name);
            }
        }

        System.out.println();
        System.out.println("** muchas dimensiones (monkey) **");

        // Ubicar al chango
        String[][][][] animals = new String[2][3][2][2]; // Se define las longitudes del array
        animals[1][0][0][1] = "monkey";

        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = 0; k <= 0; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
    }
}
