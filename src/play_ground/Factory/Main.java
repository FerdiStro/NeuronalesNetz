package play_ground.Factory;

import play_ground.Factory.Fac.BikeFactory;
import play_ground.Factory.Fac.CarFactory;
import play_ground.Factory.Fac.DefaultFactory;

public class Main {
    public static void main(String[] args) {
        DefaultFactory carFactory =  new CarFactory();
        carFactory.build().drive();
        DefaultFactory bikeFactory = new BikeFactory();
        bikeFactory.build().drive();



    }
}
