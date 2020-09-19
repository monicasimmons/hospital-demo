package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoctorTest {

    Doctor underTest = new Doctor("1", "name", "specialty");
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelOfPatientFrom10To20WhenProvidingCare() {   //dr to care for patient
        underTest.careForPatient(sickPatient);                                      //making a method that will take on an object
        int healthLevel = sickPatient.getHealthLevel();                      //checking health level of patient once we've provided care
       assertEquals(20, healthLevel);
    }

    @Test
    public void decreaseBloodLevelFrom20to15WhenDrawingBlood() {
        underTest.drawBlood(sickPatient);
        int bloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, bloodLevel);

    }

    @Test
    public void shouldExpectASalaryOf90k() {
        int salary = underTest.calculatePay();
        assertEquals(90000, salary);

    }
}
