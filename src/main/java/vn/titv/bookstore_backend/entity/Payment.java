package vn.titv.bookstore_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int paymentMethodId;
    @Column(name = "payment_name")
    private String paymentMethodName;
    @Column(name = "describes")
    private String describe;
    @Column(name = "payment_fee")
    private double paymentFee;

    @OneToMany(mappedBy ="payment" ,fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    private List<Order> orders;
}
