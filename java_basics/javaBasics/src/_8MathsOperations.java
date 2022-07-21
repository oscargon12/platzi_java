//🔶 Sesion 8 Mathemathics operations & methods
public class _8MathsOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //ceil toma un entero y lo redondea haca arriba
        System.out.println(Math.ceil(x)); //3.0

        //floor toma un entero y lo redondea haca abajo
        System.out.println(Math.floor(x)); // 2.0

        //Pow devuelve un numero elevado al otro
        System.out.println(Math.pow(x, y)); //9.261000000000001 

        //Encuentr ael numero mayor
        System.out.println(Math.max(x, y)); //3.0

        //Raix cuadrada
        System.out.println(Math.sqrt(y)); //1.7320508075688772

        //Area de un circulo pi * radio ** 2
        System.out.println(Math.PI * Math.pow(y, 2)); //28.274333882308138

        //Area de una esfera: 4 * PI * rario ** 2
        System.out.println(4 * Math.PI * Math.pow(y, 2)); //113.09733552923255

        //Volumen de una esfera (4/3)*PI * radio ** 3
        System.out.println((4/3) * Math.PI * Math.pow(y, 3)); //84.82300164692441 
    }
}