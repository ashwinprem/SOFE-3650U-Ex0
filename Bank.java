public class Bank {
   private int accountNumber; // user's account number
   private int pin; // user's account password

   private int funds;

   /* Blank Constructor */
   public Bank ()
   {
      funds = 0;
   }

   /* Method for Getting the account number */
   public int getAccountNumber ()
   {
      return accountNumber;
   }

   /* Method for setting the account number */
   public void setAccountNumber(int Account)
   {
      this.accountNumber = Account;
   }

   /* Method for Getting the Pin */
   public void getPin ()
   {
      System.out.println("Your pin is: " + pin);
   }
   /* Method for setting the pin */
   public void setPin(int PIN)
   {
      this.pin = PIN;
   }

   public void deposit(int amount)
   {
      funds += amount;
   }

   public void balance()
   {
       System.out.println("You have $"+ funds + " in your account");
   }

   public void withdraw(int amount)
   {
      if (amount <= funds)
         funds = funds - amount;
      else
         System.out.println("You do not have enough funds in your account.");
   }
}