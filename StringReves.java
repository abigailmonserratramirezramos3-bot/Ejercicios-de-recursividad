public class StringReves {
    public static void main(String[] args) {
        String texto = "Sistemas";

        System.out.println("El texto original es: " + texto);
        System.out.println("El texto invertido es: " + invertirCadena(texto));
    }

    public static String invertirCadena(String texto) {
        if (texto == null || texto.length() <= 1) {
            return texto;
        }

        return texto.charAt(texto.length() - 1)
                + invertirCadena(texto.substring(0, texto.length() - 1));
    }
}
