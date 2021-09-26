import javax.swing.*;

public class Entrada_Datos3 {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Introduce un valor numérico : ");
        double num1 = Double.parseDouble(valor);
        System.out.println("La raíz cuadrada de " + valor + " es " + Math.sqrt(num1));
        // Otro mono de imprimir es el texto con formato es con la clase de NumberFormat
        // para poder dar el formato correcto en el texto:
        // - %s -> cadena
        // - %d -> entero
        // - %.2f -> decimal
        System.out.printf("La raíz cuadrada de %s ", valor);
        System.out.printf( " es %1.2f", Math.sqrt(num1));
    }
}
