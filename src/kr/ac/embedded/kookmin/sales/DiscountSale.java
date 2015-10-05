package kr.ac.embedded.kookmin.sales;

/**
 * Class for a sale of one item with discount expressed as a percent of the
 * price, but no other adjustments. Class invariant: The price is always
 * nonnegative; the name is a nonempty string; the discount is always
 * nonnegative.
 */

public class DiscountSale extends Sale {
	private double	discount;	// A percent of the price. Cannot be negative.
								
	public DiscountSale() {
		
		
	}
	
	/**
	 * Precondition: theName is a nonempty string; thePrice is nonnegative;
	 * theDiscount is expressed as a percent of the price and is nonnegative.
	 */
	public DiscountSale(String theName, double thePrice, double theDiscount) {
		super(theName, thePrice);
		this.discount = theDiscount;
	}
	
	public DiscountSale(DiscountSale originalObject) {
		super(originalObject.getName(), originalObject.getPrice());
		discount = originalObject.getDiscount();
	}
	
	public static void announcement() {
		System.out.println("This is the DiscountSale class.");
	}
	
	public double bill() {
		return getPrice() - getPrice()/discount;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	/**
	 * Precondition: Discount is nonnegative.
	 */
	public void setDiscount(double newDiscount) {
		this.discount = newDiscount;
	}
	
	public String toString() {
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "   Total cost = $" + bill());
	}
	
	public boolean equals(Object otherObject) {
		if(super.equals(otherObject))
		{
			DiscountSale otherDiscount = (DiscountSale) otherObject;
			return discount == otherDiscount.discount;
		}
		return false;
	}
	
	
	public DiscountSale clone() {
		return new DiscountSale(this);
		
	}
}
