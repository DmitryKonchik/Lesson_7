public class Main {

    public static void main(String[] args) {
        Patient patient = new Patient(1);
        System.out.println(patient.getDoctor().getClass().getName());
    }
}