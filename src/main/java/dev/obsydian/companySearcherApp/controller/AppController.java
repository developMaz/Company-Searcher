package dev.obsydian.companySearcherApp.controller;

import dev.obsydian.companySearcherApp.domain.CompanyData;
import dev.obsydian.companySearcherApp.service.CompanyDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.xml.bind.JAXBException;

@Controller
public class AppController {

	@Autowired
	CompanyDataService companyDataService;

	public CompanyData.Company getCompanyDetails(String nip) {
		CompanyData.Company company = companyDataService.mapToCompany(companyDataService.getCompany(nip));
		return company;
	}

}
