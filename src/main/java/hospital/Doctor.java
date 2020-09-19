package hospital;

public class Doctor extends HospitalEmployee implements MedicalDuties {      //Doctor class now a child of HospitalEmployee class / also now implements medical duties which gives access to those methods

    private String specialty;       //keep specialty - unique property for this class

    public Doctor(String employeeNumber, String name, String specialty) {
        super(employeeNumber, name);            //super reference means these properties are coming from their parent
        this.specialty = specialty;
    }

    @Override
    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(10);
    }

    @Override
    public void drawBlood(Patient sickPatient) {
        sickPatient.decreaseBloodLevel(5);
    }

    @Override                       //overrode abstract method to properly return the right data
    public int calculatePay() {
        return 90000;
    }

}
