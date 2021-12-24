package com.epam.test.automation.java.practice6;


import java.math.BigDecimal;

public class Manager extends Employee {
    private final int quantity;

    public Manager(String lastName, BigDecimal salary, int clientAmount) {
        super(lastName, salary);
        quantity = clientAmount;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (quantity < 0) throw new IllegalArgumentException();
        else if (quantity > 100 && quantity <= 150) bonus = bonus.add(BigDecimal.valueOf(500));
        else if (quantity > 150) bonus = bonus.add(BigDecimal.valueOf(1000));
        super.setBonus(bonus);
    }
}
