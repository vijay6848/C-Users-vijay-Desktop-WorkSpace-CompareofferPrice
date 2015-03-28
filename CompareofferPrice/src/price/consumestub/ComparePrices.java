package price.consumestub;


import java.util.Collections;
import java.util.List;

import price.infostub.Product;
import price.infostub.ProductListProducers;

public class ComparePrices {

	public  Product bestdeal(String prodname){
		
		
		
	ProductListProducers  pro  = new ProductListProducers();
	List <Product>  prodlist=  pro.getProductList("laptop");
	Collections.sort(prodlist);
	return  prodlist.get(0);
	}
	
}
