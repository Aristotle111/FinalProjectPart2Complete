/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectday1;

/**
 *
 * @author 6312971
 */
public class CreditCard {
    
    private Money balance = new Money(0);
    private Money creditLimit = new Money(1000);
    private Person owner = new Person("","", new Address("","","",""));

    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = limit;
    }
    public String getPersonals() {
        return this.owner.toString();
    }
    public Money getCreditLimit() {
        return this.creditLimit;
    }
    public Money getBalance() {
        return this.balance;
    }
    public void charge(Money amount) {
        Money difference = this.balance.add(amount);
        if (difference.compareTo(this.creditLimit) != 1) {
            this.balance = this.balance.add(amount);
            System.out.println("Charge: "+ amount);
        }
        else {
            System.out.println("Exceeds credit limit");
        }
    }
    public void payment(Money amount) {
        Money difference = this.balance.subtract(amount);
        if (difference.compareTo(new Money(0)) != -1) {
            this.balance = this.balance.subtract(amount);
            System.out.println("Payment: "+ amount);
        }
        else {
            System.out.println("Exceeds credit limit");
        }
    }
}
