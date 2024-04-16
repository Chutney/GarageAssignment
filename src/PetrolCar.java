import java.util.List;

public class PetrolCar extends Car {

    private int octaneRating;
    private double kmPrL;

    public PetrolCar(String regNum, String brand, int productionYear, int numOfDoors, int octaneNum, double kmPrL) {
        super(regNum, brand, productionYear, numOfDoors);
        this.octaneRating = octaneNum;
        this.kmPrL = kmPrL;
    }

    public int getOctaneRating() {
        return octaneRating;
    }

    public void setOctaneRating(int octaneRating) {
        this.octaneRating = octaneRating;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return String.join("\n", List.of(
                super.toString(),
                "Oktantal: " + octaneRating,
                "km/L: " + kmPrL
        ));
    }

    @Override
    public double calcGreenOwnerTax() {
        return calcStandardTax(kmPrL);
    }
}
