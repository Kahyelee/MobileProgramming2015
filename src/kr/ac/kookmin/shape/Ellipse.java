package kr.ac.kookmin.shape;

public class Ellipse extends Shape {
	private int w, h;

	public Ellipse(Point center, int w, int h) {
		super(center);
		this.w = w;
		this.h = h;
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return new Rectangle(center, w*2, h*2);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.draw(this);		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ellipse";
	}
	
}
