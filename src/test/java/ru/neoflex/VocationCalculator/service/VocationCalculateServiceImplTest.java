package ru.neoflex.VocationCalculator.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.neoflex.VocationCalculator.VocationCalculateServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class VocationCalculateServiceImplTest {
    private static final VocationCalculateServiceImpl service = new VocationCalculateServiceImpl();

    @Test
    public void vocationCalculateShouldReturnZero() {
        assertEquals(0, service.calculateVocation(0, 0));
    }

    @Test
    public void vocationCalculateShouldReturnZeroWithNegativeParameters() {
        assertEquals(0, service.calculateVocation(-2, -1));
    }

    @Test
    public void vocationCalculateShouldReturnRightVocationPay() {
        assertEquals( 51194,(int) service.calculateVocation(100000, 15) );
    }
}
