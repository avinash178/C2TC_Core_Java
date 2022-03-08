package com.tns.application;
import com.tns.framework.*;
public class GSNormalAcc extends NormalAcc {


public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
	super(accNo, accNm, charges, deliveryCharges);
	
	
	System.out.println("your acc no: "+accNo);
	System.out.println("account name: "+accNm);
	System.out.println("charges: "+charges);
	System.out.println("deliverycharges :"+deliveryCharges);
	System.out.print("your total charges: ");
	System.out.println(charges+deliveryCharges);
 
}

   
	
}
