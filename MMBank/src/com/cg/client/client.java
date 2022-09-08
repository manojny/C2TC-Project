package com.cg.client;
import com.cg.application.*;
import com.cg.framework.*;

public class client {
 
	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa= new MMSavingAcc(123,"manoj", 10000, true);
		CurrentAcc ca= new MMCurrentAcc(456,"rahul",5000,1000);
		sa.deposite(sa.getAccountBalance());
		ca.deposite(ca.getAccountBalance());
		sa.toString();
		System.out.println(sa);
		ca.toString();
		System.out.println(ca);
	}
}
