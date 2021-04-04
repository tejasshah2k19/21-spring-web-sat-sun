package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bean.ProductBean;

public class ProductDao {

	@Autowired // this will ask ioc container for jdbcTempalte instance -- [singleton]
	JdbcTemplate stmt;

	public void insertProduct(ProductBean productBean) {
		// insert update delete
		int record = stmt.update("insert into product (productName,price,qty) values (?,?,?)",
				productBean.getProductName(), productBean.getPrice(), productBean.getQty());

		System.out.println(record + " :: inserted....");
	}

	public List<ProductBean> getAllProducts() {

		List<ProductBean> products = stmt.query("select * from product", new BeanPropertyRowMapper(ProductBean.class));
		return products;
	}

	public void deleteProduct(int productId) {
		int records = stmt.update("delete from product where productId =  ?", productId);
		System.out.println(records + " record(s) deleted....");
	}
}
