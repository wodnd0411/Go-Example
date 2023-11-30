package ch07;

public class Shape {
	
	String color;
	
	Shape() {
		this("black");
	}
	
	Shape(String color) {
		this.color = color;
	}
	
	void draw() {
		System.out.printf("[color = %s]%n", color);
	}

}
