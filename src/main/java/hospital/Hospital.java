package hospital;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {

    Map<String, HospitalEmployee> employeeList = new HashMap<>();
    Map<Integer, Patient> patientList = new HashMap();
    private int patientId;

    public void hire(HospitalEmployee employeeToHire) {                           //placed dr in list
        employeeList.put(employeeToHire.getEmployeeNumber(), employeeToHire);
    }

    public HospitalEmployee findEmployee(String employeeNumber) {          //find employee by employee number
        return employeeList.get(employeeNumber);
    }

    public Collection<HospitalEmployee> getAllEmployees() {
        return employeeList.values();                                  //should give us all of employees in our collection
    }

    //creates new collection (a sub-category so to speak) within origin database
    public Collection<HospitalEmployee> getMedicalEmployees() {
        Collection<HospitalEmployee> medicalEmployees = new ArrayList<>();        //use instance of keyword - allow us to bring in objects related to a parent class or objects related to an interface - powerful bc we can categorize things based on a class they come from
        //need to iterate through my database and pull out the medical employees and put them in this ArrayList
        for (HospitalEmployee employee : employeeList.values()) {           //for each HospitalEmployee in our collection, we're going to do if logic
            if (employee instanceof MedicalDuties) {                       //if employee implements MedicalDuties interface
                medicalEmployees.add(employee);

            }
        }
        return medicalEmployees;                         //step out of loop and now we can return
    }

    public void admit(Patient patientToAdmit) {
        patientId++;                        //every time I admit a patient, I'll increase the patient Id
        patientList.put(patientId, patientToAdmit);                                   //need primary key for patient
            //every time I admit a patient, I'll assign them an ID

    }

    public Collection<Patient> getAllPatients() {
        return patientList.values();
    }
}