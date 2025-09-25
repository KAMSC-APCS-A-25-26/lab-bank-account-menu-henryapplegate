import java.util.Scanner;

public class BankAccountMenu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        double balance = 0.00, amount = 0.00;
        boolean menu = true;

        while(menu)
        {
            System.out.println("--- Bank Account Menu ---");
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:  ");
            choice = sc.nextInt();
            System.out.print("\n");


            switch(choice)
            {
                case 1:
                    System.out.println("How much would you like to add?  ");
                    amount = sc.nextDouble();
                    if(amount>0)
                    {
                        balance += amount;
                        System.out.println("Your new balance is: $" + balance);
                    }
                    else
                        System.out.println("Amount must be positive");
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw?  ");
                    amount = sc.nextDouble();
                    if(amount<=balance)
                    {
                        balance -= amount;
                        System.out.println("Your new balance is: $" + balance);
                    }
                    else
                        System.out.println("Insufficient funds");
                    break;
                case 3:
                    System.out.println("Your balance is: $" + balance);
                    break;
                case 4:
                    menu = false;
                    System.out.print("Goodbye!");
                    break;
            }

        }
    }
}