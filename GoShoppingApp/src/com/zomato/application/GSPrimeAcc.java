package com.zomato.application;

import com.zomato.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc 
{

	private static final float charges=0; 
	
	
	public float getCharges() {
		return charges;
	}

	public GSPrimeAcc() 
	{
		super(accNo, accNm, charges, isPrime);
		
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Dear Prime User:-\n		Your Product Charges are:"+charges);
	}

	
	
	@Override
	public String toString() {
		return "GSPrimeAcc []";
	}
	

}
