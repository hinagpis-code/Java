class Bank{
	
	private String name;
	private int pin;
	private int balance;
	
		Bank(String name, int pin, int balance){
			this.name = name;
			this.pin = pin;
			this.balance = balance;
		}
	
	public String setName(String name) {
		this.name = name;
		return name;
	}
	
	public void getName() {
		System.out.println(name);
	}
	
	public int setPin(int pin) {
		this.pin = pin;
		return pin;
	}
	
	public void getPin() {
		System.out.println(pin);
	}
	
	public int setBalance(int balance) {
		this.balance = balance;
		return balance;
	}
	
	public void getBalance() {
		System.out.println(balance);
	}
}

public class BankDemo {

	public static void main(String[] args) {
		
		Bank account1 = new Bank("Unknown Name", 0000, 100);
		
		//we will get first the default value
		System.out.println("Default Value");
		account1.getName();
		account1.getPin();
		account1.getBalance();
		
		//we will set new value
		account1.setName("Hinagpiss Code");
		account1.setPin(2233);
		account1.setBalance(5000000);
		
		//we will get the new value
		System.out.println("\nNew Value");
		account1.getName();
		account1.getPin();
		account1.getBalance();
		
	}

}

