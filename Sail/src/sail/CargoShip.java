
package sail;

public class CargoShip extends Ship {
    private int cargoCapacity; // In tonnage

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "Cargo Ship Name: " + getName() + "\nCargo Capacity: " + cargoCapacity + " tons";
    }
}
