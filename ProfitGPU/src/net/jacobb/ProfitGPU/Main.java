package net.jacobb.ProfitGPU;

import java.util.Scanner;

public class Main {
	
	private static Scanner options;
	private static Scanner firstgpu;
	private static Scanner secondgpu;

	public static void main(String[] args) {
		
		String Start = "Start";
		String Exit = "Exit";
		
		options = new Scanner(System.in);
		
		System.out.println("Welcome to the ProfitGPU Application");
		System.out.println("This App will help you to compare two GPU");
		System.out.println("Write 'Start' if you want to run the  Application");
		System.out.println("Write 'Exit' if you want to exit the Application");
		
		while  (true)  {
			String input = options.next();
			if (input.equals(Start)) {
				
				System.out.println("Launching the Application");
				int firstgpu_price, firstgpu_points, firstgpu_sum;
				
				String firstgpu_name;
				
				firstgpu = new Scanner(System.in);
				
				System.out.println("Tell me the name of first GPU");
				firstgpu_name = firstgpu.nextLine();
				
				System.out.println("Tell me the price of " + firstgpu_name);
				firstgpu_price = firstgpu.nextInt();
				
				System.out.println("Tell me the 3DMark score of " + firstgpu_name);
				firstgpu_points = firstgpu.nextInt();
				
				firstgpu_sum = firstgpu_points/firstgpu_price;
				
				System.out.println(firstgpu_name + " price to performance ratio is : " + firstgpu_sum);
				
				int secondgpu_price, secondgpu_points, secondgpu_sum;
				
				String secondgpu_name;
				
				secondgpu = new Scanner(System.in);
				
				System.out.println("Tell me the name of second GPU");
				secondgpu_name = secondgpu.nextLine();
				
				System.out.println("Tell me the price of " + secondgpu_name);
				 secondgpu_price =  secondgpu.nextInt();
				
				System.out.println("Tell me the 3DMark score of " + secondgpu_name);
				 secondgpu_points = secondgpu.nextInt();
				
				secondgpu_sum = secondgpu_points/ secondgpu_price;
				
				System.out.println(secondgpu_name + " price to performance ratio is : " +  secondgpu_sum);
				
				if(secondgpu_sum > firstgpu_sum)
				{
					System.out.println("Most price to performance ratio GPU is " + secondgpu_name +" which scored : "+ secondgpu_sum  + " points");
				}
				else if(firstgpu_sum > secondgpu_sum)
				{
					System.out.println("Most price to performance ratio GPU is " + firstgpu_name + " which scored : "+ firstgpu_sum  + " points");
				}
				System.exit(0); 
			}
			if (input.equals(Exit)) {
				
				System.out.println("Exiting the Application");
				System.exit(0); 
			} else {
				
				System.out.println("Invalid input!");
				System.exit(0);
			}
			
		}
		
	}

}