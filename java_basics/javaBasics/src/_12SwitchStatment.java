public class _12SwitchStatment {
    public static void main(String[] args) {
        String colorModeSelected = "Blue dark";

        switch (colorModeSelected) {
            case "Light":
                System.out.println("Activar modo light");
                break;
            case "Night":
                System.out.println("Activar modo Night");
                break;
            case "Blue dark":
                System.out.println("Activar modo Blue dark");
                break;
            case "Dark":
                System.out.println("Activar modo Dark");
                break;
            default: // Si ninguno funciona, se activa el default
                System.out.println("Selecciona un color");
        }
    }
}
