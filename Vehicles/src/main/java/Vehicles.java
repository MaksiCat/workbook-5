public class Vehicles {
    public static void main(String[] args) {
        // Creating instances of each vehicle type
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setNumberOfPassengers(1);
        slowRide.setCargoCapacity(15);

        Car sedan = new Car();
        sedan.setColor("Blue");
        sedan.setFuelCapacity(50);
        sedan.setNumberOfPassengers(5);
        sedan.setCargoCapacity(500);

        SemiTruck freightliner = new SemiTruck();
        freightliner.setColor("White");
        freightliner.setFuelCapacity(300);
        freightliner.setNumberOfPassengers(2);
        freightliner.setCargoCapacity(20000);

        Hovercraft hover = new Hovercraft();
        hover.setColor("Silver");
        hover.setFuelCapacity(100);
        hover.setNumberOfPassengers(4);
        hover.setCargoCapacity(1000);

        // Displaying information about each vehicle
        System.out.println("Moped:");
        System.out.println("Color: " + slowRide.getColor());
        System.out.println("Fuel Capacity: " + slowRide.getFuelCapacity());
        System.out.println("Passengers: " + slowRide.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + slowRide.getCargoCapacity());

        System.out.println("\nCar:");
        System.out.println("Color: " + sedan.getColor());
        System.out.println("Fuel Capacity: " + sedan.getFuelCapacity());
        System.out.println("Passengers: " + sedan.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + sedan.getCargoCapacity());

        System.out.println("\nSemiTruck:");
        System.out.println("Color: " + freightliner.getColor());
        System.out.println("Fuel Capacity: " + freightliner.getFuelCapacity());
        System.out.println("Passengers: " + freightliner.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + freightliner.getCargoCapacity());

        System.out.println("\nHovercraft:");
        System.out.println("Color: " + hover.getColor());
        System.out.println("Fuel Capacity: " + hover.getFuelCapacity());
        System.out.println("Passengers: " + hover.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + hover.getCargoCapacity());
    }
}

