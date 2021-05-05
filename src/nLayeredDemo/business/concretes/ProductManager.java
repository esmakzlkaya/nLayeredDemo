package nLayeredDemo.business.concretes;

import java.util.List;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		this.productDao=productDao;
		this.loggerService=loggerService;
	}
	
	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoriye �r�n eklenemez");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logTosystem("�r�n eklendi : "+product.getName());
	}

	@Override
	public void update(Product product) {
		System.out.println("�r�n g�ncellendi :"+product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("�r�n silindi :"+product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
