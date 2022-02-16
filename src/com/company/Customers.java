package com.company;

public class Customers {
    private String name;
    private double credit;
    private int score;

    public void setCredit(double customerCredit) {
        credit = customerCredit;

    }//end set name

    public double getCredit() {
        return credit;
    }//return score

    public void setName(String customerName) {
        name = customerName;

    }//end set name

    public void setScore(int creditScore) {
        score = creditScore;

    }//end setscore

    public int getScore() {
        return score;
    }//return score

    public String getName() {
        return name;
    }//return name

    //determine interest rate
    public double interestRate()
    {
        if (score >= 300 && score <= 579) {
            return 19.85;
        }
        else if (score >= 580 && score <= 669) {
            return 15.91;
        }
        else if (score >= 670 && score <= 739) {
            return 9.77;
        }
        else if (score >= 740 && score <= 799) {
            return 5.35;
        }
        else if (score >= 800 && score <= 850) {
            return 3.68;
        }
        else{
            //System.out.println("You do not qualify");
            return 0;

        }

    }
}
