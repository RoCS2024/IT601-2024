package ReserveFacility;

public class Visitor {
    private String Name = "";

    private int numberOfPersons = 0;
    public void setName(String Name){
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }

    public void setNumberOfPersons(int number){
        this.numberOfPersons = number;
    }

    public int getNumberOfPersons(){
        return numberOfPersons;
    }




}
