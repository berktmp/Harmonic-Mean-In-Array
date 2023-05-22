public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};  // Array of numbers
        int sum = 0;                     // Variable to store the sum of numbers
        double harmonic = 0.0;           // Variable to store the harmonic mean

        // Calculate the sum of numbers
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Average: " + sum / numbers.length);

        // Calculate the harmonic mean of numbers
        for (double j = 1; j <= numbers.length; j++) {
            harmonic += (1 / j);
        }
        System.out.println("Harmonic Mean: " + harmonic);
    }
}
