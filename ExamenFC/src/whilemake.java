import java.util.Scanner;

public class whilemake {
    static void main(String[] args) {
        //generar un sistma que pida la edad de alguien y diga si es mayor o
        // menor y si indica un numero negativo volver a pedirle
        Scanner lector = new Scanner(System.in);
        int edad;
        int control = 3;
        System.out.println("ingrese su edad");
        edad = lector.nextInt();
        while (edad < 0 && control > 0){
            System.out.println("Valor incorrecto, Vuelve a intentarlo");
            edad = lector.nextInt();
            control = control-1;
            System.out.println("TE QUEDA = "+ control+ " INTENTOS");
        }
        if (edad < 0){
            System.out.println("SE TE ACABARON LOS INTENTOS");
        }
        else {
            System.out.println("edad ingresada es "+edad);

            if (edad >= 18 && edad <= 100) {
                System.out.println("edad = " + edad + " , es valido para el ingreso");
            } else if (edad<= 17){
                System.out.println("largate mocoso");
            } else {
                System.out.println("a chistoso te crees");

            }
        }


    }
}
