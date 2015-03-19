/*
 * Conversor de datos de estampas
 */
package co.edu.uniandes.estamparte.comprador.logic.converter;

//Convierte los objetos de clases de java a DTO (objeto que transfiere archivos a persistencia)

import co.edu.uniandes.estamparte.comprador.logic.dto.CompradorDTO;
import co.edu.uniandes.estamparte.comprador.logic.entity.CompradorEntity;
import java.util.ArrayList;
import java.util.List;

public class CompradorConverter {
   public static CompradorDTO entity2PersistenceDTO(CompradorEntity entity) {
        if (entity != null) {
            CompradorDTO dto = new CompradorDTO();
            dto.setNombre(entity.getNombre());
            dto.setId(entity.getId());
            dto.setCarrito(entity.getCarrito());
            
            return dto;
        } else {
            return null;
        }
    }

    public static CompradorEntity persistenceDTO2Entity(CompradorDTO dto) {
        if (dto != null) {
            CompradorEntity entity = new CompradorEntity();
            entity.setNombre(dto.getNombre());
            entity.setId(dto.getId());
            entity.setCarrito(dto.getCarrito());

            return entity;
        } else {
            return null;
        }
    }

    public static ArrayList<CompradorDTO> convertirDeListaEntidadesAListaDTO (ArrayList<CompradorEntity> listaEntities) {
        ArrayList<CompradorDTO> listaDTO = new ArrayList<CompradorDTO>();
        for (CompradorEntity entity : listaEntities) {
            listaDTO.add(entity2PersistenceDTO(entity));
        }
        return listaDTO;
    }

    public static ArrayList<CompradorEntity> convertirDeListaDTOAListaEntidades (ArrayList<CompradorDTO> listaDTO) {
        ArrayList<CompradorEntity> listaEntities = new ArrayList<CompradorEntity>();
        for (CompradorDTO dto : listaDTO) {
            listaEntities.add(persistenceDTO2Entity(dto));
        }
        return listaEntities;
    }
     
}

