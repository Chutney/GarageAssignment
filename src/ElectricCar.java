import java.util.List;

public class ElectricCar extends Car {

    private int batteryCapacityKWh;
    private int maxKm;
    private double whPrKm;

    public ElectricCar(String regNum, String brand, int productionYear, int numOfDoors, int batteryCapacityKWh, int maxKm, double whPrKm) {
        super(regNum, brand, productionYear, numOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public void setBatteryCapacityKWh(int batteryCapacityKWh) {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public double calcGreenOwnerTax() {
        double kmPrL = 100/(whPrKm/91.25);
        return calcStandardTax(kmPrL);
    }

    @Override
    public String toString() {
        return String.join("\n", List.of(
                super.toString(),
                "Battery Kapacity: " + batteryCapacityKWh + "KWh",
                "Wh/h: " + whPrKm,
                "Max km: " + maxKm
        ));
    }
}
