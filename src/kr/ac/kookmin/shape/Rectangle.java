package kr.ac.kookmin.shape;

public class Rectangle extends Shape {
	
	private int h;
	private int w;
	
	
	
	public Rectangle(Point center, int w, int h) {
		super(center);
		this.h = h;
		this.w = w;
	}
	
	public int getHeight()
	{
		return h;	
	}
	
	public int getWidth()
	{
		return w;
	}
	
	
	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return this;
	}
	
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.draw(this);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}
	
	

	

}
