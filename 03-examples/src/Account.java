public class Account {
    private int accountNo;
    private String name;
    private float amount;

    public void insert(int accountNo, String name, float amount) {
        this.accountNo = accountNo;
        this.name = name;
        this.amount = amount;
    }

    public void withdraw(float amount) {
        if (this.amount - amount < 0) {
            System.out.println("No enough amount");
            return;
        }
        this.amount -= amount;
    }

    public void deposit(float amount) {
        this.amount += amount;
    }

    public void checkBalance() {
        System.out.println("Your balance is: " + this.amount);
    }

    public String toString() {
        return "Account{accountNo: " + this.accountNo + ", name: " + this.name + ", amount: " + this.amount + "}";
    }
}
