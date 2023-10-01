package vn.titv.bookstore_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private String id;
    @Column(name = "firstName", length = 255)
    private String firstName;
    @Column(name = "lastName", length = 255)
    private String lastName;
    @Column(name = "userName", length = 255)
    private  String userName;
    @Column(name = "password", length = 512)
    private String password;
    @Column(name = "sex", length = 255)
    private char sex;
    @Column(name = "email", length = 255)
    private String email;
    @Column(name = "phoneNumber", length = 255)
    private String phoneNumer;
    @Column(name = "buyAddress", length = 255)
    private String buyAddress;
    @Column(name = "recieveAddress", length = 255)
    private String recieveAddress;


    @OneToMany(
            mappedBy = "user_id",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    private List<Review> listReviews;


    @OneToMany(
            mappedBy = "user_id",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    private List<Favorite> listFavorites;


    @ManyToMany(fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH

    })
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> listRoles;


    @OneToMany(
            mappedBy = "user_id",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    private List<Order> listOrders;



}
