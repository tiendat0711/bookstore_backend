package vn.titv.bookstore_backend.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private int imageId;
    @Column(name = "name")
    private String name;
    @Column(name = "is_icon")
    private boolean isIcon;
    @Column(name = "image_link")
    private String link;
    @Column(name = "iamge_data")
    @Lob
    private String data;

    @ManyToOne(
            fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
            }
    )

    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
}
