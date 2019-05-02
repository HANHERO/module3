package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bookings")
public class Bookings implements Serializable {
    private static final long serialVersionUID = -1798070786993154676L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer bookingId;

    @Column(name = "total_price", unique = true, nullable = false)
    private Integer totalPrice;

    public Bookings() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
}
