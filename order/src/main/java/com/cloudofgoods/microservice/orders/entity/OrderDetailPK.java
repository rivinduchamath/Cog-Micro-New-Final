/**
 * @author - Chamath_Wijayarathna
 * Date :7/5/2022
 */


package com.cloudofgoods.microservice.orders.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderDetailPK implements Serializable {
   private static final long serialVersionUID = -7634843530277617698L;
   @Column(name = "order_id")
   private Long orderId;
   @Column(name="item_id")
   private Long itemCode;

   public OrderDetailPK() {
   }

   public OrderDetailPK(Long orderId, Long itemCode) {
      this.orderId = orderId;
      this.itemCode = itemCode;
   }

   public Long getOrderId() {
      return orderId;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getItemCode() {
      return itemCode;
   }

   public void setItemCode(Long itemCode) {
      this.itemCode = itemCode;
   }

   @Override
   public String toString() {
      return "OrderDetailPK{" +
              "orderId='" + orderId + '\'' +
              ", itemCode='" + itemCode + '\'' +
              '}';
   }
}
