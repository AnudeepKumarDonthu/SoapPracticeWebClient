/**
 * SoapTestService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.practice.controller;

public interface SoapTestService extends javax.xml.rpc.Service {
    public java.lang.String getSoapTestAddress();

    public com.practice.controller.SoapTest getSoapTest() throws javax.xml.rpc.ServiceException;

    public com.practice.controller.SoapTest getSoapTest(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
