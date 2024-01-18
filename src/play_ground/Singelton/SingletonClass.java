package play_ground.Singelton;

public class SingletonClass {
    private static SingletonClass INSTANCE;

    private  SingletonClass() {
    }

    public static SingletonClass getInstance(){
        if(INSTANCE==null){
            INSTANCE = new SingletonClass();
        }
        return INSTANCE;
    }

    public void printSomeStuff(String text){
        System.out.println(text);
    }
}
