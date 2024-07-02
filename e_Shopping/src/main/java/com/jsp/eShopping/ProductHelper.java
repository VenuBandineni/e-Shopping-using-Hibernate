package com.jsp.eShopping;

import com.jsp.eShopping.ProductDao;
import com.jsp.eShopping.ProductDaoImpl;

public class ProductHelper {
	public static  ProductDao UserHelper() {
		ProductDao dao= new ProductDaoImpl();
		return dao;
	}
}
