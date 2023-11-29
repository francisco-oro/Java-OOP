/*
 	Originally written by Equipo 5 @ Laboratorio de POO Fi-UNAM
 	Nov, 2024
 */
										
package practica4.ejercicio1;
import java.util.*;

public class Ejercicio1 {
	public static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		int choice;
		do	
		{
			SetInstructions();
			System.out.println("Enter a new shape index");
			choice = scanner.nextInt();
			if(choice == 0) break;
			IShape newShape = SetShape(choice);
			do
			{
				System.out.println("Use the following indexes to perform an operation: 0: Create a new shape, 1: Area of base, 2: Perimeter of base, 3: Volume");
				System.out.println("Enter an operation index");
				choice = scanner.nextInt();
				if(choice == 0) break;
				System.out.println("Result: " + SetOperation(choice, newShape));
			} while (true);
			
		} while(true);
		
	}

	private static double SetOperation(int input, IShape shape) {
		switch (input) {
		case 1:
			return shape.AreaOfBase();
		case 2:
			return shape.PerimeterOfBase();
		case 3:
			return shape.Volume();
		default:
			return -1.00;
		}
	}

	private static IShape SetShape(int input) {
		if(input == 1) {
			System.out.println("Creating a new Cilinder");
			System.out.println("Radius: ");
			double radius = scanner.nextDouble();
			System.out.println("Height: ");
			double height = scanner.nextDouble();
			return new Cilindro(radius, height);
		}
		else if(input == 2) {
			System.out.println("Creating a new Pyramid");
			System.out.println("Base witdh: ");
			double base_height = scanner.nextDouble();
			System.out.println("Base length: ");
			double base_length = scanner.nextDouble();
			System.out.println("Height: ");
			double height = scanner.nextDouble();
			return new Piramide(base_height, base_length, height);
		}
		else {
			System.out.println("Creating a new Cube");
			System.out.println("Side length: ");
			double side_length = scanner.nextDouble();
			return new Cubo(side_length);
		}
	}

	private static void SetInstructions() {
		System.out.println("Welcome to the shape operations program!");
		System.out.println("0: Exit, 1: Create a cilinder, 2: Create a Pyramid, 3: Create a cube");
		System.out.println("Please provide the index of the shape you want to create or enter 0 to leave the program");
	}
}
