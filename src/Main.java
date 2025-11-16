import java.util.Scanner;

public class Main {

    public static float Dollars(float grn, float rate) {
        return grn / rate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float Dollar = 37f;
        float Euro = 40f;
        float Funt = 46f;

        System.out.println("Вас приветствует конвертер валют!");
        System.out.println("Выберите валюту:");
        System.out.println("(1) Доллар");
        System.out.println("(2) Евро");
        System.out.println("(3) Фунт");

        int value = scanner.nextInt();

        System.out.println("Введите количество ваших грн:");
        float grn = scanner.nextFloat();

        float result = 0;

        if (value == 1) {
            result = Dollars(grn, Dollar);
            System.out.println("Ваши " + grn + " = " + result + " долларов");
        } else if (value == 2) {
            result = Dollars(grn, Euro);
            System.out.println("Ваши " + grn + " = " + result + " евро");
        } else if (value == 3) {
            result = Dollars(grn, Funt);
            System.out.println("Ваши " + grn + " = " + result + " фунтов");
        } else {
            System.out.println("Неверный выбор валюты!");
        }
    }
}

// коментар для другого комміту :з