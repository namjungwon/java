public class AnimalLauncher{
    public static void main (String[] args){
        // name, health, prescription
        System.out.println("");

        // extended from Feline
        cat CAT = new cat("Kitty", "sick", "needs surgery"){};
        CAT.makeNoise();
        CAT.eat();
        CAT.sleep();
        System.out.println("");

        // extended from Canine
        dog DOG = new dog("Doggy", "healthy", "rest in home"){};
        DOG.makeNoise();
        DOG.eat();
        DOG.sleep();
        System.out.println("");

    }
}