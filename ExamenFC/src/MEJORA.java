import java.util.Scanner;
public class MEJORA {
    public static void main() {
        Scanner lector = new Scanner(System.in);
        int puntuacionT;
        System.out.println("AÑADE LA PUNTUACION SACADA DEL POSTULANTE");
        puntuacionT = lector.nextInt();
        switch (puntuacionT) {
            case 0,1,2,3,4:
                System.out.println("DESCARTADO");
                break;
            case 5:
                System.out.println("EN SUSPENCION");
                break;
            case 6:
                System.out.println("ACEPTABLE");
                break;
            case 7,8:
                System.out.println("notable");
                break;
            case 9,10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("error en poner puntuacion");

        }
    }
}