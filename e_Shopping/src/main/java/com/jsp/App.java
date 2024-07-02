package com.jsp;

import java.util.Scanner;

import com.jsp.eShopping.Product;
import com.jsp.eShopping.ProductDao;
import com.jsp.eShopping.ProductDaoImpl;
import com.jsp.eShopping.ProductHelper;

/**
 * Hello world!
 *
 */
public class App  
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
       Product product=new Product();
       ProductDao dao = ProductHelper.UserHelper();
//      
//      
//       System.out.println("Enter Product Name:");
//       product.setProductname(sc.next());
//       System.out.println("Enter Product Price:");
//       product.setProductprice(sc.next());
//       System.out.println("Enter Product Quantity:");
//       product.setProductquantity(sc.next());
//       System.out.println("Enter Product Brand:");
//       product.setProductbrand(sc.next());
//       System.out.println("Enter Product Review:");
//       product.setProductreview(sc.next());
//       System.out.println("Enter Product Category:");
//       product.setProductcategory(sc.next());
//        
//       
//       helper.addProduct(product);
//    	System.out.println("Enter ProductId:");
//    	helper.getProductNameQuantityBrandBYUsingProductId(sc.nextInt());
       
//       dao.getAllProducts();
       dao.getProductDetailsById(10);
       dao.getProductDetailsByBrand("samsung");
      
    
    }
    
}
