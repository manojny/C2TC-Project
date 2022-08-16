package com.cg.objectinstantion;

class Box{

		double length;
		double breadth;
		double height;
		
		//non parameterized constructor
	public Box() {
		super();
	
	}

	public Box(double length, double breadth, double height) {
			super();
			this.length = length;
			this.breadth = breadth;
			this.height = height;
}

	double calculateVolume() {
		return length*breadth*height;
		
	}
}

 public class BoxMain {
	 public static void main(String[] args) {
		 Box box1=new Box();
		 System.out.println( box1.calculateVolume());
	 }	
}