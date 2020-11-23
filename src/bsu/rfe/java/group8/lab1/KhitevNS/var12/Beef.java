package bsu.rfe.java.group8.lab1.KhitevNS.var12;

public class Beef extends Food {
    private String preparedness;
    public Beef(String preparedness)
    {
        super("Мясо");
        this.preparedness = preparedness;
    }

    public void consume() {
        System.out.println(this + " съедено");
    }

    public String getPreparedness()
    {
        return preparedness;
    }

    public void setPreparedness(String preparedness)
    {
        this.preparedness = preparedness;
    }

    public String toString()
    {
        return super.toString() + " готовности " + preparedness.toUpperCase() + "'";
    }

}