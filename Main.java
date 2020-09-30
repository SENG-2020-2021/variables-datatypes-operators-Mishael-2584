class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   // declare variables days the debtor defaulted, amount the debtor is to pay per day,amount the debtor paid and assign values to them
   int daysDefaulted=1; float dailyAmountToPay=500; float amountPaid=3300;

   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for
   float totalAmountToPay; int daysPaid; float amountDue; 
   int daysNotPaid;

   // calculate and print total amount the debtor is to pay
   totalAmountToPay = (dailyAmountToPay * daysDefaulted) + (amountPaid%dailyAmountToPay)+(amountPaid);
    System.out.println(totalAmountToPay);

   // calculate and print the days the debtor paid for
    daysPaid = (int)amountPaid/(int)dailyAmountToPay;
    System.out.println(daysPaid);

  // calculate and print the amount whose day was not captured because the amount was incomplete
  float amountNotCaptured;
  amountNotCaptured = totalAmountToPay % dailyAmountToPay;
 System.out.println(amountNotCaptured);

   // calculate and print amount the debtor is left to pay
  amountDue = totalAmountToPay-amountPaid;
  System.out.println(amountDue);

   // calculate and print days the debtor has not payed for
  daysNotPaid= ((int)amountDue/(int)dailyAmountToPay)+daysDefaulted;
  System.out.println(daysNotPaid);

   //kindly remove the statement below when you are done with the assignment











    
  }
}