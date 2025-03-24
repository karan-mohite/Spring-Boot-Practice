package in.sp.main.services;

import org.springframework.stereotype.Service;

@Service
public class TransactionService
{
	public void upiTransaction()
	{
		System.out.println("===== business logic for UPI transaction =====");
	}
	
	public void internetBankingTransaction()
	{
		System.out.println("===== business logic for internet banking transaction =====");
	}
	
	public void mobileBankingTransaction()
	{
		System.out.println("===== business logic for mobile banking transaction =====");
	}
	
	public void walletTransaction()
	{
		System.out.println("===== business logic for wallet transaction =====");
	}
}
