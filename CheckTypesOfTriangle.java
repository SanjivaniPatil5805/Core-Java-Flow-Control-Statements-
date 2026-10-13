package com.practice;

public class CheckTypesOfTriangle {

	public static void main(String[] args) {
		
		double firstSide = 21;
	    double secondSide = 21;
	    double thirdSide = 18.98;
	    
	    if(firstSide == secondSide && firstSide == thirdSide) {
	    	
	    	System.out.println("Equilateral");
	    	
	    }else if(firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
	    	
	    	System.out.println("Isosceles");
	    	
	    }else {
	    	
	    	System.out.println("Scalene");
	    
	    }
		
	}
	
}
