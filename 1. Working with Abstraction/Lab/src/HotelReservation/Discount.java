package HotelReservation;

public enum Discount {
    // The discount is applied to the total price and is one of the following:
    //•	20% for VIP clients - VIP
    //•	10% for clients, visiting for a second time - SecondVisit
    //•	0% if there is no discount - None

    VIP(20),
    SECONDVISIT(10),
    NONE(0);

    private int discount;

    Discount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
