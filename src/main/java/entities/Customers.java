package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customers")
public class Customers implements Serializable {

    private static final long serialVersionUID = -1798070786993154676L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer customerId;

    @Column(name = "first_name", unique = false, nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", unique = false, nullable = false, length = 100)
    private String lastName;

    @Column(name = "commit", unique = false, nullable = false, length = 100)
    private String commit;

    @Column(name = "customer_status", unique = false, nullable = false, length = 100)
    private String customerStatus;

    public Customers() {
    }

    public Customers(String firstName, String lastName, String commit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.commit = commit;
    }


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }
}