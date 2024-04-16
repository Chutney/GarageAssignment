import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> cars;
    String name;

    public Garage(String name) {
        this.name = name;
        cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCars (Car car) {
        cars.add(car);
    }

    @Override
    public String toString() {
        String[] carString = new String[cars.size()];
        for (int i = 0; i < cars.size(); i++) {
            carString[i] = "######################\n" + cars.get(i).toString();
        }
        carString[carString.length-1] = carString[carString.length-1] + "\n######################";
        return String.join("\n", carString);
    }

    public double calculateTaxTotal() {
        double total = 0;
        for (Car car : cars) {
            total += car.calcGreenOwnerTax();
        }

        return total;
    }
}
