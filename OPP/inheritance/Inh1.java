package inheritance;
import javax.print.DocFlavor.STRING;

import Car;

class Inh1{
    public static void main (String []args){
    Car c1= new Car("lambor","v3",120, "b");
    c1.start();
    }
}
class Vehicle{
    private int engineCC;
    private String fuelType;
    ///CONSTRUCTOR
    Vehicle(int engineCC,String fuelType){
        System.out.println("Vechicle Constructor invoked");
        this.engineCC = engineCC;
        this.fuelType = fuelType;
    }
    //SETTERS
    
    public void setEngineeCC(int engineCC)
    {this.engineCC=engineCC;}
    public void setFuelType(String fuelType)
    {this.fuelType=fuelType;}
    // Getter 
    public int getEngineCC(){return this.engineCC;}
    public String getFuelType(){return this.fuelType;}


    public void start(){
        System.out.println("VEchicce stattred");
        System.out.println("engine CCc"+ this.getFuelType());
        System.out.println("fuel"+this.getEngineCC());
        }
}
class Car extends  Vehicle{

    private String brand,model;
    ///CONSTRUCTOR
    Car (String brand,String model, int engineCC ,String fuelType){
        super( engineCC,fuelType);
        System.out.println("CAR Constructor Invoked");
        this.brand = brand; 
        this.model = model;
    
    }
        ///Settter
        public void setModel(String model){this.model =model;}
        public void setBrand(String brand){this.brand=brand;}
        ///
        /// Getter
        public String getModel(){return this.model;}
        public String getBrand(){return this.brand;}
}
