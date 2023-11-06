public class PalindromeChecker {
    public static void main(String[] args) {

        String cuvant = "rotor";

        if (estePalindrom(cuvant)) {
            System.out.println(cuvant + " este un palindrom.");
        } else {
            System.out.println(cuvant + " nu este un palindrom.");
        }
    }

    public static boolean estePalindrom(String cuvant) {

        cuvant = cuvant.replaceAll("\\s", "").toLowerCase();

        int lungime = cuvant.length();
        for (int i = 0; i < lungime / 2; i++) {
            if (cuvant.charAt(i) != cuvant.charAt(lungime - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
