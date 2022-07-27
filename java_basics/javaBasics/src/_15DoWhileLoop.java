import java.util.Scanner;

public class _15DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("Ingresa una opción");
            System.out.println("1 para Pelis");
            System.out.println("2 para series");
            System.out.println("0 para salir");

            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Elegiste películas");
                    break;
                case 2:
                    System.out.println("Elegiste series");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
            }

        } while (option != 0); // Si la respuesta es diferente de cero, el ciclo sigue
        // Hasta que sea igual a cero, se acaba el ciclo

        System.out.println("Programa terminado");
    }
}
