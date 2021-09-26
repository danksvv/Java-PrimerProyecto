public class Manipula_Cadenas {
    public static void main(String[] args) {

        String nombre = "Daniel";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre tiene " + nombre.length() + " caracteres.");
        System.out.println("Mi nombre " + nombre + " empieza con la letra es " + nombre.charAt(0));
        System.out.println("Mi nombre " + nombre + " termina con la letra es " + nombre.charAt(nombre.length() - 1));
    }
}
