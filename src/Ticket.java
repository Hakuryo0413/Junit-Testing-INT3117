public class Ticket {

    private int age;
    private String fareClass;
    private int priceOfTicket;


    Ticket(String fareClass, int age) {
        this.fareClass = fareClass;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public String getFareClass() {
        return fareClass;
    }


    public int getPriceOfTicket(String fareClass, int age) {
        int priceOfTicket = 0;
        if (fareClass.equalsIgnoreCase("Business Class")) {
            if (age >= 7) {
                priceOfTicket = 4000000;  // Giá vé cho người lớn
            } else if (age < 7 && age >=0) {
                priceOfTicket = 1500000;  // Giá vé cho trẻ em
            } else {

                return -1;
            }
        } else if (fareClass.equalsIgnoreCase("Economy Class")) {
            if (age >= 7) {
                priceOfTicket = 3000000;  // Giá vé cho người lớn
            } else if (age < 7 && age >=0) {
                priceOfTicket = 700000;   // Giá vé cho trẻ em
            } else {
                return -1;
            }
        }
        return  priceOfTicket;
    }


}


