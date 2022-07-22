public class _14Functions {
    public static void main(String[] args) {
        double circle1 = circleArea(3); // 🔸 Llamando a la función
        System.out.println(circle1);

        double sphere1 = sphereArea(3); // 🔹
        System.out.println(sphere1);

        double convert1 = convertToDollar(1000, "COP");
        System.out.println(convert1);
    }

    // Creando la funcion
    public static double circleArea(double ratio) { // 🔸
        double calcArea = Math.PI * Math.pow(ratio, 2);
        return calcArea;
    }

    public static double sphereArea(double ratio) { // 🔹
        double calcSphereArea = 4 * Math.PI * Math.pow(ratio, 2);
        return calcSphereArea;
    }

    public static double convertToDollar(double quantity, String currency) {

        switch (currency) {
            case "MXN":
                quantity *= 0.049;
                break;
            case "COP":
                quantity *= 0.00023;
                break;
        }
        return quantity;
    }
}
