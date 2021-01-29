package emp;
import java.util.Scanner;
class Employee
{
    Double mobNo;
    String name, address,eid, mailId;
    Scanner get = new Scanner(System.in);
    Employee()
    {
        System.out.println("Enter Name of the Employee:");
        name = get.nextLine();
        System.out.println("Enter The ID Of The Employee:");
        eid = get.nextLine();
        System.out.println("Enter Address Of The Employee:");
        address = get.nextLine();
        System.out.println("Enter Mail ID Of The Employee:");
        mailId = get.nextLine();
        System.out.println("Enter The Mobile No:");
        mobNo = get.nextDouble  ();
    }
    void display()
    {
        System.out.println("Employee Name: "+name);
        System.out.println("EmployeeID: "+eid);

        System.out.println("Address: "+address);
        System.out.println("MailID: "+ mailId);
        System.out.println("Mobile No: "+ mobNo);
    }
}
class programmer extends Employee
{
    double bp,rate,net;
    String des;
    programmer()
    {
        System.out.println("Enter The Basic Pay:");
        bp= get.nextFloat();
    }
    void calculatePayProg()
    {
        rate = bp+(0.97*bp)+(0.01*bp)+(0.12*bp)+(.001*bp);
        net=rate-(0.12*bp);
    }
    void display()
    {
        System.out.println("=============================="+"\n"+"Programmer Details"+"\n"+"=============================="+"\n");
        super.display();
        System.out.println("Gross Salary: "+rate);
        System.out.println("Net Salary: "+net);
    }
}
class assistantProfessor extends Employee
{
    double bp1,rate1,net1;
    String des1;
    assistantProfessor()
    {
        System.out.println("Enter The Basic Pay:");
        bp1= get.nextFloat();
    }
    void calculatePay1()
    {
        rate1 = bp1+(0.97*bp1)+(0.01*bp1)+(0.12*bp1)+(.001*bp1);
        net1=rate1-(0.12*bp1);
    }

    void display()
    {
        System.out.println("=============================="+"\n"+"Assistant Professor Details"+"\n"+"=============================="+"\n");
        super.display();
        System.out.println("Gross Salary: "+rate1);
        System.out.println("Net Salary "+net1);
    }
}

class salary
{
    public static void main(String[] args)
    {
        System.out.println("================================"+"\n"+"Enter Programmer Details"+"\n"+"================================"+"\n");
        programmer ob1 = new programmer();

        ob1.calculatePayProg();
        ob1.display();
        System.out.println("================================"+"\n"+"Enter Assistant Professor  Details"+"\n"+"================================"+"\n");
        assistantProfessor ob = new assistantProfessor();
        ob.calculatePay1();
        ob.display();
    }}