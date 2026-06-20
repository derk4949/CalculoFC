import java.util.Scanner;
public class PuntajeExamenFC {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int notaE;
        int FC = 0;
        System.out.println("Ingresa una nota");
        notaE = lector.nextInt();


        if (notaE >= 10 && notaE <= 12) {
            FC = notaE*10;
        }
        else if (notaE >= 13 && notaE <= 15){
            FC = notaE*12;
        }
        else if (notaE >= 16 && notaE <= 18) {
            FC = notaE * 18;
        }
        else if (notaE >= 19 && notaE <= 20){
            FC = notaE * 25;
        }
        else if (notaE >= 1 && notaE <= 9) {
            System.out.println("CASTIGO: CARTA NEGRA");
            System.out.println("estudia sonso");
        }
        System.out.println("tus puntos totales "+FC);
    }
}

