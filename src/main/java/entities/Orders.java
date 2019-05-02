package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer orderId;

    @Column(name = "first_name", unique = false, nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", unique = false, nullable = false, length = 100)
    private String lastName;

    @Column(name = "settlement_date", unique = false, nullable = false, length = 100)
    private Date settlementDate;

    @Column(name = "date_of_eviction", unique = false, nullable = false, length = 100)
    private Date dateOfEviction;

    @Column(name = "counter", unique = false, nullable = false, length = 100)
    private int counter;


    public Orders() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
