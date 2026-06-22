import java.util.Scanner;
public class PuntajeExamenFC {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int tipoE;
        int notaE;
        int FC = 0;
        int Fs = 0;
        System.out.println("Ingresa el tipo de examen");
        System.out.println("1.- virtual");
        System.out.println("2.- Presencial");
        System.out.println("-----------------");
        tipoE = lector.nextInt();
        System.out.println("Ingrese nota obtenida");
        notaE = lector.nextInt();

        switch (tipoE){
            case 1:
                if (notaE >= 10 && notaE <= 12) {
                    FC = notaE*5;
                }
                else if (notaE >= 13 && notaE <= 15){
                    FC = notaE*8;
                }
                else if (notaE >= 16 && notaE <= 18){
                    FC = notaE*12;
                }
                else if (notaE >= 17 && notaE <= 20){
                    FC = notaE*15;
                }
                else if (notaE >= 1 && notaE <= 9) {
                    System.out.println("CASTIGO: CARTA NEGRA");
                    System.out.println("estudia sonso");
                }
                break;
            case 2:
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


        }
        System.out.println("tus puntos totales "+FC);

    }
}

//colocar el nombre del curso donde se recibe punto

// colocar un bucle donde pueda pedir cuantos cursos si es que es mas de uno y
// que tal vez colocar el total de los 2 cursos etc