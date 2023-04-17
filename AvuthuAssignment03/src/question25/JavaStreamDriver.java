package question25;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<JavaStream> productsList = new ArrayList<JavaStream>(); 
		//Adding Products 
		productsList.add(new JavaStream("Dell Laptop",25000f)); 
		productsList.add(new JavaStream("Hp Laptop",30000f)); 
		List<Float> productPriceList2 =productsList.stream() 
		.filter(p -> p.price > 30000)// filtering data 
		.map(p->p.price) // fetching price 
		.collect(Collectors.toList()); // collecting as list 
		System.out.println(productPriceList2); 
		}


}
