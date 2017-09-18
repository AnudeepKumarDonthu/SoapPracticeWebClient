package com.practice.controller;

public class SoapTestProxy implements com.practice.controller.SoapTest {
  private String _endpoint = null;
  private com.practice.controller.SoapTest soapTest = null;
  
  public SoapTestProxy() {
    _initSoapTestProxy();
  }
  
  public SoapTestProxy(String endpoint) {
    _endpoint = endpoint;
    _initSoapTestProxy();
  }
  
  private void _initSoapTestProxy() {
    try {
      soapTest = (new com.practice.controller.SoapTestServiceLocator()).getSoapTest();
      if (soapTest != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)soapTest)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)soapTest)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (soapTest != null)
      ((javax.xml.rpc.Stub)soapTest)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.practice.controller.SoapTest getSoapTest() {
    if (soapTest == null)
      _initSoapTestProxy();
    return soapTest;
  }
  
  public int addValues(int a, int b) throws java.rmi.RemoteException{
    if (soapTest == null)
      _initSoapTestProxy();
    return soapTest.addValues(a, b);
  }
  
  public java.lang.String stringValue() throws java.rmi.RemoteException{
    if (soapTest == null)
      _initSoapTestProxy();
    return soapTest.stringValue();
  }
  
  
}