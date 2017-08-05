/**
 * DocenteServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.uniajc.ws;

public class DocenteServiceImplServiceLocator extends org.apache.axis.client.Service implements com.uniajc.ws.DocenteServiceImplService {

    public DocenteServiceImplServiceLocator() {
    }


    public DocenteServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DocenteServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DocenteServiceImpl
    private java.lang.String DocenteServiceImpl_address = "http://localhost:8085/docenteWS/services/DocenteServiceImpl";

    public java.lang.String getDocenteServiceImplAddress() {
        return DocenteServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DocenteServiceImplWSDDServiceName = "DocenteServiceImpl";

    public java.lang.String getDocenteServiceImplWSDDServiceName() {
        return DocenteServiceImplWSDDServiceName;
    }

    public void setDocenteServiceImplWSDDServiceName(java.lang.String name) {
        DocenteServiceImplWSDDServiceName = name;
    }

    public com.uniajc.ws.DocenteServiceImpl getDocenteServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DocenteServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDocenteServiceImpl(endpoint);
    }

    public com.uniajc.ws.DocenteServiceImpl getDocenteServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.uniajc.ws.DocenteServiceImplSoapBindingStub _stub = new com.uniajc.ws.DocenteServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getDocenteServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDocenteServiceImplEndpointAddress(java.lang.String address) {
        DocenteServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.uniajc.ws.DocenteServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.uniajc.ws.DocenteServiceImplSoapBindingStub _stub = new com.uniajc.ws.DocenteServiceImplSoapBindingStub(new java.net.URL(DocenteServiceImpl_address), this);
                _stub.setPortName(getDocenteServiceImplWSDDServiceName());
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
        if ("DocenteServiceImpl".equals(inputPortName)) {
            return getDocenteServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.uniajc.com", "DocenteServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.uniajc.com", "DocenteServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DocenteServiceImpl".equals(portName)) {
            setDocenteServiceImplEndpointAddress(address);
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
