public class PotenciaRecursiva {
    public static void main(String[] args) {
        int base = 2;
        int exponente = 3;

        System.out.println("El resultado de " + base + " elevado a la potencia de " + exponente + " es: " + potencia(base, exponente));
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

}
