import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random(1000); // Начальное значение 1000

        System.out.println("50 случайных чисел между 0 и 100:");
        for (int i = 0; i < 50; i++) {
            System.out.println(random.nextInt(100)); // Случайное число от 0 до 99
        }
    }
}