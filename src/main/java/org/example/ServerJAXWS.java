package org.example;

import jakarta.xml.ws.Endpoint;
import org.example.ws.BanqueService;

public class ServerJAXWS {

        public static void main(String[] args) {
            //endpoint: point d'entree and publication de service web
            Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
            System.out.println("Server started and listening on port 9191");
        }

}
