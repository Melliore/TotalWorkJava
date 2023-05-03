package CW;

public class Solid_Toys extends Toys
{
   public String age_Limit;

    public Solid_Toys(int toy_ID, String toy_Name, int toy_Count, double toy_Chance, String age_Limit) {
        super(toy_ID, toy_Name, toy_Count, toy_Chance);
        this.age_Limit = age_Limit;
    }

    public String getAge_Limit() {
        return age_Limit;
    }

    public void setAge_Limit(String age_Limit) {
        this.age_Limit = age_Limit;
    }

    @Override
    public String toString() {
        return  "\n=========="
                + "\nID игрушки : " + getToy_ID() + " "
                + "\nНазвание игрушки: " + getToy_Name() + " "
                + "\nКоличество игрушек: " + getToy_Count() + " "
                + "\nШанс выпадения: " + getToy_Chance() + " "
                + "\nВозрастное ограничение игрушки: " + getAge_Limit();
    }
}
