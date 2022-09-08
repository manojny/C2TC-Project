package com.cg.application;

import com.cg.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}
	 public void withdraw(float accBal) {
	        System.out.println("Dear saving acc user,your acc balance is:" +getAccountBalance());
}
	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccountBalance()=" + getAccountBalance() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	 
	 
}