
public class Circle {
	private double radius;
	 private String color;
	//  private int no;
	 
	 public Circle(){
	     radius = 1;
	     color = "Blue";
	 }
	 //1234
	 public Circle(double r){
	     this.radius=r;
	     color = "Blue";
	 }

	 public Circle(double r, String c){
	 this.radius=r;
	 this.color=c;
	 }
	 public double getArea(){
	 return radius*radius*Math.PI; 
	 }
	 
	 public double getRadius(){
	return radius;
	}
	  public String getColor(){
	return color;
	}
	  public void setRadius(double newRadius){
	this.radius = newRadius;
	}
	public void setColour(String newColour){
	    this.color=newColour;
	}

	public String toString(){
	     
	    return null;
}
}
