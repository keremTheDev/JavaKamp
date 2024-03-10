package oopWithNLayeredApp4.dataAccess;

import oopWithNLayeredApp4.entities.Product;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("hibernate ile veritabanına eklendi");
		
	}

}
