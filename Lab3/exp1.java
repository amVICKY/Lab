package com.gsv.lab3;

class Figure {
    protected double r; // radius
    protected double a; // area
    protected double v; // volume

    public Figure(double radius) {
        this.r = radius;
    }

    public void dispArea() {
        System.out.printf("Area: %.2f\n", a);
    }

    public void dispVolume() {
        System.out.printf("Volume: %.2f\n", v);
    }
}

class Cone extends Figure {
    private double h; // height
    private double s; // slant height
    private final double pi = 3.1428;

    public Cone(double radius, double height, double slantHeight) {
        super(radius);
        this.h = height;
        this.s = slantHeight;
    }

    public void calcArea() {
        a = (pi * r * s) + (pi * r * r); // Area = π*r*s + π*r²
    }

    public void calcVolume() {
        v = (pi * r * r * h) / 3; // Volume = (1/3)πr²h
    }

    @Override
    public void dispArea() {
        System.out.printf("Surface Area of Cone: %.2f\n", a);
    }

    @Override
    public void dispVolume() {
        System.out.printf("Volume of Cone: %.2f\n", v);
    }
}


public class exp1 {
	 public static void main(String[] args) {
	        // Create a cone with radius = 5, height = 10, and slant height = 12
	        Cone cone = new Cone(5, 10, 12);

	        // Calculate area and volume
	        cone.calcArea();
	        cone.calcVolume();

	        // Display area and volume
	        cone.dispArea();
	        cone.dispVolume();
	    }
}
