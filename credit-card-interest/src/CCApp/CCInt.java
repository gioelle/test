package CCApp;

import CCApp.Wallet;
import CCApp.Card;
/*
 * I give up....
 * 
 * 
 */
public class CCInt {
	public static void main(String[] args) {
		Person roger = new Person();
		Card vc = new Card(100, "V");
		Card mc = new Card(100, "M");
		Card dc = new Card(100,"D");
		Wallet rogerWal = new Wallet(vc,mc,dc);
		roger.getWallets().add(0, null);
		roger.calcTotalIntOwed();
		calcWalletInterest(roger.getWallets());
		
		
		
//		Wallet walletOne = new Wallet(visaCard, masterCard, discoverCard);
//		Person testPerson = new Person(walletOne);
//		testPerson.calcTotalIntOwed(testPerson.getWallets());
//		walletOne.calcWalletInterest();
//		
//		Card secondVisa = new Card(100, "V");
//		Card secondDisc = new Card(100,"D");
//		Wallet secondWallet = new Wallet(secondVisa,secondDisc);
//		Card secondMc= new Card(100, "M");
//		Wallet thirdWallet = new Wallet(secondMc);
//		Person secondTest = new Person(secondWallet, thirdWallet);
//		secondTest.calcTotalIntOwed(secondTest.getWallets());
//		thirdWallet.calcWalletInterest();
//		secondWallet.calcWalletInterest();
//		
//		
	}

}
