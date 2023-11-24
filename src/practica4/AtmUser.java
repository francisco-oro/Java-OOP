package practica4;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class AtmUser {
	private int BankAccount;
	private String Password;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Corporation;
	private double Balance;
	
	public  AtmUser(String firstName, String lastName, String email, String password, double initialBalance, String corporation)  {
		BankAccount = BankDB.GetAccountNumber();
		try {
			Password = Utils.generateStorngPasswordHash(password);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FirstName = firstName;
		LastName = lastName;
		Email = email; 
		Corporation = corporation;
		Balance = initialBalance;
	}
	
	public int GetBankAccount()
	{
		return BankAccount;
	}
	
	public double GetBalance()
	{
		return Balance;
	}
	
	public String GetPassword()
	{
		return Password;
	}
}