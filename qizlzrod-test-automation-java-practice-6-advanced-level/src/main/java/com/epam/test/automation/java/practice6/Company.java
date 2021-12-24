package com.epam.test.automation.java.practice6;


import java.math.BigDecimal;

public class Company {
    private Employee[] employees;

    public Company(Employee... employees) {
        this.employees = employees;
    }

    public void giveEverybodyBonus(BigDecimal companyBonus) {
        for (Employee e : employees) e.setBonus(companyBonus);
    }

    public BigDecimal totalToPay() {
        BigDecimal totalSalary = new BigDecimal(0);
        for (Employee e : employees) totalSalary = totalSalary.add(e.toPay());
        return totalSalary;
    }

    public String nameMaxSalary() {
        BigDecimal maxSalary = new BigDecimal(0);
        String maxSalaryEmployeeLastName = null;
        for (Employee e : employees)
            if (e.toPay().compareTo(maxSalary) > 0) {
                maxSalary = e.toPay();
                maxSalaryEmployeeLastName = e.getLastName();
            }
        return maxSalaryEmployeeLastName;
    }
}
