package ru.neoflex.VocationCalculator;

import org.springframework.stereotype.Service;

@Service
public class VocationCalculateServiceImpl implements VocationCalculator{
    private final static double AVG_NUMBER_DAYS_IN_MONTH = 29.3;

    public double calculateVocation(double avgSalaryForYear, int vocationDays) {
        if (avgSalaryForYear <= 0 || vocationDays <= 0) {
            return 0;
        }
        return avgSalaryForYear / AVG_NUMBER_DAYS_IN_MONTH * vocationDays;
    }
}
