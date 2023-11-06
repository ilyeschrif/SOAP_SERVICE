package Server;

import service.CalculatriceWS;
import jakarta.xml.ws.Endpoint;
import service.CalculatriceWS;


public class ServeurJWS {
    public static void main(String[] args) {

        // Définir l'URL à laquelle le service web sera publié.
        String url = "http://localhost:8084/CalculatriceWS";

        // Publier le service web à l'URL spécifiée.
        Endpoint.publish(url, new CalculatriceWS());


    }
}
