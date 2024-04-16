public class Main {

    public static void main(String[] args) {
        Garage myGarage = new Garage("My Garage");

        myGarage.addCars(new PetrolCar("ACX7E232", "Mitsubishi", 2001, 4, 93, 20));
        myGarage.addCars(new ElectricCar("SHDG6SDG", "Volkswagen", 2024, 6, 93, 500, 2000));
        myGarage.addCars(new DieselCar("HST72GDS", "Honda", 2009, 9, false, 50));
        myGarage.addCars(new DieselCar("HDT723HD", "KIA", 2012, 8, true, 36));

        System.out.println(myGarage.toString());
        System.out.println("Total Green owner tax for all cars: " + myGarage.calculateTaxTotal());

    }
}
