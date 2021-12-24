package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private final int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (percent < 0) throw new IllegalArgumentException();
        else if (percent > 100 && percent < 200) bonus = bonus.multiply(BigDecimal.valueOf(2));
        else if (percent > 200) bonus = bonus.multiply(BigDecimal.valueOf(3));
        super.setBonus(bonus);
    }
}
