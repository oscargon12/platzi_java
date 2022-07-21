//Sesion 10 if / else if
public class _10IfStatment {
    public static void main(String[] args) {

        boolean blueThootEnabled = false;
        int sendedFiles = 3;
        System.out.println("Archivos enviados antes del if: " + sendedFiles); // 3 archivos

        if (blueThootEnabled) {
            sendedFiles++;
            System.out.println("Se han enviado (" + sendedFiles + ") archivos, dentro del if"); // 4 archivos
        } else {
            sendedFiles--;
            System.out.println("Prender el bluethoot");
            System.out.println("Se han enviado (" + sendedFiles + ") archivos, dentro del if"); // 4 archivos
        }

        // Scope
        System.out.println("Archivos enviados después del if: " + sendedFiles); // 3 archivos por el scope
    }
}
