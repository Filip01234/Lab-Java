public class MiddleCharacter {
    public static void main(String[] args) {
        String cuvant = "masina";
        String mijloc = caracterulMijloc(cuvant);
        System.out.println("Caracterul/caracterele din mijloc: " + mijloc);
    }

    public static String caracterulMijloc(String cuvant) {
        int lungime = cuvant.length();
        if (lungime % 2 == 0) {
            // Cazul cu un număr par de litere
            int mijlocDreapta = lungime / 2;
            int mijlocStanga = mijlocDreapta - 1;
            return cuvant.substring(mijlocStanga, mijlocDreapta + 1);
        } else {
            // Cazul cu un număr impar de litere
            int mijloc = lungime / 2;
            return String.valueOf(cuvant.charAt(mijloc));
        }
    }
}
