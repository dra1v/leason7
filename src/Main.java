public class Main {
    public static
    void main(String[] args) {
        Cat[] cats = {new Cat("Matroskin", 50), new Cat("Antowka", 50), new Cat("Canek", 25), new Cat("Valera", 5), new Cat("Kotik", 1)};
        Plate plate = new Plate( 80);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}

