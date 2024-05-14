import java.util.Scanner;

public class Buyer {
    public int capital;

    public Buyer(int capital) {
        this.capital = capital;
    }

    // Метод для пошуку доступних мотоциклів за ціною
    void findMotoByPrice(Transport[] motos) {
        int count = 0;
        // Підрахунок кількості доступних мотоциклів
        for (Transport moto : motos) {
            if (moto.price <= capital) {
                count++;
            }
        }
        // Якщо немає доступних мотоциклів
        if (count == 0) {
            System.out.println("Мотоцикла з ціною до " + capital + " € не знайдено. ");
        }
        // Якщо доступний тільки один мотоцикл
        else if (count == 1) {
            for (Transport moto : motos) {
                if (moto.price <= capital) {
                    System.out.println("Мотоцикл, який ви можете придбати:");
                    moto.bikeInfo();
                    return; // Припинення виконання методу після виведення інформації про мотоцикл
                }
            }
        }
        // Якщо доступно декілька мотоциклів
        else {
            System.out.println("Мотоцикли, які ви можете придбати:");
            int number = 1;
            // Виведення номерів та назв мотоциклів
            for (Transport moto : motos) {
                if (moto.price <= capital) {
                    System.out.println(number + ". " + moto.name);
                    number++;
                }
            }
            // Пропозиція вибрати мотоцикл за номером
            System.out.println("\nВиберіть номер мотоцикла, який бажаєте придбати:");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            // Виведення інформації про обраний мотоцикл
            if (choice >= 1 && choice <= count) {
                System.out.println("Ви обрали мотоцикл:");
                motos[choice - 1].bikeInfo();
            } else {
                System.out.println("Неправильний вибір. Спробуйте ще раз.");
            }
        }
    }
}
