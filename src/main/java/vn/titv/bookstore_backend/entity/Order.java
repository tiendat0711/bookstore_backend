package vn.titv.bookstore_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;
@Data
@Entity
@Table(name = "order")
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
    private String recieveAddress;
    @Column(name = "total_amount")
    private Double totalAmount;
    @OneToMany(
            mappedBy = "order",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })

    private List<OrderDetail> listOrderDetails;

    @ManyToOne(
            fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    }
    )

    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "delivery_fee")
    private Double deliveryFee;
    @Column(name = "delivery_payment")
    private Double deliveryPayment;

    @ManyToOne(
            fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    }
    )
    @JoinColumn(name = "paymentmethod_id", nullable = true)

    private PaymentMethod paymentMethod;

    @ManyToOne(
            fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    }
    )
    @JoinColumn(name = "deliverymethod_id", nullable = true)
    private DeliveryMethod deliveryMethod;
}
