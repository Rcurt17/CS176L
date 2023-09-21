public class Main{
  public double efficiency;
  public double fuelAmount;

  public Main(double mpg) {
    efficiency = mpg;
    
  }

  public void addGas(double Gallons) {
    fuelAmount += Gallons;
  }

  public double getGasInTank() {
    return fuelAmount;
  }

  public void driveCar(double miles) {
    fuelAmount -= (miles / efficiency);
  }
  
  
  
  
  
  
  
  
  
  public static void main(String[] args) {
    Main Porche = new Main(50);

    Porche.addGas(20);
    Porche.driveCar(100);
    System.out.println("Gas remaining: "+ Porche.getGasInTank());
    
    
  }
}