package practice07;

import static CommonConstants.CommonConstants.STUDENT;

public class Student extends Person{
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }


    public String introduce(){
        return super.introduce() + " "+STUDENT+" I am at "+klass.getDisplayName()+".";
    }
}
