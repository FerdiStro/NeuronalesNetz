package play_ground.Factory.Fac;

import play_ground.Factory.Bike;
import play_ground.Factory.Vehicle;

public class BikeFactory extends DefaultFactory{
    @Override
    public Bike build() {
        return new Bike("001");
    }
}
