package com.aigui.pojo;

public class Shop {
    int amount, price;
    String shopname;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    @Override
    public String toString() {
        return "shop{" +
                "amount=" + amount +
                ", price=" + price +
                ", shopname='" + shopname + '\'' +
                '}';
    }

}
