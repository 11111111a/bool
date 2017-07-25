/**
 * DemoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.zrcx;

public class DemoServiceLocator extends org.apache.axis.client.Service implements cn.zrcx.DemoService {

    public DemoServiceLocator() {
    }


    public DemoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DemoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Demo
    private java.lang.String Demo_address = "http://localhost:8080/test/services/Demo";

    public java.lang.String getDemoAddress() {
        return Demo_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DemoWSDDServiceName = "Demo";

    public java.lang.String getDemoWSDDServiceName() {
        return DemoWSDDServiceName;
    }

    public void setDemoWSDDServiceName(java.lang.String name) {
        DemoWSDDServiceName = name;
    }

    public cn.zrcx.Demo getDemo() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Demo_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDemo(endpoint);
    }

    public cn.zrcx.Demo getDemo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.zrcx.DemoSoapBindingStub _stub = new cn.zrcx.DemoSoapBindingStub(portAddress, this);
            _stub.setPortName(getDemoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDemoEndpointAddress(java.lang.String address) {
        Demo_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.zrcx.Demo.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.zrcx.DemoSoapBindingStub _stub = new cn.zrcx.DemoSoapBindingStub(new java.net.URL(Demo_address), this);
                _stub.setPortName(getDemoWSDDServiceName());
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
        if ("Demo".equals(inputPortName)) {
            return getDemo();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://zrcx.cn", "DemoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://zrcx.cn", "Demo"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Demo".equals(portName)) {
            setDemoEndpointAddress(address);
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
