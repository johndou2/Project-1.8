import java.util.Scanner;

public class AreaAndPermiterofAcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create variable for pi
		final double PI = 3.14159;
		//double radius = 5.5;


        //create scanner project
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a number for a radius. ");
		double radius = input.nextDouble();
		double perimeter = 2 * radius * PI;
        double area = radius * radius * PI;

        System.out.println("For your given cirlce, ");
		System.out.println("The permiter is:" +perimeter + ".");
		System.out.println("And the area is: " + area + ".");
	}


//test comment

//another test comment
}
