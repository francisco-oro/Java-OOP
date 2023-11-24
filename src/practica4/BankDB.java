package practica4;
import java.util.*;


public class BankDB {
	private static int LastClientAccount = 0;
	private static Dictionary<Integer,AtmUser> AtmAccounts = new Hashtable<>();
	
	public static int GetAccountNumber()
	{
		return LastClientAccount++;
	}
	
	public static int CreateAccount(String firstName, String lastName, String email, String password, double initialBalance, String corporation)
	{
		AtmUser NewUser = new AtmUser(firstName, lastName, email, password, initialBalance, corporation); 
		AtmAccounts.put(NewUser.GetBankAccount(), NewUser);
		
		return NewUser.GetBankAccount();
	}
	
	public static AtmUser GetUser(int userAccount)
	{
		return AtmAccounts.get(userAccount);
	}
}
