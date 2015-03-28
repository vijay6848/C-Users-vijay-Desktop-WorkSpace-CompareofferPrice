package price.infostub;

import java.util.ArrayList;
import java.util.List;

public class ProductListProducers {

	public  List <Product> getProductList (String prodname){
	
		if("Laptop".equalsIgnoreCase(prodname)){
	List <Product> prod = new ArrayList<Product>();
	
	Product prod1 = new Product(1000.0,20.0f);
	
	Product prod2 = new Product(1000,10.0f);
	
	prod.add(prod1);
	prod.add(prod2);
	
	return  prod;
	
		}
     return new ArrayList<Product>();
     
	}
	
	
	
	
}
