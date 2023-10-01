package vn.titv.bookstore_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private long reviewId;
    @Column(name = "rate")
    private float rate;
    @Column(name = "comment")
    private String comment;

    @ManyToOne(
            fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    }
    )
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @ManyToOne(
            fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    }
    )
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
