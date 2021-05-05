package nLayeredDemo;

import nLayeredDemo.adapters.JLoggerManagerAdapter;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		//To Do: Spring IOC ile iyileþtirilecek
		
		ProductService productService=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());

		Product product=new Product(1,2,"bardak",15,10);
		productService.add(product);
	}

}
