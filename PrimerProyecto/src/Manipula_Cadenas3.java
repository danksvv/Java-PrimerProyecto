public class Manipula_Cadenas3 {
    public static void main(String[] args) {

        String alumno1, alumno2, alumno3;
        alumno1 = "David";
        alumno2 = "David";
        alumno3 = "david";
        boolean valor1 = alumno1.equals(alumno2);
        boolean valor2 = alumno1.equals(alumno3);
        boolean valor3 = alumno1.equalsIgnoreCase(alumno3);
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
    }
}
