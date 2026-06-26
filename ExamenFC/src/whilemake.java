import java.util.Scanner;

public class whilemake {
    static void main(String[] args) {
        //generar un sistma que pida la edad de alguien y diga si es mayor o
        // menor y si indica un numero negativo volver a pedirle
        Scanner lector = new Scanner(System.in);
        int edad;
        System.out.println("ingrese su edad");
        edad = lector.nextInt();
        while (edad < 0){
            System.out.println("Valor incorrecto, Vuelve a intentarlo");
            edad = lector.nextInt();
        }
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
