/**
 * @author - Chamath_Wijayarathna
 * Date :7/4/2022
 */


package com.cloudofgoods.microservice.items.entity;

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
public class Items { // Entity Class Item
    @Id
    @SequenceGenerator(
            name = "item_id_sequence",
            sequenceName = "item_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "item_id_sequence"
    )
    private Long id;
    private  String itemName;
    private String item_description;
    private double price;
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_time;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_time;

}
