
//methods for setting name, age, weight, and height

public class Creature {
	private String name; 
	private int age;  
    private double weight;
    private double height;
     
    
    public Creature(String Name) {
    	name = Name; 
    }
    	
   public void setAge(int Age) {
    	age = Age; 
    }
  public int getAge () {  
	  return age;  
  }
  public void setWeight(double Weight) {
	  weight = Weight;
  }
  public double getWeight() {
	  return weight;
  }
  public void setHeight(double Height) {
	  height = Height;
  }
  public double getHeight() {
	  return height;
  }
}
 