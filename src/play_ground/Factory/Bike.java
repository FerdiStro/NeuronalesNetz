package play_ground.Factory;

public class Bike implements Vehicle{

    private final String id;

    public Bike(String id) {
        this.id = id;
    }


    @Override
    public void drive() {
        System.out.println("Bike drive");
        System.out.println("ID: "+ id);
    }
}
