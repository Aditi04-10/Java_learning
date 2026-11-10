package three.Abstraction;
/* Hiding up the main implementation and showing up the necessary details to the user is called three.Abstraction.
We can implement java in two ways - Abstract Classes & Interfaces
Abstract Classes
--Abstract Keyword -> class
--Methods are also abstract --> abstract (No body only declaration)
--Methods with body can exist.
--Cannot Instantiate directly means cannot make object.

Benefit of three.Abstraction is to forcefully providing the definition otherwise we can do Override through inheritance
*/
public class AbstractionDemo {
    static void main() {
        SavingAccount SA = new SavingAccount("SBI8768756", 12000);
        SA.deposit(100);

        BankAccount SA1 = new SavingAccount("AXIS98643", 80000);
        SA1 = new CurrentAccount("ICICI9845", 150000);  // We can make object like that
        SA1.deposit(200);

        System.out.println(SA.getAccountNumber());
        SA1 = new SavingAccount("PNB94658765", 4000000);
        System.out.println(SA1.getAccountNumber());
    }
}
