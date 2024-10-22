public class Passenger {
    
    //Attribute: name
    private String name;

    //Constructor: Passenger Object
    public Passenger(String name) {
        this.name=name;
    }
    
    //getter function
    public String getName(){
        return name;
    }

    //Method: boardCar()
    public boolean boardCar(Car c){
        if(c.addPassenger(this)){
            System.out.println("Passenger added successfully!\n");
            return true;
        }
        else{
            System.out.println("No space in the car.");
            return false;
        }
    }

    //Method: getOffCar(Car c)
    public boolean getOffCar(Car c){
        if(c.removePassenger(this)){
            System.out.println("Passenger left the car.");
            return true;
        }
        else{
            System.out.println("Passenger isn't in the car.");
            return false;
        }
    }



}
