package com.practice.clinet;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.practice.controller.SoapTest;
import com.practice.controller.SoapTestServiceLocator;

public class SoapClientTest {

	public static void main(String[] args) {
		SoapTestServiceLocator soapTestServiceLocator= new SoapTestServiceLocator();
		try {
			SoapTest soapTest=soapTestServiceLocator.getSoapTest();
			try {
				System.out.println(soapTest.stringValue());
				System.out.println(soapTest.addValues(30,40));
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
