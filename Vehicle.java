//Inheritance
class Vehicle {
    public String brand = "Audi";        
    public void honk() {                   
      System.out.println("Honk honk!");
    }
  }
  
  class Car extends Vehicle {
    private String modelName = "A8";   
    public static void main(String[] args) {
  
      Car myCar = new Car();
  
      myCar.honk();
      System.out.println(myCar.brand +" "+ myCar.modelName);
    }
  }