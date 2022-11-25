package Fund_Transfer;

import java.util.*;
class Account1
{
 String id;
 String name;
 int balance =0;
 Account1(String id,String name)
 {
 this.id=id;
 this.name=name;
 }
 Account1(String id,String name,int balance)
 {
 this.id=id;
 this.name=name;
 this.balance=balance;
 }
 String getID(){
 return this.id;
 }
 String getName(){
 return this.name;
 }
 int getBalance(){
 return this.balance;
 }
 int credit(int amount){
 this.balance=amount+this.balance;
 return this.balance;
 }
 int debit(int amount){
 if(amount<=this.balance)
 this.balance=this.balance - amount;
 else
 System.out.print("Amount exceeded balance");
 return this.balance;
 }
 int transferTo(Account1 another,int amount){
 if(amount<balance){
 this.debit(amount);
 another.credit(amount);
 }
 else
 System.out.println("Insufficient Balance");
 return this.balance;
 }
 public String toString() {
 return String.format("Account[id=%s,name=%s,balance=%d]", id,name,balance);

 }
}
public class Main
{
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 String id1=sc.nextLine();
 String name1=sc.nextLine();
 int balance1=sc.nextInt(); sc.nextLine();
 String id2=sc.nextLine();
 String name2=sc.nextLine();
 int amount1=sc.nextInt();
 int amount2=sc.nextInt();
 int amount3=sc.nextInt();
 Account1 a1 = new Account1(id1,name1,balance1);
 System.out.println(a1.toString());
 Account1 a2 = new Account1(id2,name2);
 System.out.println(a2.toString());
 a1.credit(amount1);
 a1.debit(amount2);
 a1.transferTo(a2,amount3);
 System.out.println(a1.toString());
 System.out.println(a2.toString());
 }
}
