import javax.swing.*;

public class Simple_Autenticacion {
    public static void main(String[] args) {

        String clave = "temporal";
        String passwd = "";
        // La primera validación sera falsa, ya que nos devolvera false
        // al agregar el ! negamos el false y lo hacemos true para que entre a nuestro while
        // cuando la validación sea correcta, será true pero al negarlo sera falso y sale del while
        while(!clave.equals(passwd)){
            passwd = JOptionPane.showInputDialog("Introduce la clave de acceso : ");
            if(clave.equals(passwd) == false)
                System.out.println("Password Incorrecta, Introduce la password correcta...");
        }
        System.out.println("Acceso correcto!");
    }
}
