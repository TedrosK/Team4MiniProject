package org.example;

public class Snacks {
    private String product;
    private double snackPrice;


    public Snacks() {
    }

    public Snacks(String product, double snackPrice) {
        this.product = product;
        this.snackPrice = snackPrice;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(double snackPrice) {
        this.snackPrice = snackPrice;
    }

    public String test(){
        return "This is a test";
    }

}
