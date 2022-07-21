public class _11LogicOperators {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        // Operadores de asignacion
        System.out.println("A es igual a B: " + (a == b)); // false
        System.out.println("A es igual a B: " + (a != b)); // Not equal True

        // Operadores relacionales
        System.out.println("A es mayor a B: " + (a > b)); // True
        System.out.println("A es menor a B: " + (a < b)); // False
        System.out.println("A es mayor o igual a B: " + (a >= b)); // True
        System.out.println("A es menor o igual a B: " + (a <= b)); // False

        if (a == b) {
            System.out.println("a es igual a b");
        } else if ((a != b) && (a < b)) {
            System.out.println("a NO es igual a b"); // True
        } else if (a > b) {
            System.out.println("a es mayor a b"); // True
        } else if (a < b) {
            System.out.println("a es menor que b");
        } else if (a <= b) {
            System.out.println("a es menor o igual que b");
        } else if (a < b) {
            System.out.println("a es menor o igual que b"); // True
        }

    }
}
