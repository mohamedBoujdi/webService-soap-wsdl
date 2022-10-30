package org.example.ws;

import com.sun.xml.txw2.annotation.XmlElement;

@XmlElement(value = "client")
public class Client {
    private int code;
    private String nom;
    private String email;

    public Client() {
    }

    public Client(int code, String nom, String email) {
        this.code = code;
        this.nom = nom;
        this.email = email;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
