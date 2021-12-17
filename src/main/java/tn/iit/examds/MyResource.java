package tn.iit.examds;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;



@Path("myresource")
public class MyResource {

    
        
		@GET
		@Produces(MediaType.APPLICATION_JSON)
        public List<Patient> getPatient() { 

        System.out.println("Retreiving Patients..."); 
        
        return ListPatientBD.getPatients(); 

        } 
        
        
		@GET
		@Path ("search/{num}")
		@Produces(MediaType.APPLICATION_JSON)
        public Patient getPatient(@PathParam("num") String numPatient) { 

            List<Patient> patients = ListPatientBD.getPatients();
            Patient aa=null;
            for(int i=0; i<patients.size(); i++)
            if(patients.get(i).getNumPatient().equals(numPatient))
                aa=patients.get(i);
            return aa; 
        } 
        
        
		@GET
		@Path ("search2")
		@Produces(MediaType.APPLICATION_JSON)
        public List<Patient> searchPatientByCriteria(@QueryParam ("nom") String nom,@QueryParam ("prenom") String prenom) { 

            List<Patient> patients = ListPatientBD.getPatients();
            List<Patient> result=new ArrayList();
            Patient aa=null;
            for(int i=0; i<patients.size(); i++)
            if((patients.get(i).getNom().equals(nom)) && (patients.get(i).getPrenom().equals(prenom)))
                result.add(patients.get(i));
            return result;
        }
        

			
		@POST
		@Path("ajout")
		
        public void createPatient(@QueryParam ("num") String num,
        		@QueryParam ("nom")String nom,
        		@QueryParam ("prenom")String prenom,
        		@QueryParam ("heure")int heure ) { 
            
            Patient aa=new Patient(num, nom, prenom, heure);
            ListPatientBD.getPatients().add(aa);
            
     
        }
		@DELETE
		@Path("suppr")
        public void remove(@QueryParam ("num") String num) 
        { 
            List<Patient> patient = ListPatientBD.getPatients();
            int k=-1;
            for(int i=0; i<patient.size(); i++)
            if(patient.get(i).getNumPatient().compareTo(num)==0)
              
                patient.remove(i);
        }
    	
    	
		@PUT
		@Path("modify")
        public void modify(@QueryParam ("num")String num ,@QueryParam("heure") int heure) 
        { 
            List<Patient> patient = ListPatientBD.getPatients();
            int k=-1;
            for(int i=0; i<patient.size(); i++)
            if(patient.get(i).getNumPatient().compareTo(num)==0)
              
                patient.get(i).setHeureRendv(heure);;
        }
        
        
    }
