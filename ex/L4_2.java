public class SumOfDigits {
    public static void main(String[] args) {
        int numar = 254;
        int sumaCifrelor = calculSumaCifrelor(numar);
        System.out.println("Suma cifrelor este: " + sumaCifrelor);
    }

    public static int calculSumaCifrelor(int numar) {
        int suma = 0;

        while (numar != 0) {
            suma += numar % 10; // Obține ultima cifră și adaugă la suma
            numar /= 10; // Elimină ultima cifră
        }

        return suma;
    }
}
