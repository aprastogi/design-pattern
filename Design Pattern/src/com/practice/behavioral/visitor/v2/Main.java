package com.practice.behavioral.visitor.v2;

public class Main {

    public static void main(String[] args) {

        GoldCreditCard goldCreditCard = new GoldCreditCard();
        SilverCreditCard silverCreditCard = new SilverCreditCard();
        BronzeCreditCard bronzeCreditCard = new BronzeCreditCard();

        HotelOffer hotelOffer = new HotelOffer();
        OnlineShoppingOffer onlineShoppingOffer = new OnlineShoppingOffer();

        System.out.println("Hotel Offers with multiple type of credit card");
        System.out.println("-------------------------------------------------------------------");
        goldCreditCard.accept(hotelOffer);
        silverCreditCard.accept(hotelOffer);
        bronzeCreditCard.accept(hotelOffer);
        System.out.println("-------------------------------------------------------------------");

        System.out.println("Online Shopping Offers with multiple type of credit card");
        System.out.println("-------------------------------------------------------------------");
        goldCreditCard.accept(onlineShoppingOffer);
        silverCreditCard.accept(onlineShoppingOffer);
        bronzeCreditCard.accept(onlineShoppingOffer);
    }
}
