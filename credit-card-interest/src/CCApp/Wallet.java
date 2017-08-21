package CCApp;
import java.util.ArrayList;
import CCApp.Card;

public class Wallet {
	private ArrayList<Card> cardsInWallet = new ArrayList<Card>();
	private double walletInterest;
	
	public void addWallet() {
		Card card = null;
		cardsInWallet.add(card);
	}
	
	public Wallet(Card card, Card card1, Card card2) { 
		cardsInWallet.add(card);
		cardsInWallet.add(card1);
		cardsInWallet.add(card2);
	}
	
	public Wallet(Card card, Card card1) { 
		cardsInWallet.add(card);
		cardsInWallet.add(card1);
	}


	public Wallet(Card card) { 
		cardsInWallet.add(card);
	}
	
	public void calcWalletInterest(ArrayList<Wallet> wallets) {
		int i = 0;
		for (Wallet wallet : wallets) {
			for (Card card : cardsInWallet) {
				walletInterest+=(card.getBalance()*card.getInterestRate());
				System.out.println("Wallet " + i + " interest is: " + wallet.getWalletInterest());
			}
		}
	}
	
	public double getWalletInterest() {
		return walletInterest;
	}

	public void setWalletInterest(double walletInterest) {
		this.walletInterest = walletInterest;
	}

	public ArrayList<Card> getCardsInWallet() {
		return cardsInWallet;
	}

	public void setCardsInWallet(ArrayList<Card> cardsInWallet) {
		this.cardsInWallet = cardsInWallet;
	}
	
	
}
