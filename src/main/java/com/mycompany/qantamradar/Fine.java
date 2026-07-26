package com.mycompany.qantamradar;

import java.util.*;

public class Fine {
    private String plateNumber;
    private ArrayList<Violation> violations;


    public Fine() {
    }

    public Fine(String plateNumber, ArrayList<Violation> violations) {
        this.plateNumber = plateNumber;
        this.violations = violations;

    }


    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public List<Violation> getViolations() {
        return violations;
    }

    public void setViolations(ArrayList<Violation> violations) {
        this.violations = violations;
    }


    public int CalculateTotalPrice() {
        int total = 0;

        for (Violation violation : violations) {
            total += violation.getAmount();
        }
        return total;

    }

    public void printfine() {
        System.out.println("Traffic " +
                "for car " + plateNumber
        );
        System.out.println("Total amount: " + CalculateTotalPrice()+" EGP");
        System.out.println("Violations:");
        for (Violation violation : violations) {

            System.out.println(
                    violation.getDescription()
                            + " : "
                            + violation.getAmount()
                            + " EGP"
            );

        }

    }
    @Override
    public String toString () {
        return "Fine{" +
                "plateNumber='" + plateNumber + '\'' +
                ", violations=" + violations +
                '}';
    }

    }
