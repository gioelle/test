package CCApp;
import java.util.ArrayList;
import CCApp.Wallet;

public class Person {
	private ArrayList<Wallet> wallets;
	private double totalIntOwed;
 
	public Person() {
		this.wallets = null;
	}

	public Person(Wallet wallet) {
		wallets.add(wallet);
	}
		
	public Person(Wallet wallet, Wallet wallet2) {
		wallets.add(wallet);
		wallets.add(wallet2);
	}
	
	
	public void calcTotalIntOwed() {
		for (Wallet wallet : wallets) {
			totalIntOwed += wallet.getWalletInterest();
		}
		
		System.out.println("total Int Owed: " +totalIntOwed);
	}

	
	public ArrayList<Wallet> getWallets() {
		return wallets;
	}
	public void setWallets(ArrayList<Wallet> wallets) {
		this.wallets = wallets;
	}
	public double getTotalIntOwed() {
		return totalIntOwed;
	}
	public void setTotalIntOwed(double totalIntOwed) {
		this.totalIntOwed = totalIntOwed;
	}
}
