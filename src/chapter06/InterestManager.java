package chapter06;

public class InterestManager {
    public static void main(String[] args) {
        InterestManager interestManager = new InterestManager();
        for(int i = 10; i <=370; i+=10) {
            double amount = interestManager.calculateAmount(i, 1000000);
            System.out.println( i + ":" + amount);

        }
    }

    public double getInterestRate(int day) {
        double interestPercent = 0.0;
        if(day <= 90) {
            interestPercent =  0.5;
        } else if( 90 < day  && day <= 180) {
            interestPercent = 1.0;
        } else if( 180 < day  && day < 365) {
            interestPercent = 2.0;
        } else {
            interestPercent = 5.6;
        }
        return interestPercent;
    }

    public double calculateAmount(int day, long amount) {
        double interestRate = getInterestRate(day);
        double interest = (interestRate * amount) /100;
        return amount + interest;
    }


}

