package oopWithNLayeredApp4.business;

import java.text.Format;
import java.util.List;

import oopWithNLayeredApp4.core.log.ILogger;
import oopWithNLayeredApp4.dataAccess.JdbcProductDao;
import oopWithNLayeredApp4.dataAccess.ProductDao;
import oopWithNLayeredApp4.entities.Product;


public class ProductManager {
	
	private ProductDao productDao;
	private ILogger[] loggers;
	
	
	public ProductManager(ProductDao productDao, ILogger[] loggers) {
		super();
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception {
		if(product.getUnitPrice() < 10) {
			throw new Exception("ürün fiyatı 10dan küçük olamaz");
		}
		
		productDao.add(product);
		
		for (ILogger iLogger : loggers) {
			iLogger.log(product.getName());
		}
	}
	
}
