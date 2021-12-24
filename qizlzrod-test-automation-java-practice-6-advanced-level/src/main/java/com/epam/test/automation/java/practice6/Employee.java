package com.epam.test.automation.java.practice6;


import java.math.BigDecimal;

public class Employee {
    private final String lastName;
    private BigDecimal salary;
    private BigDecimal bonus;

    public String getLastName() {
        return lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Employee(String lastName, BigDecimal salary) {
        if (salary.doubleValue() < 0) throw new IllegalArgumentException("Negative salary value");
        this.lastName = lastName;
        this.salary = salary;
        this.bonus = new BigDecimal(0);
    }

    public void setBonus(BigDecimal bonus) {
        if (bonus.doubleValue() < 0) throw new IllegalArgumentException("Negative bonus value");
        this.bonus = bonus;
    }

    public BigDecimal toPay() {
        return salary.add(bonus);
    }
}
