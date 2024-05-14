    import java.util.Scanner;
    public class Transport {
        protected String name;
        protected int horsePower;
        protected int height;
        protected int tankCapacity;
        protected int price;
        protected String category;

        public Transport(String name, int horsePower, int height, int tankCapacity, int price, String category) {  //Конструктор
            this.name = name;
            this.horsePower = horsePower;
            this.height = height;
            this.tankCapacity= tankCapacity;
            this.price=price;
            this.category = category;
        }


        public void bikeInfo(){ //Метод на вивід інформації
            System.out.println("Category"+category);
            System.out.println("Name: "+ name);
            System.out.println("HorsePower "+ horsePower+" к.с.");
            System.out.println("height: "+ height+" мм");
            System.out.println("Tank capacity: "+ tankCapacity+" л");
            System.out.println("Price: "+ price+" €");
        }

    }









    // Підклас SportMoto, який наслідує клас MotoCycle
    class SportMoto extends Transport{
        // Конструктор SportMoto
        public SportMoto(String name, int horsePower, int height, int tankCapacity, int price) {
            super(name, horsePower, height, tankCapacity, price, "Sport");
        }

        @Override
        public void bikeInfo() {
            System.out.println("Category:"+category);
            System.out.println("Name: " + name);
            System.out.println("HorsePower: " + horsePower + " к.с.");
            System.out.println("Height: " + height + " мм");
            System.out.println("Tank Capacity: " + tankCapacity + " л");
            System.out.println("Price: " + price + " €");
        }
    }

    // Підклас CruiserMoto, який наслідує клас MotoCycle
    class CruiserMoto extends Transport{
        // Конструктор CruiserMoto
        public CruiserMoto(String name, int horsePower, int height, int tankCapacity, int price) {
            super(name, horsePower, height, tankCapacity, price, "Cruiser");
        }

        @Override
        public void bikeInfo() {
            System.out.println("Category:"+category);
            System.out.println("Name: " + name);
            System.out.println("HorsePower: " + horsePower + " к.с.");
            System.out.println("Height: " + height + " мм");
            System.out.println("Tank Capacity: " + tankCapacity + " л");
            System.out.println("Price: " + price + " €");
        }
    }

    // Підклас TouristMoto, який наслідує клас MotoCycle
    class TouristMoto extends Transport{
        // Конструктор TouristMoto
        public TouristMoto(String name, int horsePower, int height, int tankCapacity, int price) {
            super(name, horsePower, height, tankCapacity, price, "Tourist");
        }

        @Override
        public void bikeInfo() {
            System.out.println("Category:"+category);
            System.out.println("Name: " + name);
            System.out.println("HorsePower: " + horsePower + " к.с.");
            System.out.println("Height: " + height + " мм");
            System.out.println("Tank Capacity: " + tankCapacity + " л");
            System.out.println("Price: " + price + " €");
        }
    }




