package pluralsight.com;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("My House", "2020-01-01", 250000,
                "123 Main St", 1, 2000, 5000));
        assets.add(new House("Vacation Home", "2018-06-15", 180000,
                "456 Lakeview Dr", 2, 1500, 3000));

        assets.add(new Vehicle("Tom's Truck", "2019-03-12", 35000,
                "Ford F-150", 2019, 120000));
        assets.add(new Vehicle("My Car", "2021-09-01", 28000,
                "Honda Civic", 2021, 95000));

        assets.add(new Cash("Emergency Cash", "2023-05-01", 5000));

        for (Asset asset : assets) {
            System.out.println("---------------------------");
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());

            if (asset instanceof House house) {
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle vehicle) {
                System.out.println("Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }
        }
    }
}
