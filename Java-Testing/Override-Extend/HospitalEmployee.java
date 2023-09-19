public class HospitalEmployee {

    protected String name; //protected allows subclasses of HospitalEmployee to access name and number as well
    protected int number;

    public HospitalEmployee() { //default constructor needed since we're extending to subclasses.
        this.name = "";
        this.number = 0;
    }

    public HospitalEmployee(String name, int number) {
        this.name = name; // this would make name refer to the current object.
        this.number = number;
    }

    public String getName() {
        return name; //Anyone can access this and get the current patient name.
    }

    public void setName(String name) {
        this.name = name; //Allows a user to set a patient's name.
    }

    public int getNumber() {
        return number; //Anyone can access this and get the current number
    }

    public void setNumber(int number) {
        this.number = number; //Allows user to set a patient's number (like an ID, perhaps)
    }

    public String toString() {
        return "Employee name: " + name + "\n" + "Employee number: " + number + "\n--------------------";
    }

    public void work() {
        System.out.println(name + " works for the hospital.");
    }
}

