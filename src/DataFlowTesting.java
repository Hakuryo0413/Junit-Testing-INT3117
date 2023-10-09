import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DataFlowTesting {

    @Test
    void getPriceOfTicket1() {
        Ticket t1 = new Ticket("Business Class", 30);
        assertEquals(4000000, t1.getPriceOfTicket(t1.getFareClass(), t1.getAge()));
    }

    @Test
    void getPriceOfTicket2() {
        Ticket t2 = new Ticket("Business Class", 4);
        assertEquals(1500000, t2.getPriceOfTicket(t2.getFareClass(), t2.getAge()));
    }

    @Test
    void getPriceOfTicket3() {
        Ticket t3 = new Ticket("Economy Class", 2);
        assertEquals(700000, t3.getPriceOfTicket(t3.getFareClass(), t3.getAge()));
    }

    @Test
    void getPriceOfTicket4() {
        Ticket t4 = new Ticket("Economy Class", 20);
        assertEquals(3000000, t4.getPriceOfTicket(t4.getFareClass(), t4.getAge()));
    }

    @Test
    void getPriceOfTicket5() {
        Ticket t5 = new Ticket("Business Class", -2);
        assertEquals(-1, t5.getPriceOfTicket(t5.getFareClass(), t5.getAge()));
    }
    @Test
    void getPriceOfTicket6() {
        Ticket t6 = new Ticket("Economy Class", 2);
        assertEquals(700000, t6.getPriceOfTicket(t6.getFareClass(), t6.getAge()));
    }

    @Test
    void getPriceOfTicket7() {
        Ticket t7 = new Ticket("Business Class", 4);
        assertEquals(1500000, t7.getPriceOfTicket(t7.getFareClass(), t7.getAge()));
    }

    @Test
    void getPriceOfTicket8() {
        Ticket t8 = new Ticket("Business Class", 30);
        assertEquals(4000000, t8.getPriceOfTicket(t8.getFareClass(), t8.getAge()));
    }

    @Test
    void getPriceOfTicket9() {
        Ticket t9 = new Ticket("Economy Class", 2);
        assertEquals(700000, t9.getPriceOfTicket(t9.getFareClass(), t9.getAge()));
    }

    @Test
    void getPriceOfTicket10() {
        Ticket t10 = new Ticket("Economy Class", 60);
        assertEquals(3000000, t10.getPriceOfTicket(t10.getFareClass(), t10.getAge()));
    }
    @Test
    void getPriceOfTicket11() {
        Ticket t11 = new Ticket("Business Class", 30);
        assertEquals(4000000, t11.getPriceOfTicket(t11.getFareClass(), t11.getAge()));
    }
    @Test
    void getPriceOfTicket12() {
        Ticket t12 = new Ticket("Business Class", 4);
        assertEquals(1500000, t12.getPriceOfTicket(t12.getFareClass(), t12.getAge()));
    }
    @Test
    void getPriceOfTicket13() {
        Ticket t13 = new Ticket("Economy Class", 2);
        assertEquals(700000, t13.getPriceOfTicket(t13.getFareClass(), t13.getAge()));
    }
}