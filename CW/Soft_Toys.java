package CW;

public class Soft_Toys extends Toys
{
    public String fiber_Type;

    public Soft_Toys(int toy_ID, String toy_Name, int toy_Count, double toy_Chance, String fiber_Type) {
        super(toy_ID, toy_Name, toy_Count, toy_Chance);
        this.fiber_Type = fiber_Type;
    }

    public String getFiber_Type() {
        return fiber_Type;
    }

    public void setFiber_Type(String fiber_Type) {
        this.fiber_Type = fiber_Type;
    }



    @Override
    public String toString() {
        return  "\n=========="
                + "\nID игрушки : " + getToy_ID() + " "
                + "\nНазвание игрушки: " + getToy_Name() + " "
                + "\nКоличество игрушек: " + getToy_Count() + " "
                + "\nШанс выпадения: " + getToy_Chance() + " "
                + "\nМатериал игрушки: " + getFiber_Type();
    }
}

