package play_ground.Factory.Fac;

import play_ground.Factory.Car;
import play_ground.Factory.Vehicle;

public class CarFactory extends DefaultFactory{



    @Override
    public Vehicle build() {
        return new Car(20);
    }
}
