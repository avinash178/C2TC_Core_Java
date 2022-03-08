package com.tns.client;
import com.tns.application.*;
import com.tns.framework.*;
public class Application {

	public static void main(String[] args) {
		
		
		GSShopFactory g1=new GSShopFactory();
		GSPrimeAcc obj= new GSPrimeAcc(101,"avinash",100,true);
		GSNormalAcc obj2 =new GSNormalAcc(102,"akash",100,50);
		System.out.println(obj.toString());
		
		
	}

}
