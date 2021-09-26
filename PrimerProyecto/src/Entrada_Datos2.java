import javax.swing.*;

public class Entrada_Datos2 {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Introduce tu nombre, por favor : ");
        String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor : ");
        // La Clase JOptionPane y su método showInputDialog nos devuelve un valor String,
        // pero como edad es un valor entero, tenemos que transformar el valor con la clase Integer
        // y su método parseInt que recibe un String para transformarlo a entero.
        // a partir de ahi el valor que se guarde será de tipo entero y podremos operar con él.
        int usuario_edad = Integer.parseInt(edad);
        System.out.println("Tu nombre es " + nombre + " y tu edad es " + usuario_edad);
    }
}
