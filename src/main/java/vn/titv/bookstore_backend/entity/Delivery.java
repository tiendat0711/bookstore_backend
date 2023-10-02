package vn.titv.bookstore_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "deliveries")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id")
    private int deliverymethodId;
    @Column(name = "deliverymethod_name")
    private String deliveryMethodName;
    @Column(name = "describes")
    private String describe;
    @Column(name = "delivery_fee")
    private double deliveryFee;

    @OneToMany(mappedBy = "delivery",fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    private List<Order> orders;
}
