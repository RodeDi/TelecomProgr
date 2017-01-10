package java_project;

public class Customer {
    private String name_;
    private String phone_number_;   
    private String adress_;
    private String cost_;
    
    public Customer()
    {
        phone_number_ = "";
        name_ = "";
        adress_ = "";
        cost_ = "";
    }
    
    public Customer(String name, String phone_number, String adress, String cost) {
        name_ = name;
        phone_number_ = phone_number;     
        adress_ = adress;
        cost_ = cost;
    }
    
    public String getName() {
        return name_;
    }
    public String getNumber() {
        return phone_number_;
    }   
    public String getAdress() {
        return adress_;
    }
    public String getCost() {
        return cost_;
    }
    
    public void setName(String name) {
       name_ = name; 
    }
    public void setNumber(String phone_number) {
       phone_number_ = phone_number; 
    }   
    public void setAdress(String adress) {
       adress_ = adress; 
    }
    public void setCost(String cost) {
       cost_ = cost; 
    }
    
    public void print() {
        System.out.println(" Name of the customer: " + name_);
        System.out.println(" Phone number: " + phone_number_);       
        System.out.println(" Customer's address: " + adress_);
        System.out.println(" Cost of the phone talking: " + cost_);
    }
}