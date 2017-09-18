/**
 * SoapTestServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.practice.controller;

public class SoapTestServiceLocator extends org.apache.axis.client.Service implements com.practice.controller.SoapTestService {

    public SoapTestServiceLocator() {
    }


    public SoapTestServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SoapTestServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SoapTest
    private java.lang.String SoapTest_address = "http://localhost:8080/SoapPractice/services/SoapTest";

    public java.lang.String getSoapTestAddress() {
        return SoapTest_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SoapTestWSDDServiceName = "SoapTest";

    public java.lang.String getSoapTestWSDDServiceName() {
        return SoapTestWSDDServiceName;
    }

    public void setSoapTestWSDDServiceName(java.lang.String name) {
        SoapTestWSDDServiceName = name;
    }

    public com.practice.controller.SoapTest getSoapTest() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SoapTest_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSoapTest(endpoint);
    }

    public com.practice.controller.SoapTest getSoapTest(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.practice.controller.SoapTestSoapBindingStub _stub = new com.practice.controller.SoapTestSoapBindingStub(portAddress, this);
            _stub.setPortName(getSoapTestWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSoapTestEndpointAddress(java.lang.String address) {
        SoapTest_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.practice.controller.SoapTest.class.isAssignableFrom(serviceEndpointInterface)) {
                com.practice.controller.SoapTestSoapBindingStub _stub = new com.practice.controller.SoapTestSoapBindingStub(new java.net.URL(SoapTest_address), this);
                _stub.setPortName(getSoapTestWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SoapTest".equals(inputPortName)) {
            return getSoapTest();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://controller.practice.com", "SoapTestService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://controller.practice.com", "SoapTest"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SoapTest".equals(portName)) {
            setSoapTestEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
