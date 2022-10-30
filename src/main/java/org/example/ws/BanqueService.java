package org.example.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//pojo plain old java object sans @WebService
@WebService(serviceName = "BanqueWS")//this is the name of the service in the WSDL file
//what it does is to create a WSDL file( is a XML file that describes the web service)
public class BanqueService {
         @WebMethod(operationName = "Convert")
         //what it does for method is to create a XML file that describes the method
         //operationName is the name of the method in the WSDL file
        public double conversion(@WebParam(name="montant") double montant) {
            return montant * 10.5;
        }
        @WebMethod(operationName = "ConsulterCompte")
        public Compte getCompte(@WebParam(name = "code") int code) {
            return new Compte(code, Math.random() * 9000, new Date());
        }
        //why we didn't use @WebMethod for this method?
        //because it is a list of objects and we don't want to create a XML file for each object
        public List<Compte> listComptes() {
            List<Compte> comptes = new ArrayList<Compte>();
            comptes.add(new Compte(1, Math.random() * 9000, new Date(), new Client(1,"boujdi", "mohamed@gmail.com")));
            comptes.add(new Compte(2, Math.random() * 9000, new Date(),new Client(2,"fadi", "hfjfhf@hotmail.com")));
            comptes.add(new Compte(3, Math.random() * 10000, new Date(),new Client(3,"Mefdal", "iygabzuuzo@hotmail.com")));
            return comptes;
        }

}
