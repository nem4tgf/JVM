package Exam;

import java.util.Scanner;

public class Account {
    private static String customerCode;
    private String customerName;
    private int accNumber;
    private long amount;

    public Account(String customerCode, String customerName, int accNumber, long amount) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.accNumber = accNumber;
        this.amount = amount;
    }

    public Account() {
        input();
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter customer code (5 characters): ");
            customerCode = scanner.nextLine();
        }while (customerCode.length() !=5);

        do {
            System.out.println("Enter account number (6 characters, starts with 100): ");
            accNumber = scanner.nextInt();
        }while (String.valueOf(accNumber).length() != 6 || accNumber < 100000 || accNumber >= 100999);

        scanner.nextLine();
        System.out.println("Enter customer name: ");
        customerName = scanner.nextLine();

        amount = 100000;
    }

    public void depositAndWithdraw(long amount, int type){
        if (type == 0){
            this.amount += amount;
            System.out.println("Deposit Successful.");
        }else if (type == 1){
            if (this.amount >= amount){
                this.amount -= amount;
                System.out.println("Withdraw Successful");
            }else {
                System.out.println("Non-sufficient funds");
            }
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", accNumber=" + accNumber +
                ", amount=" + amount +
                '}';
    }

    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Type: ");
        System.out.println("0. Deposit");
        System.out.println("1. Withdraw");
        int type = scanner.nextInt();
        System.out.println("Enter amount: ");
        long amount = scanner.nextLong();
        account.depositAndWithdraw(amount,type);
        System.out.println(account);
    }
}
