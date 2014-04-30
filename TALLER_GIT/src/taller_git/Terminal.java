/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_git;

/**
 *
 * @author eallanosm
 */
public class Terminal {
    
    String codigoTerminal;
    String numeroTelefonico;
    String codigoAlmacen;
    
    // Datos Opcionales.
    
    String numeroLocal;

    public String getCodigoAlmacen() {
        return codigoAlmacen;
    }

    public void setCodigoAlmacen(String codigoAlmacen) {
        this.codigoAlmacen = codigoAlmacen;
    }

    public String getCodigoTerminal() {
        return codigoTerminal;
    }

    public void setCodigoTerminal(String codigoTerminal) {
        this.codigoTerminal = codigoTerminal;
    }

    public String getNumeroLocal() {
        return numeroLocal;
    }

    public void setNumeroLocal(String numeroLocal) {
        this.numeroLocal = numeroLocal;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }    
}
