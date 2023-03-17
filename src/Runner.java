public class Runner {
    public static void main(String[] args) {
        Animal hamster = new Animal("Bob", 3, false, false);
        Dog dog1 = new Dog("Joe", 2, false, false, false, false);
        Cat cat1 = new Cat("Tom", 6, false, false, false, false);
        hamster.adopt();
        hamster.feed();
        System.out.println(hamster.getAge());
        System.out.println(hamster.getName());
        System.out.println(hamster.isSlept());
        System.out.println(hamster.isVaccinated());
        hamster.sleep();
        System.out.println(dog1.isHasBeenWalked());
        System.out.println(dog1.isHasPlayedCatch());
        dog1.playCatch();
        dog1.adopt();
        dog1.feed();
        dog1.walk();
        System.out.println(dog1.getAge());
        System.out.println(dog1.getName());
        System.out.println(dog1.isSlept());
        System.out.println(dog1.isVaccinated());
        dog1.sleep();
        cat1.adopt();
        cat1.feed();
        System.out.println(cat1.getAge());
        System.out.println(cat1.getName());
        System.out.println(cat1.isSlept());
        System.out.println(cat1.isVaccinated());
        cat1.sleep();
        cat1.giveMilk();
        System.out.println(cat1.isHasDrankMilk());
        System.out.println(cat1.isHasPlayedWith());
        cat1.play();

    }
}
