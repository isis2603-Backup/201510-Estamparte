package co.edu.uniandes.estamparte.estampa.persistence;

import co.edu.uniandes.estamparte.administrador.logic.api.IAdministradorLogic;
import co.edu.uniandes.estamparte.administrador.logic.converter.AdministradorConverter;
import co.edu.uniandes.estamparte.administrador.logic.dto.AdministradorDTO;
import co.edu.uniandes.estamparte.administrador.logic.ejb.AdministradorLogic;
import co.edu.uniandes.estamparte.administrador.logic.entity.AdministradorEntity;
import co.edu.uniandes.estamparte.administrador.persistence.*;
import co.edu.uniandes.estamparte.artista.logic.api.IArtistaLogic;
import co.edu.uniandes.estamparte.artista.logic.converter.ArtistaConverter;
import co.edu.uniandes.estamparte.artista.logic.dto.ArtistaDTO;
import co.edu.uniandes.estamparte.artista.logic.ejb.ArtistaLogic;
import co.edu.uniandes.estamparte.artista.logic.entity.ArtistaEntity;
import co.edu.uniandes.estamparte.estampa.logic.api.IEstampaLogic;
import co.edu.uniandes.estamparte.estampa.logic.converter.EstampaConverter;
import co.edu.uniandes.estamparte.estampa.logic.dto.EstampaDTO;
import co.edu.uniandes.estamparte.estampa.logic.ejb.EstampaLogic;
import co.edu.uniandes.estamparte.estampa.logic.entity.EstampaEntity;
import java.io.File;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante
 */
@RunWith(Arquillian.class)
public class EstampaPersistenceTest {
 /**   
    public static final String DEPLOY = "Prueba";
    @Deployment
    public static WebArchive createDeployment() {
        return ShrinkWrap.create(WebArchive.class, DEPLOY + ".war")
                //A�ade el paquete en el que se encuentra la clase 'SportPersistance.java'
                .addPackage(IEstampaLogic.class.getPackage())
                .addPackage(EstampaLogic.class.getPackage())
                //A�ade el paquete en el que se encuentra la clase 'SportEntity.java'
                .addPackage(EstampaEntity.class.getPackage())
                .addPackage(EstampaDTO.class.getPackage())
                .addPackage(EstampaConverter.class.getPackage())
                .addPackage(IArtistaLogic.class.getPackage())
                .addPackage(ArtistaLogic.class.getPackage())
                //A�ade el paquete en el que se encuentra la clase 'SportEntity.java'
                .addPackage(ArtistaEntity.class.getPackage())
                .addPackage(ArtistaDTO.class.getPackage())
                .addPackage(ArtistaConverter.class.getPackage())
                //Finalmente se a�aden los archivos persistance.xml y beans.xml para la Unidad de peristencia y CDI del paquete m�nimo
                .addAsResource("META-INF/persistence.xml", "META-INF/persistence.xml")
                .addAsWebInfResource(new File ("src/main/resources/META-INF/beans.xml"));
    }
    
    @Inject
     private IEstampaLogic adminPersistence;
     @PersistenceContext
     private EntityManager em;
     @Inject
     UserTransaction utx;
    
    
    
    @Test
    public void createEstampaTest() {
        // se instancia el generador de datos Podam
        
    }
    
    @Test
    public void getEstampaTest(){
        
    }
    
    @Test
    public void deleteEstampaTest(){
        
    }
    
    @Test
    public void updateEstampaTest(){
        
    } */
}
