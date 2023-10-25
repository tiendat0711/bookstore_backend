package vn.titv.bookstore_backend.entity;

public class Notification {
    private String contain;

    public Notification(String contain) {
        this.contain = contain;
    }

    public String getContain() {
        return contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }
}
