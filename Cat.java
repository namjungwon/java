public class Cat extends Feline{
    // overrided method 
    @Override
    public void makeNoise(){
        System.out.println("meow meow");
    }
    public void sleep(){
        System.out.println("She sleeps in the evening");
    }
    // constructor
    public Cat (String N, String H, String P){
        name = N;
        Health = H;
        Precription = P;
    }
}