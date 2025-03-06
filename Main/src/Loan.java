import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private double loanAmount;
    private int numberOfYears;
    private java.util.Date loanDate;

    // Default constructor
    public Loan() {
        this(2.5, 1, 1000); // Default values
    }

    // Parameterized constructor
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date(); // Sets the date to the current date
    }

    // Getter methods
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }

    // Setter methods
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // Method to calculate monthly payment
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        return (loanAmount * monthlyInterestRate) /
                (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    }

    // Method to calculate total payment
    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}