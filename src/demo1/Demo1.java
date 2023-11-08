package demo1;


class Mobile 
{
    String name;
    String os;
    int price;
    
    public void setData(String set_Name, String set_os, int set_price) 
    {
        name = set_Name;
        os = set_os;
        price = set_price;
        
    }
    public String getName() 
    {
        return name;
    }
    public String getos() 
    {
        return os;
    }
    public int getPrice() 
    {
        return price;
    }
} 
public class Demo1 {
    
    public static void main(String[] args) {
    
        Mobile phone = new Mobile();
        phone.setData("Samsung", "Android", 25000);
        System.out.println(phone.getName());
        System.out.println(phone.getPrice());
        System.out.println(phone.getos());
    }
    
}
