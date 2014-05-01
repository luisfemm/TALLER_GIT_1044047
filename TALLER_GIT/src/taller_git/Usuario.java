/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_git;

/**
 *
 * @author eallanosm
 */
public class Usuario {

    String docId;
    String nombreCompleto;
    String direccion;
    String numeroTelefonico;
    String login;
    String password;
    
    // Datos para Cajero.
    
    String codigoCajero;
    String codigoAlmacen;

    public String getCodigoAlmacen() {
        return codigoAlmacen;
    }

    public void setCodigoAlmacen(String codigoAlmacen) {
        this.codigoAlmacen = codigoAlmacen;
    }

    public String getCodigoCajero() {
        return codigoCajero;
    }

    public void setCodigoCajero(String codigoCajero) {
        this.codigoCajero = codigoCajero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
