//🔶 Sesion 3 updaing variables
public class _3UpdatingVariables {
    public static void main(String[] args){
        int salary = 1000;
        //Bono 200
        salary += 200;
        System.out.println(salary);
        // Descuento pension 50
        salary = salary - 50;
        System.out.println(salary);

        //2 horas extra
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizando strings
        String employeeName = "Oscar Eduardo";
        employeeName += " Gonzalez";
        System.out.println("Mi nombre es " + employeeName);
    }
}