package practica4;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class ATM {
	public static boolean IsLoggedIn = false;
	public static int CurrentAccount;
	
	public ATM() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean Login( int account, String password )
	{
		AtmUser user = BankDB.GetUser(account);
		try {
			IsLoggedIn = Utils.validatePassword(password, user.GetPassword());
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CurrentAccount = user.GetBankAccount();
		return IsLoggedIn;
	}
	
	public double GetBalance(int account)
	{
		if(IsLoggedIn) {
			AtmUser user = BankDB.GetUser(account);
			return user.GetBalance();
		}
		return 0;
	}
	
	private void Logout()
	{
		CurrentAccount = 
	}
}
