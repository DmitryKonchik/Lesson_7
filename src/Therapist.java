public class Therapist extends Doctor {
    @Override
    public void treat() {
        System.out.println("Терапевт лечит");
    }
    public Doctor appointADoctor (int treatmentPlan) {
        if (treatmentPlan == 1) {
            Surgeon surgeon = new Surgeon();
            surgeon.treat();
            return surgeon;
        }
        if (treatmentPlan == 2) {
            Dentist dentist = new Dentist();
            dentist.treat();
            return dentist;
        }

        this.treat();
        return this;
    }
}
