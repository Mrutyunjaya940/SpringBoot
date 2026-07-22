package EmployeeData;

public class employee {
     String name;
     String address;

     public employee() {
          this.name=name;
          this.address=address;
     }

     public void setName(String name) {

          this.name = name;
     }

     public String getName() {

          return name;
     }

     public void setAddress(String address) {

          this.address = address;
     }
     public String getAddress() {

          return address;
     }

     @Override
     public String toString() {
          return "employee{" +
                  "name='" + name + '\'' +
                  ", address='" + address + '\'' +
                  '}';
     }
}
