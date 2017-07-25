package cn.zrcx;

public class DemoProxy implements cn.zrcx.Demo {
  private String _endpoint = null;
  private cn.zrcx.Demo demo = null;
  
  public DemoProxy() {
    _initDemoProxy();
  }
  
  public DemoProxy(String endpoint) {
    _endpoint = endpoint;
    _initDemoProxy();
  }
  
  private void _initDemoProxy() {
    try {
      demo = (new cn.zrcx.DemoServiceLocator()).getDemo();
      if (demo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)demo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)demo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (demo != null)
      ((javax.xml.rpc.Stub)demo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.zrcx.Demo getDemo() {
    if (demo == null)
      _initDemoProxy();
    return demo;
  }
  
  public float f(float a, float b) throws java.rmi.RemoteException{
    if (demo == null)
      _initDemoProxy();
    return demo.f(a, b);
  }
  
  
}