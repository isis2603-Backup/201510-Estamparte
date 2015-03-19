/*
 * Entidad de estampa
 */
package co.edu.uniandes.estamparte.factura.logic.entity;

import co.edu.uniandes.estamparte.camiseta.logic.dto.CamisetaDTO;
import co.edu.uniandes.estamparte.comprador.logic.dto.CompradorDTO;
import co.edu.uniandes.estamparte.estampa.logic.entity.*;
import co.edu.uniandes.estamparte.formaPago.logic.dto.FormaPagoDTO;
import java.util.ArrayList;
import java.util.Date;


public class FacturaEntity {
    
    
    private CompradorDTO comprador;
    private FormaPagoDTO formaPago;
    private String fechaCompra;
    private long id;
    private ArrayList<CamisetaDTO> articulos;
    
    public void setComprador(CompradorDTO pComprador)
    {
        comprador = pComprador;
    }
    
    public CompradorDTO getComprador()
    {
        return comprador;
    }
    
    public String getNombreComprador()
    {
        return comprador.getNombre();
    }
    
    public String getIdComprador()
    {
        return comprador.getId();
    }
    
    public void setArticulos(ArrayList<CamisetaDTO> pCamisetas)
    {
        articulos = pCamisetas;
    }
    
    public ArrayList<CamisetaDTO> getArticulos()
    {
        return articulos;
    }
    
    public void setFormaPago(FormaPagoDTO pFormaPago)
    {
        formaPago = pFormaPago;
    }
    
    public FormaPagoDTO getFormaPago()
    {
        return formaPago;
    }
    
    public String getTipoFormPago()
    {
        return formaPago.getNombre();
    }
    
    public Long getNumeroTarjeta()
    {
        return formaPago.getNumTarjeta();
    }
    
    public Date getFechaVencimiento()
    {
        return formaPago.getFechaVencimiento();
    }
    
    public int getCodigoSeguridad()
    {
        return formaPago.getCodSeguridad();                
    }
    
    public String getDireccionCorrespondencia()
    {
        return formaPago.getDireccion();
    }
    
    public double getMontoTotal()
    {
        double respuesta = 0;
        for(int i=0; i<articulos.size();i++)
        {
            respuesta += articulos.get(i).getCosto();
        }
        return respuesta;
    }
    
    public void setFechaCompra(String pFecha)
    {
        fechaCompra = pFecha;
    }
    
    public String getFechaCompra()
    {
        return fechaCompra;
    }
    
    public void setIdFactura(Long pId)
    {
        id = pId;
    }
    
    public Long getIdFactura()
    {
        return id;
    }
    
}
