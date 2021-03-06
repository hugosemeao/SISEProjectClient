
package com.insure.client.gen;

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
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClaimDataStore", targetNamespace = "http://server.insure.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClaimDataStore {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "connect", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.Connect")
    @ResponseWrapper(localName = "connectResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.ConnectResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/connectRequest", output = "http://server.insure.com/ClaimDataStore/connectResponse")
    public int connect();

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createClaim", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.CreateClaim")
    @ResponseWrapper(localName = "createClaimResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.CreateClaimResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/createClaimRequest", output = "http://server.insure.com/ClaimDataStore/createClaimResponse")
    public int createClaim(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addDocument", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.AddDocument")
    @ResponseWrapper(localName = "addDocumentResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.AddDocumentResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/addDocumentRequest", output = "http://server.insure.com/ClaimDataStore/addDocumentResponse")
    public void addDocument(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.insure.client.gen.Claim
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retrieveClaim", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.RetrieveClaim")
    @ResponseWrapper(localName = "retrieveClaimResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.RetrieveClaimResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/retrieveClaimRequest", output = "http://server.insure.com/ClaimDataStore/retrieveClaimResponse")
    public Claim retrieveClaim(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateClaim", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.UpdateClaim")
    @ResponseWrapper(localName = "updateClaimResponse", targetNamespace = "http://server.insure.com/", className = "com.insure.client.gen.UpdateClaimResponse")
    @Action(input = "http://server.insure.com/ClaimDataStore/updateClaimRequest", output = "http://server.insure.com/ClaimDataStore/updateClaimResponse")
    public void updateClaim(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
