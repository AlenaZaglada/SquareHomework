package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void testSquareFound() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 500);
        int expected = 8;

        Assertions.assertEquals(expected, actual);



    }


}