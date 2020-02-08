package circus.animal;

public abstract class Bird extends Animal {
    // make it abstract so that Bird do not need to implement speak() in Animal and getValue() in interface Asset
    public void fly() {
        System.out.println("Whee ...");
    }
}
