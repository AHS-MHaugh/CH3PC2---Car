/**
 *Michael Haugh
 *Project
 *Programming III - AP CS
 *9-30-18
 */
public class CarDemo {
    //^This is the class.^
    
    public static void main(String[] args) {
        Car c = new Car (2010, "F150", 107);
        // ^This is the object.^
        
        System.out.println("My pickup truck model is a " + c.getYearModel() 
                + " and the make is " + c.getMake() + ".");
        // ^This is the print command.^
        
        System.out.println("The initial speed is " + c.getSpeed() + " mph.");
        System.out.println("The current speed is " + c.accelerate() + " mph.");
        System.out.println("The current speed is " + c.accelerate() + " mph.");
        System.out.println("The current speed is " + c.accelerate() + " mph.");
        System.out.println("The current speed is " + c.accelerate() + " mph.");
        System.out.println("The current speed is " + c.accelerate() + " mph.");
        // ^This is the print command.^
        
        System.out.println("The current speed is " + c.brake() + " mph.");
        System.out.println("The current speed is " + c.brake() + " mph.");
        System.out.println("The current speed is " + c.brake() + " mph.");
        System.out.println("The current speed is " + c.brake() + " mph.");
        System.out.println("The current speed is " + c.brake() + " mph.");
        // ^This is the print command.^
        }
    }
