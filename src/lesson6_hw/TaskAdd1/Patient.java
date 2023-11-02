package lesson6_hw.TaskAdd1;

public class Patient {
    private String name;
    private Treatment treatment;
    private Doctor doctor;

    public Patient(String name, Treatment treatment) {
        this.name = name;
        this.treatment = treatment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public void doctorAppoint() {
        switch (this.treatment.getCode()) {
            case 1: {
                System.out.print("Пациент " + this.getName() + ". ");
                this.setDoctor(new Surgeon());
                this.getDoctor().heal();
                break;
            }
            case 2: {
                System.out.print("Пациент " + this.getName() + ". ");
                this.setDoctor(new Dentist());
                this.getDoctor().heal();
                break;
            }
            default: {
                System.out.print("Пациент " + this.getName() + ". ");
                this.setDoctor(new Therapist());
                this.getDoctor().heal();
                break;
            }

        }
    }
}
