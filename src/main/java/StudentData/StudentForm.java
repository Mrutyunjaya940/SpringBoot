package StudentData;

public class StudentForm {
    String name;
    int rollNo;
    String Address;
     public StudentForm(String name,int rollNo, String Address)
    {
        this.name=name;
        this.rollNo=rollNo;
        this.Address=Address;
    }

    public void setname(String name)
    {
        this.name=name;
    }

    public String getname()
    {
        return name;
    }

    public void setrollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getrollNo() {
        return rollNo;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getAddress() {
        return Address;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", roll No.='" + rollNo + '\'' +
                ", address='" + Address + '\'' +
                '}';
    }
}
