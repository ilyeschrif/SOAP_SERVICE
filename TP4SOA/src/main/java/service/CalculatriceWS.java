package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService // Cette annotation indique que cette classe est un service web.

public class CalculatriceWS {

    @WebMethod // Cette annotation spécifie que cette méthode est accessible en tant que méthode web.

    // Cette méthode "somme" prend deux paramètres "val1" et "val2" de type double et retourne leur somme.
    public double somme(@WebParam(name = "val1") double a, @WebParam(name = "val2") double b) {
        return a + b;
    }


}
