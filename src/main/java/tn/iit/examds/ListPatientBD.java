
package tn.iit.examds;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ahmed
 */
    public class ListPatientBD { 
        private static List<Patient> patients = new ArrayList<Patient>();  
        static { 

            patients.add(new Patient("PAT1111", "IHEB", "BOUHAMED", 1330)); 
            patients.add(new Patient("PAT2222", "BOUHAMED", "IHEB", 1430)); 



        } 
        public static List<Patient> getPatients() { 
            return patients; 
        } 

    } 
