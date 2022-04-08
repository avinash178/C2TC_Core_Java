package com.zomato.application;

import com.zomato.framework.NormalAcc;
import com.zomato.framework.PrimeAcc;
import com.zomato.framework.ShopAcc;
import com.zomato.framework.ShopFactory;

public class GSShopFactory implements ShopFactory 
{

	@Override
	public GSPrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) 
	{
		GSPrimeAcc gsprime = new GSPrimeAcc();
		return gsprime;
	}

	@Override
	public GSNormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) 
	{
		GSNormalAcc gsnormal = new GSNormalAcc(AccNo, accNm, deliveryCharges, deliveryCharges);
		return gsnormal;
	}
	
	

	
}
