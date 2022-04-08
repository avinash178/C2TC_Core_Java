package com.zomato.client;

import com.zomato.application.GSNormalAcc;
import com.zomato.application.GSPrimeAcc;
import com.zomato.application.GSShopFactory;
import com.zomato.framework.NormalAcc;
import com.zomato.framework.PrimeAcc;
import com.zomato.framework.ShopAcc;
import com.zomato.framework.ShopFactory;


public class Client 
{
	public static void main(String[] args) 
	{
		// Step 1 
		GSShopFactory gsfac = new GSShopFactory();
		gsfac.getNewPrimeAccount(12, "mohit", 400, true);
		gsfac.getNewNormalAccount(81, "ramesh", 400, 100);
		
		
		// Step 2
		GSPrimeAcc prime = new GSPrimeAcc();
		prime.getAccNm();
		prime.getAccNo();
		prime.getCharges();
		// Step 4 
		prime.bookProduct(1000);
		
		// Step 5 
		prime.toString();
		
		// Step 3
		GSNormalAcc gsnormal = new GSNormalAcc(); 
		gsnormal.getAccNm();
		gsnormal.getAccNo();
		gsnormal.getCharges();
		gsnormal.getDeliveryCharge();
		
		// Step 4 
		gsnormal.bookProduct(1000);
		// Step 5 
		gsnormal.toString();
	
		

	}

}
