public class Building {

    int numberOfFloors;
    int numberOfRooms;

    public void display(String faculty) {
        System.out.println("This building is of " + faculty + " faculty.");
    }

    public static void main(String[] args) {
        Building firstBuilding = new Building();

        firstBuilding.numberOfFloors = 5;
        firstBuilding.numberOfRooms = 100;

        System.out.println("My first building:");
        System.out.println("Number of floors: " + firstBuilding.numberOfFloors);
        System.out.println("Number of rooms: " + firstBuilding.numberOfRooms);
        firstBuilding.display("+2");


        Building secondBuilding = new Building();

        secondBuilding.numberOfFloors = 6;
        secondBuilding.numberOfRooms = 110;

        System.out.println("My second building:");
        System.out.println("Number of floors: " + secondBuilding.numberOfFloors);
        System.out.println("Number of rooms: " + secondBuilding.numberOfRooms);
        secondBuilding.display("CSIT and BCA");
    }
}