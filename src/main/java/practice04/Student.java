package practice04;

import static CommonConstants.CommonConstants.STUDENT;

public class Student extends Person{
    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }


    public String introduce(){
        return super.basicIntroduce() + " "+ STUDENT +" I am at Class "+klass+".";
    }
}
