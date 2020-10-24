public class Lab7_5 {
    public static void main(String[] args){
        Employee emp = new Manager();
        Address address = new Address();
        address.setCity("Thailand");
        address.setStreet("Jaran");
        emp.setAddress(address);
        emp.setName("สมศักดิ์");
        emp.setId(1220);
        emp.setSalary(20000.0);
        ((Manager)emp).setParkingNo("10160");
        System.out.println(((Manager)emp).getDetails());
    }
}

class Address extends Employee{
    protected String street;
    protected String city;
    
    public String getStreet(){
        return street;
    }
    
    public void setStreet(String street){
        this.street = street;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public String getAddressInfo(){
        return street + " " + city;
    }
}

class Employee{
    protected int id;
    protected String name;
    protected double salary;
    protected Address address;
    
    public String getDetails(){
        return (name + " " + id + " :salary" + salary + " Baht." + address.getAddressInfo());
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public Address getAddress(){
        return address;
    }
    
    public void setAddress(Address address){
        this.address = address;
    }
}

class Manager extends Employee{
    protected String parkingNo;
    
    public String getParkingNo(){
        return parkingNo;
    }
    
    public void setParkingNo(String parkingNo){
        this.parkingNo = parkingNo;
    }
    
    @Override
    public String getDetails(){
        return (name + " " + " : salary " + salary + " Baht. : parking No : " + parkingNo + " , " + address.getAddressInfo());
    }
}