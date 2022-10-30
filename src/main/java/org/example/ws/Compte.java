package org.example.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement(name = "compte")//this is the name of the root element in the XML file avec lib jaxb-api
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double solde;
    @XmlTransient //to hide the date in the WSDL file
    private Date dateCreation;
    private Client client;
    public Compte() {
    }

    public Compte(int code, double solde) {
        this.code = code;
        this.solde = solde;
    }

    public Compte(int code, double v, Date date, Client client) {
        this.code = code;
        this.solde = v;
        this.dateCreation = date;
        this.client = client;
    }

    public Compte(int code, double v, Date date) {
        this.code = code;
        this.solde = v;
        this.dateCreation = date;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
