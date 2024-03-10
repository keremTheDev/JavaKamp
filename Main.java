import java.util.List;

import oopWithNLayeredApp4.business.ProductManager;
import oopWithNLayeredApp4.core.log.DatabaseLogger;
import oopWithNLayeredApp4.core.log.ILogger;
import oopWithNLayeredApp4.core.log.MailLogger;
import oopWithNLayeredApp4.dataAccess.HibernateProductDao;
import oopWithNLayeredApp4.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Product product1 = new Product(1, "iphone xr", 10000);
		
		ILogger[] loggers = {new DatabaseLogger(),new MailLogger()};
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);	
		productManager.add(product1);
	}

}	