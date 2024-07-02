package com.jsp.eShopping;

public interface ProductDao {
void addProduct(Product product);
void getProductNameQuantityBrandBYUsingProductId(int productid);
void getAllProducts();
void getProductDetailsById(int productid);
void getProductDetailsByBrand(String productbrand);
}
