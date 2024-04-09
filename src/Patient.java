public class Patient {
    private Doctor doctor;
    private int treatmentPlan;

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
        this.doctor = new Therapist().appointADoctor(this.treatmentPlan);
    }

    public Doctor getDoctor() {
        return doctor;
    }
}
