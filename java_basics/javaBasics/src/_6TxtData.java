//🔶 Sesion 6 char & var
public class _6TxtData {
    public static void main(String[] args) {
        
        /* char: Ocupa 2 bytes y solo puede almacenar 1 dígito, se usa con comilla simple ''
        boolean: Son un tipo de dato lógico (true, false) */
        char letter = 'n';

        /* Desde java 10 puedo dejar de usar el tipo de dato (int, String, etc)
        Y puedo empezar a usar la palabra reservada var */
        var salary = 1000; // INT
        var pension = salary * 0.03; // DOUBLE
        var totalSalary = salary - pension; // DOUBLE

        var employeeName = "Oscar Gonzalez";
        System.out.println("Empleado: " + employeeName + " Salary: " + totalSalary);

    }
}