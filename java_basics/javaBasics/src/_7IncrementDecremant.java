//🔶 Sesion 7 Increment - decrement
public class _7IncrementDecremant {
    public static void main(String[] args) {
        int lives = 5;
        // lives = lives -1
        lives -= 1;
        System.out.println(lives); // 4

        lives--;
        System.out.println(lives); // 3

        lives++;
        System.out.println(lives); // 4

        // posfijo Accede al dato de la variable sin tener en cuenta los operadores de
        // incremento
        // int gift = 100 + lives++; // 104 👆
        System.out.println(lives); // 5
        // prefija primero hace el incremento u luego accede al dato de la variable
        int gift = 100 + ++lives; // 105
        System.out.println(gift);

    }
}