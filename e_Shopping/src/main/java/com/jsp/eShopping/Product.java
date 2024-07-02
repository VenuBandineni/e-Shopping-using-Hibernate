package com.jsp.eShopping;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@Table(name="product")
@NamedQuery(name="allProductDetails", query="SELECT p FROM Product p ")
@NamedQueries({@NamedQuery(name="getProductById" ,query="select product from Product product where product.productid=:pid"),
	@NamedQuery(name="getProductByBrand" , query="select product from Product product where product.productbrand=:pbrand")})

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int productid;

	@Column(nullable=false, length=45)
	private String productbrand;

	@Column(nullable=false, length=45)
	private String productcategory;

	@Column(nullable=false, length=45)
	private String productname;

	@Column(nullable=false, length=45)
	private String productprice;

	@Column(nullable=false, length=45)
	private int productquantity;

	@Column(nullable=false, length=45)
	private String productreview;

	public Product() {
	}

	public int getProductid() {
		return this.productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductbrand() {
		return this.productbrand;
	}

	public void setProductbrand(String productbrand) {
		this.productbrand = productbrand;
	}

	public String getProductcategory() {
		return this.productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductprice() {
		return this.productprice;
	}

	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}

	public int getProductquantity() {
		return this.productquantity;
	}

	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}

	public String getProductreview() {
		return this.productreview;
	}

	public void setProductreview(String productreview) {
		this.productreview = productreview;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productbrand=" + productbrand + ", productcategory="
				+ productcategory + ", productname=" + productname + ", productprice=" + productprice
				+ ", productquantity=" + productquantity + ", productreview=" + productreview + "]";
	}

}