/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.iit.examds;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author Ahmed
 */
public class PatientResouce {

    private UriInfo context;

    /**
     * Creates a new instance of PatientResource
     */
    public PatientResouce() {
        
    }
    
  

    /**
     * Retrieves representation of an instance of soa.jaxrslabs.bookPatient.PatientResource
     * @return an instance of java.lang.String
     */
    /*@GET
    @Produces("application/xml")
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }*/

    /**
     * PUT method for updating or creating an instance of PatientResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    /*@PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }*/
    

    public List<Patient> getPatients() { 

    System.out.println("getPatients"); 
    
    return ListPatientBD.getPatients(); 
    //return "Salut";

    } 
    
    
    // terminer pourque ça soit accessible par le path {id}/

    public Patient getPatient(String numPatient) { 

        List<Patient> Patients = ListPatientBD.getPatients();
        Patient aa=null;
        for(int i=0; i<Patients.size(); i++)
        if(Patients.get(i).getNumPatient().equals(numPatient))
            aa=Patients.get(i);
        return aa; 
    } 
    
    
    // terminer pourque ça soit accessible par le path search

    public List<Patient> searchPatientsByCriteria(String nom, String prenom) { 

        List<Patient> Patients = ListPatientBD.getPatients();
        List<Patient> result=new ArrayList();
        Patient aa=null;
        for(int i=0; i<Patients.size(); i++)
        if((Patients.get(i).getNom().equals(nom)) && (Patients.get(i).getPrenom().equals(prenom)))
            result.add(Patients.get(i));
        return result;
    }
    
    // // terminer pourque ça soit accessible par le path create

    public void createPatient(String num,
            String nom,
            String prenom,
            int heure ) { 
        
        Patient aa=new Patient(num, nom, prenom, heure);
        ListPatientBD.getPatients().add(aa);
        
 
    }
    
    // terminer pourque ça soit accessible par le path {id}/remove
    public void remove(String num) 
    { 
        List<Patient> Patients = ListPatientBD.getPatients();
        int k=-1;
        for(int i=0; i<Patients.size(); i++)
        if(Patients.get(i).getNumPatient().compareTo(num)==0)
          
            Patients.remove(i);
    }
	
	

    public void modify( String num , int h) 
    { 
        List<Patient> Patients = ListPatientBD.getPatients();
        int k=-1;
        for(int i=0; i<Patients.size(); i++)
        if(Patients.get(i).getNumPatient().compareTo(num)==0)
          
            Patients.get(i).setHeureRendv(h);;
    }
    
    
}
