package com.tns.application;
import com.tns.framework.*;

public class GSPrimeAcc extends PrimeAcc {
	private float charges;

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		System.out.println("your acc no: "+accNo);
		System.out.println("account name: "+accNm);
		System.out.println("charges: "+charges);
		
		
		
	}
	
     public void bookProduct(float Charges) {
		
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [charges=" + charges + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
