package com.solstice.ecommercedemo.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Currency;

@Entity
public class LineItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "line_item_id")
    private Long lineItemId;

    private Long quantity;
    private BigDecimal price;

    @Column(name = "total_price")
    private Currency totalPrice;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Long product;

    @OneToOne
    @JoinColumn(name = "shipment_id")
    @Column(name = "shipment_id")
    private Shipment shipment;

    public LineItem() {
    }

    public LineItem(Long quantity, BigDecimal price, Long product, Currency totalPrice, Shipment shipment) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
        this.totalPrice = totalPrice;
        this.shipment = shipment;
    }

    public Long getLineItemId() {
        return lineItemId;
    }

    public void setLineItemId(Long lineItemId) {
        this.lineItemId = lineItemId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    public Currency getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Currency totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
}
