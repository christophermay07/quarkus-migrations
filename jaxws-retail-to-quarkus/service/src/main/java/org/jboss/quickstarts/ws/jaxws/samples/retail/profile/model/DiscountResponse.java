package org.jboss.quickstarts.ws.jaxws.samples.retail.profile.model;

public class DiscountResponse {
    private Customer customer;
    private double discount;

    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}