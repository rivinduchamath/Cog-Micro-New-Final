/**
 * @author - Chamath_Wijayarathna
 * Date :7/4/2022
 */


package com.cloudofgoods.microservice.customers.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customers { // Entity Class Item
    @Id
    @SequenceGenerator(
            name = "customer_id_sequence",
            sequenceName = "customer_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_sequence"
    )
    private Long id;
    private  String customer_name;
    private String customer_description;
    private String address;
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_time;
    private int mobile_number;

}
