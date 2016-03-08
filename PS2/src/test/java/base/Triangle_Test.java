package base;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Triangle.Triangle;

public class Triangle_Test {
	
	public static Triangle T1;
	public static Triangle T2;
	public static Triangle T3;
	public static Triangle T4;
	
	/** Define Test Triangles */
	@Before
	public void setUpBeforeClass() throws Exception{
		T1 = new Triangle(3,4,5);
		T2 = new Triangle(0,0,0);
		T3 = new Triangle(6,8,10);
		T4 = new Triangle(1,2,1);
	}

	/** Test Area of Triangle */
	@Test
	public void test_getArea(){
		System.out.println("testArea");
		
		assertTrue(T1.getArea()==6);
		assertTrue(T2.getArea()==0);
		assertTrue(T3.getArea()==24);
		assertTrue(T4.getArea()==0);
		
	}/** End Method */
	
	/** Test Perimeter of Triangle */
	@Test
	public void test_getPerimeter(){
		System.out.println("testPerimeter");
		
		assertTrue(T1.getPerimeter()==12);
		assertTrue(T2.getPerimeter()==0);
		assertTrue(T3.getPerimeter()==24);
		assertTrue(T4.getPerimeter()==4);
	
	}/** End Method*/

}/** End Test Class */
