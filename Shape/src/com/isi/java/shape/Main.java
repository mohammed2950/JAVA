package com.isi.java.shape;

import java.util.Random;

public class Main 
{
	public static void main(String[] args)
	{
		Rectangle rectangle=new Rectangle(10,20);
		Triangle triangle=new Triangle(10,20);
		Circle circle=new Circle();

		Shape shaper=(Shape)rectangle;
		Shape shapec=(Shape)circle;
		Shape shapet=(Shape)triangle;

		Shape[] shapeArray=new Shape[3];
		shapeArray[0]=shaper;
		shapeArray[1]=shapec;
		shapeArray[2]=shapet;
	}
	

		for(Shape shape : shapeArray)
		{

			shape.display();
		}
		Rectangle r=new Rectangle();
		Comparable<Shape> c=(Comparable<Shape>)r;
	}
	Shape[] shapes = new Shape[100];
	Random random = new Random(System.currentTimeMillis());
	for (int i = 0 ; i < shapesArray.length; i++ )
	{
		int randomshapes = random.nextInt(3);
		if(randomshapes == 0)
			shapes[1] = new Rectangle(random.nextInt(100)+1, random.nextInt)
			else if (randomshapes == 1)
				shapes[1] = new Triangle(random.nextInt(100)+1, random.nextInt)
				else if (randomshapes == 1)
					shapes[1] = new Circle(random.nextInt(100)+1);

	}
	for (shapes s : shapes)

		int i = 1;





}




}

