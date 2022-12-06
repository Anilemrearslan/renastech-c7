package CustomClassesForHomework;

public class Shoes {
    public String Brand;
    public double Size;
    public String Type;
    public double Price;

    public void setInfo(String brand, double price){
        Brand= brand;
        Price = price;
    }

    public void Print(){
        System.out.println("Brand = "+Brand);
        System.out.println("Size = "+Size);
        System.out.println("Type = "+Type);
        System.out.println("Price = "+Price);
    }
}
