public class Manipula_Cadenas3 {
    public static void main(String[] args) {

        String alumno1, alumno2, alumno3;
        alumno1 = "David";
        alumno2 = "David";
        alumno3 = "david";

        System.out.println(alumno1.equals(alumno2));
        System.out.println(alumno1.equals(alumno3));
        System.out.println(alumno1.equalsIgnoreCase(alumno3));
    }
}
