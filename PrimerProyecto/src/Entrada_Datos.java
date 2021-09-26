import java.util.Scanner;

public class Entrada_Datos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        /*
        * Para la entrada de datos con la clase Scanner, tenemos que instancia o ejemplarizar
        * un objeto de la clase Scanner para poder trabajar con el; una vez que creamos el objeto
        * podemos usar sus métodos, en este caso usaremos el método nextLine y nextInt para recoger
        * los datos introducidos por teclado. Cada uno de los datos recogidos estarán definidos por el
        * tipo de valor que recoge cada método.
        * */
        System.out.println("Introduce tu nombre, por favor : ");
        String nombre = entrada.nextLine();
        System.out.println("Introduce tu edad, por favor : ");
        int edad = entrada.nextInt();
        System.out.println("Hola " + nombre + " tu edad es " + edad);
    }
}
