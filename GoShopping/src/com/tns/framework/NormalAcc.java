package com.tns.framework;

public abstract class NormalAcc extends ShopAcc
{
	private float deliveryCharges;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}
	
	@Override
	public void bookProduct(float deliveryCharges) {}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
