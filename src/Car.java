import java.util.List;

public abstract class Car {
    private String regNum;
    private String brand;
    private int productionYear;
    private int numOfDoors;

    public Car(String regNum, String brand, int productionYear, int numOfDoors) {
        this.regNum = regNum;
        this.brand = brand;
        this.productionYear = productionYear;
        this.numOfDoors = numOfDoors;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) throws RuntimeException {
        if(numOfDoors%2 == 0) {
            this.numOfDoors = numOfDoors;
        } else {
            throw new RuntimeException("Doors has to be an even number");
        }

    }

    abstract double calcGreenOwnerTax();

    public double calcStandardTax (double kmPrL) {
        if(kmPrL > 50) {
            throw new RuntimeException("Km pr. h can't be above 50!");
        }

        if(kmPrL >= 20) {
            return 330;
        }
        if(kmPrL >= 15) {
            return 1050;
        }
        if(kmPrL >= 10) {
            return 2340;
        }
        if(kmPrL >= 5) {
            return 2770;
        }
        return 15260;

    }

    @Override
    public String toString() {
        return String.join("\n", List.of(
                "Registreringsnummer: " +regNum,
                "Mærke: " + brand,
                "Produktionsår: " + productionYear,
                "Antal døre: " + numOfDoors
        ));
    }
}
