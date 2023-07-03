package com.practice.structural.facade;

public class ProductDao {

    public Product getProduct(int productId){
        System.out.println("Product picked with id " + productId);
        return new Product();
    }
}
