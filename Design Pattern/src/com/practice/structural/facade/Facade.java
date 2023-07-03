package com.practice.structural.facade;

public class Facade {

    private ProductDao productDao;
    private Invoice invoice;
    private Payment payment;
    private SendNotification sendNotification;

    public Facade(){
        productDao = new ProductDao();
        invoice = new Invoice();
        payment = new Payment();
        sendNotification = new SendNotification();
    }

    public void createOrder(){
        Product product = productDao.getProduct(1);
        payment.makePayment();
        invoice.generateInvoice();
        sendNotification.send();
    }
}
