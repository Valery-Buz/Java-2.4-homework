package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void sqrCalculate() {
        SQRService service = new SQRService();

        int myDown = 200;
        int myUp = 300;
        int expected = 3;
        int myResult = SQRService.sqrCalculate(myDown, myUp);

        assertEquals(expected, myResult);
    }

}