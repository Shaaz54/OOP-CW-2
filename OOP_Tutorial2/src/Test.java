import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
		Circle c1 = new Circle(7 , "red");
	    System.out.println("circle 1 color = " +c1.getColor()+"\n"+"circle 1 radius = " +c1.getRadius()+"\n"+"circle 1 Area = " +c1.getArea()  );
	        
	        System.out.println("");
	        System.out.println("------------------");
	        System.out.println("");
	        
	        Circle c2 = new Circle(14,"green");
	        System.out.println("circle 2 color = " +c2.getColor()+"\n"+"circle 2 radius = " +c2.getRadius()+"\n"+"circle 2 Area = " + c2.getArea()+"\n");
	        
	        c2.setColour("blue");
	        c2.setRadius(12);
	       System.out.println("circle 2 color = " +c2.getColor()+"\n"+"circle 2 radius = " +c2.getRadius()+"\n"+"circle 2 Area = " + c2.getArea()+"\n");
	        
	        Circle c3 = new Circle();
	        System.out.println(c3.toString());
	        System.out.println(c3);
	        
	    Date d1 = new Date(00,00,0000);
	    
	    System.out.print("Enter Year : ");
	    int x;
	    do {
	    	x=sc.nextInt();
		d1.setYear(x);
	    }while(x<=2100 && x>=1940 );
	    
	    System.out.print("Enter Month : ");
	    int y;
	    do{
	    y=sc.nextInt();
	    d1.setMonth(y);
	    }while (y>=12 && y<=1 );
	    
	    System.out.print("Enter Day : ");
	    int z=sc.nextInt();
	    do{
	    	z=sc.nextInt();
		d1.setDay(z);
	    }while (z<=31 );
	    
	    
	    System.out.println("Year :" +d1.getYear() + "--" + "Month :" + d1.getMonth()+"--" + "Day :"+d1.getDay()+"\n");
	    
		
	}

}
