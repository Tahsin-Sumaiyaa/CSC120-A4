import java.util.ArrayList;

public class Train {

    //Attributes: Engine, Car
    Engine e;
    private ArrayList<Car> cars;
    

    //Constructor:
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        e= new Engine(fuelType, 0.0, fuelCapacity);
        cars = new ArrayList<Car>();

        for(int i=0; i<nCars; i++){
            Car newCar= new Car(passengerCapacity);
            cars.add(newCar);
        }
    }

    //Accessor: getEngine()
    public Engine getEngine(){
        return e;
    }

    //Accessor: getCar()
    public Car getCar(int i){
        return cars.get(i);
    }

    // Accessor: getTrainCapacity()
    // This method now calculates the total capacity of the train.
    public int getTrainCapacity() {
        int totalCapacity = 0; // Initializing total capacity to zero.
        for (Car car : cars) { // Looping through each Car in the ArrayList.
        totalCapacity += car.getPassengerCapacity(); // Add each car's capacity to the total.
        }
        return totalCapacity; // Return the total capacity across all cars.
    }

    //Method: seatsRemaining()
    //This method calculates total seats remaining in the train.
    public int seatsRemaining(){
        int totalSeats = 0;
        for(Car car: cars){
            totalSeats += car.seatsRemaining();
        }
        return totalSeats;
    }


    //Method: printManifest()
    public void printManifest(){
        for (Car car: cars){
            car.printManifest();
        }
    }


    // Main method for running the Train class
    public static void main(String[] args) {
        //Constructor
        Train myTrain = new Train(FuelType.INTERNAL_COMBUSTION, 500.0, 4, 10);

        // Creating some Passenger objects
        Passenger p1 = new Passenger("Sumaiya");
        Passenger p2 = new Passenger("Maliha");
        Passenger p3 = new Passenger("Afi");
        Passenger p4 = new Passenger("Badhon");


        // Getting the first three cars from the train and boarding some passengers
        Car car1 = myTrain.getCar(0);  // Get the first car
        Car car2 = myTrain.getCar(1);  // Get the second car
        Car car3 = myTrain.getCar(2);  // Get the third and last car

        p1.boardCar(car1);  // Passenger p1 boards car1
        p2.boardCar(car1);  // Passenger p2 boards car1
        p3.boardCar(car2);  // Passenger p3 boards car2
        p4.boardCar(car3);  // Passenger p4 boards car3



        // Printing out information about the train
        System.out.println("Train's engine fuel type: " + myTrain.getEngine().getFuelType());
        System.out.println("Max capacity of the train: " + myTrain.getTrainCapacity());
        System.out.println("Seats remaining in the train: " + myTrain.seatsRemaining());

        // Print manifest (passengers list)
        myTrain.printManifest();
    }
}


