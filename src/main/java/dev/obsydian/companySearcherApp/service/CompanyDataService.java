package dev.obsydian.companySearcherApp.service;

import cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania;
import dev.obsydian.companySearcherApp.domain.CompanyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.xml.transform.StringSource;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

@Service
public class CompanyDataService {

	@Autowired
	CompanySearcherService companySearcherService;


	public CompanyDataService(CompanySearcherService companySearcherService) {
		this.companySearcherService = companySearcherService;
	}

	public String getCompany(String nip) {

		cis.bir.publ._2014._07.datacontract.ObjectFactory objectFactory = new cis.bir.publ._2014._07.datacontract.ObjectFactory();
		JAXBElement<String> nipParam = objectFactory.createParametryWyszukiwaniaNip(nip);
		cis.bir.publ._2014._07.IUslugaBIRzewnPubl port = companySearcherService.getPort();

		ParametryWyszukiwania searchParameter = new ParametryWyszukiwania();
		searchParameter.setNip(nipParam);
		String response = port.daneSzukaj(searchParameter);

		return response;
	}

	public CompanyData.Company mapToCompany(String companyResponse) {
		Jaxb2Marshaller unmarshaller = (Jaxb2Marshaller) companySearcherService.getUnmarshaller();
		CompanyData company = (CompanyData) unmarshaller.unmarshal(new StringSource(companyResponse));
		company.dane.setRegonLink(company.dane.getRegonLink().split(">")[1].split("<")[0]);

		return company.dane;
	}



}
