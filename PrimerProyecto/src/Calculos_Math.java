public class Calculos_Math {
    public static void main(String[] args) {

        double base = 5;
        double exponente = 3;
        // El metodo pow nos devuelve un valor double, y si requerimos una valor entero, refundimos
        int resultado = (int)Math.pow(base, exponente);
        System.out.println("El " + base + " elevado a " + (int)exponente + " es " + resultado);
    }
}
