package figures;

public class FigureTest{
	public static void main(String[] args){
		Figure[] figure=new Figure[4];
		
		figure[0]=new Square("Square",5);
		figure[1]=new Rectangle("Rectangle",6,11);
		figure[2]=new Circle("Circle",3);
		figure[3]=new Triangle("Triangle",5,6,7);
		
		for(int i=0;i<figure.length;i++){
			System.out.println(figure[i].getName()+": area=" + figure[i].getArea()+
					"; perimetr="+ figure[i].getPerimeter());
		}		
	}
}

abstract class Figure {
	private String name;
	
	public Figure(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}

class Square extends Figure{
	private int side;
	
	public Square(String name,int side){
		super(name);
		this.side=side;
	}
	public void setSide(int side){
		this.side=side;
	}
	public int getSide(){
		return side;
	}
	public double getArea() {	
		return side*side;
	}
	public double getPerimeter() {
		return 4*side;
	}		
}

class Rectangle extends Figure{

	private int sideA;
	private int sideB;
	
	public Rectangle(String name,int sideA, int sideB){
		super(name);
		this.sideA=sideA;
		this.sideB=sideB;
	}
	public void setSides(int sideA,int sideB){
		this.sideA=sideA;
		this.sideB=sideB;
	}
	public int getSideA(){
		return sideA;
	}
	public int getSideB(){
		return sideB;
	}
	public double getArea() {
		return sideA*sideB;
	}
	public double getPerimeter() {	
		return (2*(sideA+sideB));
	}	
}

class Circle extends Figure{
	private int radius;
	
	public Circle(String name,int radius){
		super(name);
		this.radius=radius;
	}
	public void setRadius(int radius){
		this.radius=radius;
	}
	public int getRadius(){
		return radius;
	}
	public double getArea() {
		return (radius*radius*Math.PI);
	}
	public double getPerimeter() {
		return (2*Math.PI*radius);
	}	
}

class Triangle extends Figure{

	private int sideA;
	private int sideB;
	private int sideC;
	
	public Triangle(String name,int sideA,int sideB,int sideC){
		super(name);
		this.sideA=sideA;
		this.sideB=sideB;
		this.sideC=sideC;
	}
	public void setSides(int sideA,int sideB,int sideC){
		this.sideA=sideA;
		this.sideB=sideB;
		this.sideC=sideC;
	}
	public int getSideA(){
		return sideA;
	}
	public int getSideB(){
		return sideB;
	}
	public int getSideC(){
		return sideC;
	}
	public double getArea() {
		double semiPerimetr=getPerimeter()/2;		
		double area=Math.sqrt(semiPerimetr*(semiPerimetr-sideA)*(semiPerimetr-sideB)*(semiPerimetr-sideC));
		return area;
	}
	public double getPerimeter() {
		return (sideA+sideB+sideC);
	}	
}
