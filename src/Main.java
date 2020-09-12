public class Main {
    public static
    void main(String[] args) {
        Cat[] cats = {new Cat("Matroskin", 50), new Cat("Antowka", 50), new Cat("Canek", 25), new Cat("Valera", 5), new Cat("Kotik", 1)};
        Plate plate = new Plate( 100);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
        plate.info();
        plate.addFood(100);
        plate.info();
    }
}

