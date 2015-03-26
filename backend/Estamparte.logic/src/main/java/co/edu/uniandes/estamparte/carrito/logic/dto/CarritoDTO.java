/*
 * DTO de la estampa
 */
package co.edu.uniandes.estamparte.carrito.logic.dto;

import co.edu.uniandes.estamparte.camiseta.logic.dto.CamisetaDTO;
import co.edu.uniandes.estamparte.comprador.logic.dto.CompradorDTO;
import co.edu.uniandes.estamparte.factura.logic.dto.FacturaDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CarritoDTO {
    
    private String idCarrito;
    
    private CompradorDTO comprador;
    
    private List<CamisetaDTO> camisetas;
    
    private FacturaDTO factura;
    
    public String darIdCarrito(){
        return idCarrito;
    }
    
    public void asignarIdCarrito(String idCarrito){
        this.idCarrito = idCarrito;
    }
    
    public CompradorDTO darComprador(){
        return comprador;
    }
    
    public void asignarComprador(CompradorDTO nComprador){
        comprador = nComprador;
    }
    
    public int darNumeroCamisetas(){
        return camisetas.size();
    }
    
    public List<CamisetaDTO> darCamisetas(){
        return camisetas;
    }
    
    public void asignarCamisetas(List<CamisetaDTO> camisetas){
        this.camisetas.addAll(camisetas);
    }
    
    public void agregarCamiseta (CamisetaDTO camiseta){
        camisetas.add(camiseta);
    }
    
    public void eliminarCamiseta(CamisetaDTO camiseta){
        camisetas.remove(camiseta);
    }
    
    public void eliminarListaDeCamisetas(List<CamisetaDTO> aEliminar){
        camisetas.removeAll(aEliminar);
    }
    
    public void asignarFactura(FacturaDTO nFactura){
        factura = nFactura;
    }
    
    public FacturaDTO darFactura(){
        return factura;
    }
}
