package com.cg.application;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return null;
	}

}
