class Fruit {
    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }
    void eat() {
        System.out.println("Eating " + name + " which tastes " + taste);
    }
}

class Apple extends Fruit {
    Apple(String name, String taste, String size) {
        super(name, taste, size);
    }
    void eat() {
        System.out.println("Apple tastes " + taste);
    }
}

class Orange extends Fruit {
    Orange(String name, String taste, String size) {
        super(name, taste, size);
    }
    void eat() {
        System.out.println("Orange tastes " + taste);
    }
}

public class One {
    public static void main(String[] args) {
        Apple apple = new Apple("Apple", "Sweet", "big");
        Orange orange = new Orange("Orange", "Orangy", "small");
        apple.eat();
        orange.eat();
    }
}
