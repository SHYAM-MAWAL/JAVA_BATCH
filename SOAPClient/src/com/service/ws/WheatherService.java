
package com.service.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WheatherService", targetNamespace = "http://ws.service.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WheatherService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWheather2", targetNamespace = "http://ws.service.com/", className = "com.service.ws.GetWheather2")
    @ResponseWrapper(localName = "getWheather2Response", targetNamespace = "http://ws.service.com/", className = "com.service.ws.GetWheather2Response")
    @Action(input = "http://ws.service.com/WheatherService/getWheather2Request", output = "http://ws.service.com/WheatherService/getWheather2Response")
    public String getWheather2(
        @WebParam(name = "arg0", targetNamespace = "")
        WheatherVO arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "gw", targetNamespace = "")
    @RequestWrapper(localName = "getWheather", targetNamespace = "http://ws.service.com/", className = "com.service.ws.GetWheather")
    @ResponseWrapper(localName = "getWheatherResponse", targetNamespace = "http://ws.service.com/", className = "com.service.ws.GetWheatherResponse")
    @Action(input = "http://ws.service.com/WheatherService/getWheatherRequest", output = "http://ws.service.com/WheatherService/getWheatherResponse")
    public String getWheather(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
