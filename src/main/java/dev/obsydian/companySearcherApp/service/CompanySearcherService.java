package dev.obsydian.companySearcherApp.service;

import dev.obsydian.companySearcherApp.soap.SoapHandlerResolver;
import dev.obsydian.companySearcherApp.soap.SoapMessageHandler;
import lombok.Getter;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.soap.AddressingFeature;
import java.net.MalformedURLException;
import java.net.URL;

import static dev.obsydian.companySearcherApp.config.CompanySearcherConfig.*;

public class CompanySearcherService extends WebServiceGatewaySupport {

    private SoapHandlerResolver soapHandlerResolver;
    private SoapMessageHandler soapMessageHandler;

    @Getter
    private cis.bir.publ._2014._07.IUslugaBIRzewnPubl port;

    public CompanySearcherService() throws MalformedURLException {
	    this.soapMessageHandler = new SoapMessageHandler();
	    this.soapHandlerResolver = new SoapHandlerResolver(soapMessageHandler);
    }

    public void connectionPrepare() throws MalformedURLException {
        CompanySearcherService companySearcherService = new CompanySearcherService();
		messagePrepare();
	    login();
    }

	public void messagePrepare() throws MalformedURLException {
	    org.tempuri.UslugaBIRzewnPubl s = new org.tempuri.UslugaBIRzewnPubl(new URL(URL));
	    s.setHandlerResolver(soapHandlerResolver);
	    port = s.getE3(new AddressingFeature());
	    ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ENDPOINT);
    }

	public void login(){
        if (soapMessageHandler.getSessionCookie().equals("") || soapMessageHandler.getSessionCookie().equals("1")){
            soapMessageHandler.setSessionCookie(port.zaloguj(USERKEY));
        }
    }

}
