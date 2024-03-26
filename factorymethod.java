
interface Vehicle {
    void manufacture();
}


class Car implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Car is being manufactured");
    }
}

class Truck implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Truck is being manufactured");
    }
}


interface VehicleFactory {
    Vehicle createVehicle();
}


class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}


public class factorymethod {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.manufacture();

        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.createVehicle();
        truck.manufacture();
    }
}
