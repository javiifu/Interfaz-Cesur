
import javax.swing.JOptionPane;

public class CesurClientes {

    private Cliente[] clientes;
    
    
    public CesurClientes(){
        this.clientes = new Cliente[100];
    }
    public CesurClientes(int dimension){
        this.clientes = new Cliente[dimension];
    }
    public Cliente[] getCliente(){
        return clientes;
    } 
    
    public boolean verficarNif (Cliente cliente){
         
       String letrasNif = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        for (int i = 0; i< clientes.length; i++){
            if (clientes[i] != null && clientes.equals(clientes[i])){
                String nif = cliente.getnIF();
                // Extraer número y letra
                String numeroStr = nif.substring(0, 8);
                char letra = nif.charAt(8);
                
                try{
                    int numero = Integer.parseInt(numeroStr);
                    int indice = numero % 23;
                    char letraCorrecta = letrasNif.charAt(indice);
                    return letra == letraCorrecta; 
                }
                catch(NumberFormatException e){
                    return false;  
                }
            }
        }
        return false;
    }
    public boolean existeCliente(Cliente c){
        for (int i = 0; i<clientes.length;i++){
            if (clientes[i] != null && c.equals(clientes[i])){
                return true;
            }
        }
        return false;
    }
    
    public void addCliente(Cliente cliente){
        if(existeCliente(cliente)){
            JOptionPane.showMessageDialog(null, "El cliente ya Existe", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            boolean encontrado = false;
            for(int i = 0; i <clientes.length && !encontrado; i ++){
                if(clientes[i] == null){
                    clientes[i] = cliente;
                    encontrado = true;
                }
            }
            if (encontrado){
                JOptionPane.showMessageDialog(null,"Cliente Añadido","Información", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,"No se ha podido añadir el clientes","Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    public void delCliente(Cliente c) {

        boolean encontrado = false;

        for (int i = 0; i < clientes.length && !encontrado; i++) {
            if (clientes[i] != null && clientes[i].equals(c)) {
                clientes[i] = null;
                System.out.println(i);
                encontrado = true;
            }
        }

        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Se ha dado de baja el cliente", "ATENCIÓN !!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido dar de baja el cliente", "ATENCIÓN !!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
