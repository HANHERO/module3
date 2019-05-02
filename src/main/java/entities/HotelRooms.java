package entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "hotel_rooms")
public class HotelRooms implements Serializable {

    private static final long serialVersionUID = -1798070786993154676L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer roomId;

    @Column(name = "room_capacity", unique = false, nullable = false, length = 100)
    private Integer roomCapacity;

    @Column(name = "comfort", unique = false, nullable = false, length = 100)
    private String comfort;

    @Column(name = "status", unique = false, nullable = false, length = 100)
    private String status;

    public HotelRooms() {
    }

    public HotelRooms(int roomCapacity, String comfort, String status) {
        this.roomCapacity = roomCapacity;
        this.comfort = comfort;
        this.status = status;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public Integer getRoomCapacity() {
        return roomCapacity;
    }

    public String getComfort() {
        return comfort;
    }

    public String getStatus() {
        return status;
    }

    public void setRoomCapacity(Integer roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public void setComfort(String comfort) {
        this.comfort = comfort;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}