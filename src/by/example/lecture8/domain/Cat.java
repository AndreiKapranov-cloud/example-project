package by.example.lecture8.domain;

public class Cat extends AbstractPet {

    private int meowVolume;

    public Cat() {
    }

    public Cat(String name, int age, String species, int meowVolume) {
        super(name, age, species);
        this.meowVolume = meowVolume;
    }

    @Override
    public void say() {
        System.out.println("MEOW!");
        System.out.println("*Meow was " + meowVolume + " DB*");
    }

    public void printCatInfo() {
        System.out.println("Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", meowVolume=" + meowVolume +
                '}');
    }

}
