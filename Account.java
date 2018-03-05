import java.util.Scanner;//12
public class Account {    
       Scanner scanner = new Scanner(System.in);     
   private int balance;
   public Boolean status = false;
   public void openaccount(String input) {
       int money =0;       
       try {
         input= scanner.next();
         money= Integer.parseInt(input);         
       }
       catch(Exception ex) {
           System.out.println("開戶失敗! 請輸入金額!");
       }
       if(money>=1000) {
           status=true;
           balance = balance + money;
           System.out.println("開戶成功! 您存入" + money + "元");
       } else if(money<1000 && money>0) {
           System.out.println("開戶失敗! 存入金額不足，需>=1000!");
       } else if(money<0){
           System.out.println("開戶失敗! 請輸入非負數值");
       } 
   }
   public void deposit(String input) {
       int money =0;      
       try {
         input= scanner.next();
         money= Integer.parseInt(input);         
       }
       catch(Exception ex) {
           System.out.println("存款失敗! 請輸入金額!");
       }
       if(money>0) {
           status=true;
           balance = balance + money;           
           System.out.println("存款成功! 您存入" + money + "元");
       } else if(money<0){
           System.out.println("存款失敗! 請輸入非負數值");
       } 
   }
   public void withdraw(String input) {
       int money =0;
       input= scanner.next();
       try {
         money= Integer.parseInt(input);         
       }
       catch(Exception ex) {
           System.out.println("提款失敗! 請輸入金額!");
       }
       if(money>balance) {
           status=true;
           System.out.println("提款失敗! 您提款金額大於目前餘額!");
       } else if(money>0 && money<balance) {
           balance=balance-money;
           System.out.println("提款成功! 您成功領出" + money + "元");
       } else if(money<0){
           System.out.println("提款失敗! 請輸入非負數值");
       } 
       }
   public void currentBalance(String input) {
       System.out.println(balance + "元");
   }
}
