/**
 * @author - Chamath_Wijayarathna
 * Date :7/5/2022
 */


package com.cloudofgoods.microservice.orders.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Table(name = "`Order`")
public class Orders {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long order_id;
   private int borrower_id;
   private int order_status_id;
   private double total_amount;
   private double delivery_charge;
   private double other_fee;
   private Long customerId;
   @OneToMany(mappedBy = "order",cascade = {CascadeType.PERSIST ,CascadeType.DETACH,CascadeType.MERGE})
   private List<OrderDetail> orderDetails =new ArrayList<>();












}
