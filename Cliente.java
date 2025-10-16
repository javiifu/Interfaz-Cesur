


public class Cliente {
    
    //Atributos 
    String nombre;
    String direccion;
    String nIF;
    String razonSocial;
    String direccionFacturacion;
    String direccionEnvio;
    String email;
    String telefono;
    boolean activo = true;
    
    //Constructores

    public Cliente(String nombre, String direccion, String nIF, String razonSocial, String direccionFacturacion, String direccionEnvio, String email, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nIF = nIF;
        this.razonSocial = razonSocial;
        this.direccionFacturacion = direccionFacturacion;
        this.direccionEnvio = direccionEnvio;
        this.email = email;
        this.telefono = telefono;
    }

    
    
    //Métodos getter y setter.
    
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getnIF() {
        return nIF;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setnIF(String nIF) {
        this.nIF = nIF;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setDireccionFacturacion(String direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
