package vn.titv.bookstore_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;
@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "buy_address", length = 512)
    private String buyAddress;
    @Column(name = "recieve_address", length = 512)
    private String reciveAddress;
    @Column(name = "total_amount")
    private double totalAmount;
    @Column(name = "delivery_fee")
    private double deliveryFee;
    @Column(name = "cast_fee")
    private double castFee;
    @Column(name = "total_monney")
    private double total;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails;

    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "payment_id")
    private Payment payment;

    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;
}
