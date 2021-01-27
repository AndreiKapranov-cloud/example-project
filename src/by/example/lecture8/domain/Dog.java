package by.example.lecture8.domain;

public class Dog extends AbstractPet {

    private int barkingVolume;

    public Dog(String name, int age, String species, int barkingVolume) {
        super(name, age, species);
        this.barkingVolume = barkingVolume;
    }

    @Override
    public void say() {
        System.out.println("WOOOF!");
        System.out.println("*Woof was " + barkingVolume + " DB*");
    }

    public void printDogInfo() {
        System.out.println("Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", barkingVolume=" + barkingVolume +
                '}');
    }

}
