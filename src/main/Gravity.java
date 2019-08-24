/*
 * @author Shikhar Khare
 * @version 1.0
 * */
package main;

import java.util.Scanner;
// uncomment the above line to use input in your program.

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
	double distance = 0,time=0,speed=0,g=9.8;
	Scanner sc = new Scanner(System.in);
	time=sc.nextDouble();
	speed=g*time;
	distance=0.5*g*time*time;
        System.out.println("The speed of the object at "+time+" seconds after its release is "+ speed+ " and the distance the object has travelled in the " + time + " seconds after the relase is " + distance);
	sc.close();
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
