package org.example;

public class InternetOperator {
    private double cost;
    private String operator;
    private int numOfSub;

    public InternetOperator(double tariffCost, String operator, int numOfSub) {
        this.cost = tariffCost;
        this.operator = operator;
        this.numOfSub = numOfSub;
    }

    public double calculate() {
        return cost * numOfSub;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getNumOfSub() {
        return numOfSub;
    }

    public void setNumOfSub(int numOfSub) {
        this.numOfSub = numOfSub;
    }
}
