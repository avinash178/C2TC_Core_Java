package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
	private float deliveryCharges;
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
		
	}
	@Override
	public void bookProduct(float deliveryCharges) {
		
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", deliveryCharges=" + deliveryCharges + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	

}
