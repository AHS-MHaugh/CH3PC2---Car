/*
 * Michael Haugh
 * AP CS
 * CH3PC2
 * 9-30-18
 */
public class Car {
    // ^This is the class.^
    
    private int yearModel;
    private String make;
    private int speed;
    // ^These are the variables.^
    
    public Car(int y, String m, int s){
    // ^This is the constructor.^
        
        yearModel = y;
        make = m;
        speed = s;
    // ^These are the attributes.^
}
    public void setYearModel(int y){
        yearModel = y;
        // ^This is the mutator method.^
    }
    
    public int getYearModel(){
       return yearModel;
       // ^This is the accessor method.^
    }
    
    public void setMake(String m){
        make = m;
        // ^This is the mutator method.^
    }
    
    public String getMake(){
        return make;
        // ^This is the accessor method.^
    }
    
    public void setSpeed(int s){
        speed = s;
        // ^This is the mutator method.^
    }
    
    public int getSpeed(){
        return speed;
        // ^This is the accessor method.^
    }
    
    public int accelerate(){
        speed += 5;
        return speed;
        // ^This is the mutator method.^
    }
    
    public int brake(){
        speed -= 5;
        return speed;
        // ^This is the mutator method.^
    }
}