package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        System.out.println(d.speak()); // Quack Quack
        Bird b = (Bird)d;  // upcasting
        Animal a = (Animal)b; // upcasting
        System.out.println(a.speak()); // Quack Quack 仍旧是Duck而非Animal
        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
        train(new Parrot()); // 若下面train没有加if，这行会报错，因为Parrot本质并非是Duck，无法downcast过去
        // Animal a2 = new Animal(); // please avoid this; no point to create just Animal
        // Bird b2 = new Bird();
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim(); // only Duck class has swim method
        }
    }
}
