public class Engine {

    //Attributes
    private FuelType fuelType;
    private double currentFuel;
    private double fuelCapacity;
    
    //Constructor
    public Engine(FuelType fuelType, double currentFuel, double fuelCapacity){
        this.fuelType = fuelType;
        this.currentFuel = currentFuel;
        this.fuelCapacity=fuelCapacity;
    }

    //Accessor: getFuelType
    public FuelType getFuelType(){
        return fuelType;
    }

    //Accessor: currentFuel()
    public double currentFuel(){
        return currentFuel;
    }


    //Declaring Method: refuel()
    public void refuel(){
        this.currentFuel = fuelCapacity;
        System.out.println("Engine is refuelled. It's in full capacity.");
    }

    //Declaring Method: go()
    public boolean go(double x){
        if(currentFuel > 0){
            this.currentFuel -= x;
            System.out.println("The engine has started running.");
            return true;
        }
        else {
            System.out.println("Engine doesn't have enough fuel.");
            return false;
        }


    }


    

















}