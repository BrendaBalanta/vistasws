package com.uniajc.ws;

public class DocenteServiceImplProxy implements com.uniajc.ws.DocenteServiceImpl {
  private String _endpoint = null;
  private com.uniajc.ws.DocenteServiceImpl docenteServiceImpl = null;
  
  public DocenteServiceImplProxy() {
    _initDocenteServiceImplProxy();
  }
  
  public DocenteServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initDocenteServiceImplProxy();
  }
  
  private void _initDocenteServiceImplProxy() {
    try {
      docenteServiceImpl = (new com.uniajc.ws.DocenteServiceImplServiceLocator()).getDocenteServiceImpl();
      if (docenteServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)docenteServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)docenteServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (docenteServiceImpl != null)
      ((javax.xml.rpc.Stub)docenteServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.uniajc.ws.DocenteServiceImpl getDocenteServiceImpl() {
    if (docenteServiceImpl == null)
      _initDocenteServiceImplProxy();
    return docenteServiceImpl;
  }
  
  public com.uniajc.model.Docente getDocente(int id) throws java.rmi.RemoteException{
    if (docenteServiceImpl == null)
      _initDocenteServiceImplProxy();
    return docenteServiceImpl.getDocente(id);
  }
  
  
}