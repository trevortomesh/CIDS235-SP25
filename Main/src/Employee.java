public class Employee extends Person{

    public Employee(){
        this("(2) Invokes employee's overloaded constructor");
        System.out.println("(3) performs employee tasks");
    }

    public Employee(String s){
        super();
        System.out.println(s);
    }

}
