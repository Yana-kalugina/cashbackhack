package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    void remain2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int amount = 500;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    void remain3() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int amount = 100;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    void remain4() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int amount = 999;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    void remain5() {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int amount = 1;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    void remain6() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}