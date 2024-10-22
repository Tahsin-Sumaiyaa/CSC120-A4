import java.util.ArrayList;

public class Car {

    //Attributes: carPassengers, passengerCapacity
    private ArrayList<Passenger> carPassengers; //This array will contain the records of all the passengers in the car
    public int passengerCapacity; //This will store the maximum passenger capacity of the car
    

    //Constructor: Creating a new Car object
    public Car(int passengerCapacity){
        this.carPassengers = new ArrayList<>();
        this.passengerCapacity = passengerCapacity;

    }

    //Accessor-like Method: getPassengerCapacity()
    public int getPassengerCapacity(){
        return this.passengerCapacity;
    }

    //Accessor-like Method: seatsRemaining()
    public int seatsRemaining(){
        return this.passengerCapacity - this.carPassengers.size();
    }


    //Method: addPassenger()
    public boolean addPassenger(Passenger p){
        if(carPassengers.size() < passengerCapacity){
            carPassengers.add(p);
            return true;
        }
        else{
            System.out.println("Car is Full. Cannot take any more passengers.");
            return false;
        }
    }

    //Method: removePassenger()
    public boolean removePassenger(Passenger p){
        if(carPassengers.contains(p)){
            carPassengers.remove(p);
            return true;
        }
        else{
            System.out.println("Passenger isn't in the car.");
            return false;
        }
    }

    //Method: printMenifest()
    public void printManifest() {
        if (carPassengers.size() == 0) {
            System.out.println("This car is EMPTY.");
        } else {
            System.out.println("Passengers in the car:");
            for (Passenger p : carPassengers) {
                System.out.println(p.getName());  // Use the getter to print the passenger's name
            }
        }
    }
}