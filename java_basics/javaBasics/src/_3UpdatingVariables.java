//🔶 Sesion 3 updaing variables
public class _3UpdatingVariables {
    public static void main(String[] args){
        int salary = 1000;
        //Bono 200
        salary += 200;
        System.out.println(salary); //1200
        // Descuento pension 50
        salary = salary - 50;
        System.out.println(salary); //1150

        //2 horas extra
        salary = salary + (30*2) - 45; //1165
        System.out.println(salary);

        //Actualizando strings
        String employeeName = "Oscar Eduardo";
        employeeName += " Gonzalez";
        System.out.println("Mi nombre es " + employeeName);
    }
}