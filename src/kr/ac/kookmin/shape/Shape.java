package kr.ac.kookmin.shape;

public abstract class Shape {
	protected Point center;

	protected Shape(Point center) {
		super();
		this.center = center;
	}
	
	
	
	public Point getCenter()
	{
		return this.center;
	}
	
	public abstract Rectangle getBounds();
	public abstract void draw(Graphics g);
	

}
