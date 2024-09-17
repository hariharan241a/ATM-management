import java.util.*;
public class ATM {
    // Get user data
    public String name = "Hariharan";
    private int PIN = 2002;
    private int balance = 5000;

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int pwd) {
        this.PIN = pwd;
    }

    public int getAmount() {
        return balance;
    }

    public void setBalance(int addAmount) {
        this.balance += addAmount;
    }

    public int getWithdrawal() {
        return balance;
    }

    public void setWithdrawal(int takeWithdrawal) {
        this.balance -= takeWithdrawal;
    }

    public void changePwd(int addPIN) {
        this.PIN = addPIN;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();  // instance class
        Scanner t1 = new Scanner(System.in);
        System.out.println("Please select ID:, DOMESTIC, INTERNATIONAL");

        int select = t1.nextInt();

        if (select == 1) {
            System.out.println("Welcome HDFC Bank " + atm.name);
        } else {
            System.out.println("Sorry not available.");

        }

        System.out.print("Enter Your PIN: ");
        
        int pwd = t1.nextInt();

        if(pwd == atm.PIN) {
            System.out.println("Please select a transaction |, Balance Inquire[1], Deposit[2], Cash Withdrawal[3], PIN Change[4]");
            System.out.println("OPTIONS Click:  1 | 2 | 3 | 4");
        } else {
            System.out.println("Incorrect PIN. Please try again.");
        }

        System.out.print("HDFC Bank select: ");

        int s1 = t1.nextInt();

        switch (s1) {
            case 1:
            System.out.println("Your balance is: " + atm.balance);
            break;
            case 2:
            if (s1 == 1) {
                System.out.println("Current Account: ");
            } else if (s1 == 2) {
                System.out.println("Saving Account: ");
                System.out.println("Cash Available: RS₹: 100, 200, 500");
                System.out.println("Insert amount: ");
                int addAmount = t1.nextInt();
                atm.setBalance(addAmount); 
                System.out.println("Your balance is: " + atm.balance);
            } else {
                System.out.println("Invalid selection.");
            }
            break;
            case 3:
            System.out.println("Please Enter Amount\n(Cash Available RS₹: 100, 200, 500)");
            System.out.println("Enter Amount: ");
            int takeWithdrawal = t1.nextInt();
            atm.setWithdrawal(takeWithdrawal);
            System.out.println("Your balance is: " + atm.balance);
            break;
            case 4:
            System.out.print("Enter new PIN: ");
            int addPIN = t1.nextInt();
            atm.changePwd(addPIN);
            System.out.println("PIN successfully changed.");
            break;
            }
            t1.close();
        }
    }
