import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class TicketTestCase {




    @Test
    void getPriceOfTicket1() {
        Ticket t1 = new Ticket("Business Class", -2);
        assertEquals(-1, t1.getPriceOfTicket(t1.getFareClass(),t1.getAge()));
    }
    @Test
    void getPriceOfTicket2() {
        Ticket t2 = new Ticket("Business Class", 4);
        assertEquals(1500000, t2.getPriceOfTicket(t2.getFareClass(),t2.getAge()));
    }
    @Test
    void getPriceOfTicket3() {
        Ticket t3 = new Ticket("Business Class", 30);
        assertEquals(4000000, t3.getPriceOfTicket(t3.getFareClass(),t3.getAge()));
    }@Test
    void getPriceOfTicket4() {
        Ticket t4 = new Ticket("Economy Class", -9);
        assertEquals(-1, t4.getPriceOfTicket(t4.getFareClass(),t4.getAge()));
    }@Test
    void getPriceOfTicket5() {
        Ticket t5 = new Ticket("Economy Class", 2);
        assertEquals(700000, t5.getPriceOfTicket(t5.getFareClass(),t5.getAge()));
    }@Test
    void getPriceOfTicket6() {
        Ticket t6 = new Ticket("Economy Class", 60);
        assertEquals(3000000, t6.getPriceOfTicket(t6.getFareClass(),t6.getAge()));
    }



}