package dev.obsydian.companySearcherApp.config;

import dev.obsydian.companySearcherApp.service.CompanySearcherService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import java.net.MalformedURLException;

@Configuration
public class CompanySearcherConfig {
    public static final String URL = "https://wyszukiwarkaregontest.stat.gov.pl/wsBIR/wsdl/UslugaBIRzewnPubl.xsd";
    public static final String ENDPOINT = "https://wyszukiwarkaregontest.stat.gov.pl/wsBIR/UslugaBIRzewnPubl.svc";
    public static final String USERKEY = "abcde12345abcde12345";


    @Bean
    public Jaxb2Marshaller jaxb2Marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPaths("cis.bir._2014._07",
                "cis.bir.publ._2014._07",
                "cis.bir.publ._2014._07.datacontract",
                "dev.obsydian.companySearcherApp.domain");
        return jaxb2Marshaller;
    }

    @Bean
    public CompanySearcherService soapClient(Jaxb2Marshaller jaxb2Marshaller) throws MalformedURLException {

        CompanySearcherService client = new CompanySearcherService();
        client.connectionPrepare();

        client.setDefaultUri(ENDPOINT);
        client.setMarshaller(jaxb2Marshaller);
        client.setUnmarshaller(jaxb2Marshaller);

        return client;
    }

}