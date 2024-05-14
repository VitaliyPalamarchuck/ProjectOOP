import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Buyer buyer; //оголошення змінної buyer
        //Введення капіталу покупця
        System.out.println("Введіть ваш капітал:");
        int capital = scanner.nextInt();
        buyer = new Buyer(capital);



        // Виведення меню вибору категорій мотоциклів
        System.out.println("Виберіть категорію мотоциклів(введіть потрібний вам номер):");
        System.out.println("1. Спортивні");
        System.out.println("2. Круїзери");
        System.out.println("3. Туристичні");


        int CategoryChoise = scanner.nextInt();
        Transport motos [] = null; // створення змінної , яка є масивом об'єктів класу MotoCycle

        // Ініціалізація масиву мотоциклів залежно від вибраної категорії
        if (CategoryChoise == 1) {
            motos = new Transport[]{
                    new SportMoto("SportBike1", 300, 1150, 20, 25000),
                    new SportMoto("SportBike2", 250, 1050, 17, 24000),
                    new SportMoto("SportBike3", 220, 1000, 14, 19000)
            };
        }
        else if (CategoryChoise == 2) {
            motos = new Transport[]{
                    new CruiserMoto("CruiserBike1", 150, 1200, 20, 12000),
                    new CruiserMoto("CruiserBike2", 160, 1250, 19, 13000),
                    new CruiserMoto("CruiserBike3", 175, 1450, 21, 14000)
            };
        }
        else if (CategoryChoise ==3){
            motos = new Transport[]{
                    new TouristMoto("TouringBike1", 180, 1300, 22, 10000),
                    new TouristMoto("TouringBike2", 170, 1350, 21, 9000),
                    new TouristMoto("TouringBike3", 160, 1250, 20, 8000)
            };
        }
        else{
            System.out.println("Категорії під даним номером не існує!");
        }
        // Виведення інформації про мотоцикли, якщо масив motos не пустий
        if (motos != null) {
            for (Transport moto : motos) {
                moto.bikeInfo();
                System.out.println(); // для розділення інформації про різні мотоцикли
            }
        }

        System.out.println("Пошук мотоцикла за ціною в межах капіталу...");
        buyer.findMotoByPrice(motos);
    }
}
