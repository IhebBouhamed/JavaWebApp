/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.iit.examds;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ahmed
 */
    @XmlRootElement(name = "patient") 

    public class Patient { 

    	

        private String numPatient; 

        private String nom; 

        private String prenom; 

        private int heureRendv; // Format : 1230 = 12h30 

     

        public Patient() {         

        } 

     

     
        public Patient(String numPatient, String nom, String prenom, int heureRendv) {
			super();
			this.numPatient = numPatient;
			this.nom = nom;
			this.prenom = prenom;
			this.heureRendv = heureRendv;
		}




		public String getNumPatient() {
			return numPatient;
		}




		public void setNumPatient(String numPatient) {
			this.numPatient = numPatient;
		}




		public String getNom() {
			return nom;
		}




		public void setNom(String nom) {
			this.nom = nom;
		}




		public String getPrenom() {
			return prenom;
		}




		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}




		public int getHeureRendv() {
			return heureRendv;
		}




		public void setHeureRendv(int heureRendv) {
			this.heureRendv = heureRendv;
		}




		@Override
		public String toString() {
			return "Patient [numPatient=" + numPatient + ", nom=" + nom + ", prenom=" + prenom + ", heureRendv="
					+ heureRendv + "]";
		}
    }



		