public class Nurse extends HospitalEmployee {
    protected int numOfPatients;

    public Nurse(String name, int number, int numOfPatients) {
        this.name = name;
        this.number = number;
        this.numOfPatients = numOfPatients;
    }
    public int getNumOfPatients() {
        return numOfPatients;
    }

    public void setNumOfPatients(int numOfPatients){ //Specify Nurse's number of patients
        this.numOfPatients = numOfPatients;
    }
    @Override
    public String toString() {
        return "Nurse name: " + name + "\n" + "Nurse number: " + number + "\n" + "Nurse's # of patients: " + numOfPatients + "\n--------------------";
    }

    @Override
    public void work(){
        System.out.println(name + " is a nurse who works for the hospital. They currently have " + numOfPatients + " patients.");
    }
}