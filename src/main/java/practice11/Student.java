package practice11;

import static CommonConstants.CommonConstants.STUDENT;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        if(klass.leader == this) {
            return super.introduce() + " "+STUDENT+" I am Leader of " + klass.getDisplayName() + ".";
        }
        return super.introduce() + " "+STUDENT+" I am at " + klass.getDisplayName() + ".";
    }
}
