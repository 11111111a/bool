/**
 * DemoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.zrcx;

public interface DemoService extends javax.xml.rpc.Service {
    public java.lang.String getDemoAddress();

    public cn.zrcx.Demo getDemo() throws javax.xml.rpc.ServiceException;

    public cn.zrcx.Demo getDemo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
