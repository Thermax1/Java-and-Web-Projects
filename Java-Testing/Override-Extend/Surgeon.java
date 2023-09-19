public class Surgeon extends Doctor {
    protected boolean operating;

    public Surgeon(String name, int number, String speciality, boolean operating){
        super(name, number, speciality); //same as writing out this, but I took it from Doctor to save time.
        this.operating = operating;
    }

    public boolean getOperating(){
        return operating; //true or false if doctor is operating. I believe it's false by default
    }
    public void setOperating(boolean operating){
        this.operating = operating;
    }

    @Override
    public String toString() {
        return "Surgeon name: " + name + "\n" + "Surgeon speciality: " + speciality + "\n" + "Surgeon number: " + number + "\n" + "Currently operating: " + operating + "\n--------------------";
    }

    @Override
    public void work(){
        System.out.print(name + " is a " + speciality + " Surgeon who works for the hospital. ");
        if (operating == true)
            System.out.println(name + " is currently operating.");
        else
            System.out.println(name + " is currently not operating.");
    }
}