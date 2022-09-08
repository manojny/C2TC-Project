package com.cg.application;

import com.cg.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float creditLimit) {
        System.out.println("Dear Current Acc user, your Limit are:" +getcreditLimit());
        
}
	@Override
	public String toString() {
		return "MMCurrentAcc [getcreditLimit()=" + getcreditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccountBalance()="
				+ getAccountBalance() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}