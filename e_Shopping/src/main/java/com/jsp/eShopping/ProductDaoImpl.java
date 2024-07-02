package com.jsp.eShopping;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public  class ProductDaoImpl implements ProductDao{

	@Override
	public void addProduct(Product product) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("e_Shopping");
		EntityManager manager=factory.createEntityManager();
		
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		System.out.println("Data Inserted");
		manager.persist(product);
		
		transaction.commit();
		
		manager.close();
		factory.close();
		
	}

	@Override
	public void getProductNameQuantityBrandBYUsingProductId(int productid) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("e_Shopping");
		EntityManager manager=factory.createEntityManager();
		
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		String select="select product.productname,product.productquantity,product.productbrand from Product product where product.productid=:pid";
		TypedQuery<Object[]> typedQuery = manager.createQuery(select, Object[].class);
		typedQuery.setParameter("pid",productid );
		List<Object[]> resultList = typedQuery.getResultList();
		System.out.println(resultList);
		for (Object[] objects : resultList) {
			String name=(String) objects[0];
			int quantity=(int) objects[1];
			String brand=(String) objects[2];
			System.out.println(name);
			System.out.println(quantity);
			System.out.println(brand);
			
		}
		manager.close();
		factory.close();
	}

	@Override
	public void getAllProducts() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("e_Shopping");
		EntityManager manager=factory.createEntityManager();
		
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Query query = manager.createNamedQuery("allProductDetails");
		List<Product> list = query.getResultList();
		System.out.println(list);
		
		
		manager.close();
		factory.close();
		
	}

	@Override
	public void getProductDetailsById(int productid) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("e_Shopping");
		EntityManager manager=factory.createEntityManager();
		
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Query query = manager.createNamedQuery("getProductById");
		query.setParameter("pid", productid);
		try {
	   Product product = (Product) query.getSingleResult();
	   System.out.println("product found :"+product);
		}
		catch (Exception e) {
			System.out.println("No products are available");
		}
		
		
		manager.close();
		factory.close();
	}

	@Override
	public void getProductDetailsByBrand(String productbrand) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("e_Shopping");
		EntityManager manager=factory.createEntityManager();
		
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Query query = manager.createNamedQuery("getProductByBrand");
		query.setParameter("pbrand", productbrand);
		try {
	   Product product = (Product) query.getSingleResult();
	   System.out.println("product found :"+product);
		}
		catch (Exception e) {
			System.out.println("No product are available");
		}
		
		
		manager.close();
		factory.close();
		
	}

}
