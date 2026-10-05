class OOP1{
    public static void main(String[] args) {
        //Create and use objects
        Car c =new Car();
        Car c1=new Car("Red","model","Brand",1198,true);
    }
}
class Car{
    //member / Data /// variable // Properties
    private String colour,model, brand;
    private int engineCC;
    private boolean isManual;
    Car( String colour,String model, String brand, int engineCC,boolean isManual)
    {this.setColour();
     this.setModel(model);
     this.setBrand(brand);
     this.setEngineCC(engineCC);
     this.setISManual(isManual);
    }

    //Setters
    public void setColour(String colour){ this.colour=colour;}
    public void setModel(String model ){ this.model = model;}
    public void setBrand(String brand ){this.brand= brand;}
    public void setEngineCC(int engineCC)
    {this.engineCC=engineCC;}
    public void setISManual(boolean isManual)
    {this.isManual=isManual;}
   
    //GETTER
    public void setIsManunal(Boolean isManual){this.isManual=isManual;}  
   // others
   // display     
}