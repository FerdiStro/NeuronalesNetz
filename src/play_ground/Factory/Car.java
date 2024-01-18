package play_ground.Factory;

public class Car implements Vehicle{

    private final int price;

    public Car(int price) {
        this.price = price;
    }

    @Override
    public void drive() {
        System.out.println("Car drive");
        System.out.println("Cost: " +  price);
        System.out.println("-------------");
    }
}
