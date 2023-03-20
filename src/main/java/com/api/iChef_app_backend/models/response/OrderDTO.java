package com.api.iChef_app_backend.models.response;

import com.api.iChef_app_backend.models.Address;
import com.api.iChef_app_backend.models.Client;
import com.api.iChef_app_backend.models.Payment;
import com.api.iChef_app_backend.models.Product;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDTO {

    @NotBlank
    private Double totalPrice;
    @NotBlank
    private Client client;
    @NotBlank
    private Payment payment;
    @NotBlank
    private List<Product> products;
    private LocalDateTime dateTime;

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
