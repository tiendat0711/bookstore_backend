package vn.titv.bookstore_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int bookId ;

    @Column(name = "name", length = 256)
    private String name ;

    @Column(name = "author", length = 512)
    private String author;

    @Column(name = "isbn", length = 256)
    private String ISBN ;

    @Column(name = "describe", columnDefinition = "text")
    private String describe;

    @Column(name = "list_price")
    private double listPrice;
    @Column(name = "price")
    private double price;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "rate")
    private double rate;

    @ManyToMany(fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH

    })
    @JoinTable(
            name = "book_category",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private  List<Category> listCategories;

    @OneToMany(
            mappedBy = "book",fetch = FetchType.LAZY,cascade = {
            CascadeType.ALL
            }
    )

    private List<Image> listImages;

    @OneToMany(
            mappedBy = "book",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    }
    )
    private List<Review> listReviews;

    @OneToMany(
            mappedBy = "book",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    }
    )
    private List<OrderDetail> listOrderDetails;
    @OneToMany(
            mappedBy = "book",fetch = FetchType.LAZY,cascade = {CascadeType.ALL}
    )
    private List<Favorite> listFavorites;







}
