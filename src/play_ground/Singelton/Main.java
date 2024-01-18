package play_ground.Singelton;

public class Main {

    public static void main(String[] args) {
        SingletonClass instance = SingletonClass.getInstance();
        instance.printSomeStuff("Hello Singleton-Pattern");

    }
}
