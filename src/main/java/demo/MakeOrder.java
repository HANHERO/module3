package demo;

import java.util.Date;

public class MakeOrder {
    private int roomCapacity;
    private String comfort;
    private Date settlementDate;
    private Date dateOfEviction;

    public MakeOrder(int roomCapacity, String comfort, Date settlementDate, Date dateOfEviction) {
        this.roomCapacity = roomCapacity;
        this.comfort = comfort;
        this.settlementDate = settlementDate;
        this.dateOfEviction = dateOfEviction;
        checkAvailableRooms();
    }

    private void checkAvailableRooms() {
        if (roomCapacity <= 3) {

        }
        if (roomCapacity > 3 && roomCapacity <= 5) {

        }
        if (roomCapacity > 5 && roomCapacity <= 10) {

        } else System.out.println("Таких комнат нет");
    }
}