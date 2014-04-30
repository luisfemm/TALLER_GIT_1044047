package taller_git;

/**
 *
 * @author luisfemm
 */
public class Producto {
    
    String codigo;
    String nombre;
    String imagen;
    String empresaFabricante; // Empresa Fabricante o Editorial.
    String codigoTiendaAsignada;
    String descripcion;
    double precio;
    int unidadesDisponibles;
    String[] detalles = new String[5];

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoTiendaAsignada() {
        return codigoTiendaAsignada;
    }

    public void setCodigoTiendaAsignada(String codigoTiendaAsignada) {
        this.codigoTiendaAsignada = codigoTiendaAsignada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String[] getDetalles() {
        return detalles;
    }

    public void setDetalles(String[] detalles) {
        this.detalles = detalles;
    }

    public String getEmpresaFabricante() {
        return empresaFabricante;
    }

    public void setEmpresaFabricante(String empresaFabricante) {
        this.empresaFabricante = empresaFabricante;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }
    
}
