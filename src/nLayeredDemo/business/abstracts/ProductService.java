package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductService {

	public void add(Product product);
	void update(Product product);
	void delete(Product product);
	List<Product> getAll();
}
