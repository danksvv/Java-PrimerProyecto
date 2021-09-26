import java.util.Scanner;

public class Adivinar_Numero {
    public static void main(String[] args) {
        // Como vamos a jugar con números, usaremos directamente la clase Scanner
        Scanner numero = new Scanner(System.in);
        // Math.random() nos da valores decimales entre 0 y 1, devolviendo un doble
        // para acotar el rango, multiplicamos entre 100 para que nos devuelva valores entre 0-100
        // y haremos un casting int para almancenarlo como un entero
        int aleatorio = (int)(Math.random()*100);
        int valor;
        int intentos = 0;
        do{
            // Al entrar al bucle empieza a contar las veces que vamos a intentarlo
            intentos++;
            System.out.println("Adivina el número, introduce un valor entre 1-100 : ");
            valor = numero.nextInt();
            // Iremos avisando al usuario si el valor es mayor o menor al que tiene que adivinar
            if(aleatorio > valor)
                System.out.println("Introduce un valor mas alto ...");
            else if(aleatorio < valor)
                System.out.println("Introduce un valor mas bajo...");
            // Si no coinciden el valor random y el introducido por teclado, continua con el bucle
        }while(aleatorio != valor);

        System.out.println("Felicidades has adivina el número en " + intentos + " intentos");
    }
}
