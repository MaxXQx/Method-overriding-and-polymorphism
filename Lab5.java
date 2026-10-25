package Test2;

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Имя животного: " + name);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void makeVoice() {
        System.out.println(name + " говорит: Мяу!");
    }

    public Kitten giveBirth(String kittenName) {
        System.out.println(name + " рожает котёнка по имени " + kittenName);
        return new Kitten(kittenName, name);
    }
}

class Kitten extends Cat {
    private String motherName;

    public Kitten(String name, String motherName) {
        super(name);
        this.motherName = motherName;
    }

    public void mom() {
        System.out.println("Имя родителя: " + motherName);
    }
}

public class Lab5 {
    public static void main(String[] args) {
        Cat myCat = new Cat("Снежок");

        myCat.printName();
        myCat.makeVoice();

        Kitten babyKitten = myCat.giveBirth("Пушок");

        babyKitten.printName();
        babyKitten.makeVoice();
        babyKitten.mom();
    }
}

