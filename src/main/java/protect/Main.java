package protect;

public class Main {
    public static void main(String[] args) {
        SuperRenault superRenault = new SuperRenault();

        Car car = new Car();

        Car.CarProtected myCarProtected = car.new CarProtected();

        Car.CarPublic bb = new Car().new CarPublic();
    }
}
