//🔶 Sesion 9 Casting & Exactitude
public class _9Casting {
    public static void main(String[] args) {
        //En un año cuide 30 perritos
        //Cuantos cuide al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //Estimacion
        int estimteMonhtlyDogs = (int) monthlyDogs;
        System.out.println(estimteMonhtlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println(a/b); //2 - Como se dividen 2 int, el resultado es int
        System.out.println((double) a/b); //2.5  -  Se castea con el double, devuelve flotante

        double c = a/b; //2.0  -  El tipo de dato es float, pero hace la operacion como int
        double d = (double) a/b; //2.5  -  Forsa a cumplir el casteo con double

        System.out.println(c); 
        System.out.println(d);

        //Char si cabe en int
        char n = '1';
        int nI = n;

        System.out.println(nI);

        //char no cabe en short, obliga a crear un casting
        short nS = (short) n;
        System.out.println(nS);
    }
}