package parkinglot2;

public class Main {
    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot(256);

        parkingLot.addCars();
        System.out.println(parkingLot.toString());

        parkingLot.countTypes();

        parkingLot.countColors();

        parkingLot.countAlike();
    }
}