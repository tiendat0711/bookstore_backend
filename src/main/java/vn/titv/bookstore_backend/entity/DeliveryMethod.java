package vn.titv.bookstore_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "delivery_method")
public class DeliveryMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deliverymethod_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "describe")
    private String describe;
    @Column(name = "fee")
    private Double fee;

    @OneToMany(
            mappedBy = "deliveryMethod",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    private List<Order> orderList;
}
