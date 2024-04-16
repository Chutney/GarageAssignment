import java.util.List;

public class DieselCar extends Car {

    private boolean hasParticulateFilter;
    private double kmPrL;

    public DieselCar(String regNum, String brand, int productionYear, int numOfDoors, boolean hasParticulateFilter, double kmPrL) {
        super(regNum, brand, productionYear, numOfDoors);
        this.hasParticulateFilter = hasParticulateFilter;
        this.kmPrL = kmPrL;
    }

    public boolean isHasParticulateFilter() {
        return hasParticulateFilter;
    }

    public void setHasParticulateFilter(boolean hasParticulateFilter) {
        this.hasParticulateFilter = hasParticulateFilter;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public double calcGreenOwnerTax() {
        double petrolTax = calcStandardTax(kmPrL);
        double withParticulateTax = ((hasParticulateFilter) ? 0 : 1000) + petrolTax;

        if (kmPrL >= 20) {
            return withParticulateTax + 130;
        }
        if (kmPrL >= 15) {
            return withParticulateTax + 1390;
        }
        if (kmPrL >= 10) {
            return withParticulateTax + 1850;
        }
        if (kmPrL >= 5) {
            return withParticulateTax + 2770;
        }
        return withParticulateTax + 15260;

    }

    @Override
    public String toString() {
        return String.join("\n", List.of(
                super.toString(),
                "km/L: " + kmPrL,
                "Partikelfilter: " + (hasParticulateFilter ? "Ja" : "Nej")
        ));
    }
}
