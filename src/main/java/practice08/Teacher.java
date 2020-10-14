package practice08;

import static CommonConstants.CommonConstants.TEACHER;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }


    public String introduce(){
        if(klass == null){
            return super.introduce() + TEACHER + " I teach No Class.";
        }

        return super.introduce() + TEACHER + " I teach "+klass.getDisplayName()+".";
    }

    public String introduceWith(Student student){
        if(student.getKlass() == klass){
            return super.introduce() + TEACHER + " I teach "+student.getName()+".";
        }
        else{
            return super.introduce() + TEACHER + " I don't teach "+student.getName()+".";
        }
    }
}
