public class Doctor extends HospitalEmployee {
    protected String speciality;

    public Doctor(){
        this.name = "";
        this.number = 0;
        this.speciality = "";
    }
    public Doctor(String name, int number, String speciality) {
        this.name = name;
        this.number = number;
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality){ //Specify Doctor's speciality
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Doctor name: " + name + "\n" + "Doctor speciality: " + speciality + "\n" + "Doctor number: " + number + "\n--------------------";
    }

    @Override
    public void work(){
        System.out.println(name + " is a " + speciality + " Doctor who works for the hospital.");
    }
}