package vn.titv.bookstore_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "payment_method")
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentmethod_id")
    private int paymentmethodId;

    @Column(name = "name")
    private String name;
    @Column(name = "describe")
    private String describe;
    @Column(name = "fee")
    private Double fee;

    @OneToMany(
            mappedBy = "paymentMethod",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    private List<Order> orderList;
}
