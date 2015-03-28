package price.infostub;



public class Product implements Comparable {

	double  price;
	
	float discount =0.0f;
	
	 double discountedprice;
	
	 public Product(double p,float f)
	 {
		 this.price = p;
		 this.discount =f;
		 this.discountedprice = this.price - (this.discount*p/100);
	 }
	 
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountedprice() {
		return discountedprice;
	}

	public void setDiscountedprice(double discountedprice) {
		this.discountedprice = discountedprice;
	}

	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}

	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		double p1 = ((Product) this).getDiscountedprice();

		  double p2 = ((Product) o).getDiscountedprice();

	       if (p1 > p2) {
	           return 1;
	       } else if (p1 < p2){
	           return -1;
	       } else {
	           return 0;
	       }
	
		//return 0;
	}
	
	
	
	
	
}
