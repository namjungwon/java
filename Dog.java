public class Dog extends Canine{
    // overrided method 
    public void makeNoise(){
        System.out.println("mung mung");
    }
    public void sleep(){
        System.out.println("He sleeps at night.");
    }

    // constructor
    public Dog (String N, String H, String P){
        name = N;
        Health = H;
        Precription = P;
    }
}