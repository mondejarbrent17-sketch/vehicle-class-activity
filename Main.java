public class Main {


    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Toyota", "Vios", 2015);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 1995);
        Vehicle vehicle3 = new Vehicle("Ford", "Ranger", 2020);

        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());
        
        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());

        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
    }
}