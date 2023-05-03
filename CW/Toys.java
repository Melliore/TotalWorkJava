package CW;

public abstract class Toys {


    public int toy_ID;
  public String toy_Name;
  public int toy_Count;
  public double toy_Chance;

  public int getToy_ID() {
        return toy_ID;
    }

    public void setToy_ID(int toy_ID) {
        this.toy_ID = toy_ID;
    }

    public String getToy_Name() {
        return toy_Name;
    }

    public void setToy_Name(String toy_Name) {
        this.toy_Name = toy_Name;
    }

    public int getToy_Count() {
        return toy_Count;
    }

    public void setToy_Count(int toy_Count) {
        this.toy_Count = toy_Count;
    }

    public double getToy_Chance() {
        return toy_Chance;
    }

    public void setToy_Chance(double toy_Chance) {
        this.toy_Chance = toy_Chance;
    }

    public Toys(int toy_ID, String toy_Name, int toy_Count, double toy_Chance) {
        this.toy_ID = toy_ID;
        this.toy_Name = toy_Name;
        this.toy_Count = toy_Count;
        this.toy_Chance = toy_Chance;




    }
}
