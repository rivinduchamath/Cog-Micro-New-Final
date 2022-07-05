/**
 * @author - Chamath_Wijayarathna
 * Date :7/5/2022
 */


package com.cloudofgoods.microservice.orders.entity;

import com.cloudofgoods.microservice.items.entity.Items;

import javax.persistence.*;

@Entity
public class OrderDetail {
    @EmbeddedId
    private OrderDetailPK orderDetailPK;
    private int qty;
    private double unitPrice;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name = "item_id", referencedColumnName = "item_id", insertable = false, updatable = false)
    private Items item_id;


    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name = "order_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Orders order;

    public OrderDetail() {
    }

    public OrderDetail(OrderDetailPK orderDetailPK, int qty, double unitPrice) {
        this.orderDetailPK = orderDetailPK;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public OrderDetail(Long orderId, Long item_id, int qty, double unitPrice) {
        this.orderDetailPK = new OrderDetailPK(orderId, item_id);
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public OrderDetail(Orders.OrdersBuilder builder) {
    }

    public OrderDetailPK getOrderDetailPK() {
        return orderDetailPK;
    }

    public void setOrderDetailPK(OrderDetailPK orderDetailPK) {
        this.orderDetailPK = orderDetailPK;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Items getItem() {
        return item_id;
    }

    public Orders getOrder() {
        return order;
    }

    public void setItem(Items item) {
        this.item_id = item;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderDetailPK=" + orderDetailPK +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
