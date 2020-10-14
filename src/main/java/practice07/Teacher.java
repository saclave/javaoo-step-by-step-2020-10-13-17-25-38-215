package practice07;

public class Teacher extends Person{
    private Klass klass;
    private final String TEACHER = " I am a Teacher.";

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
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
            return super.introduce() + TEACHER + " I teach Jerry.";
        }
        else{
            return super.introduce() + TEACHER + " I don't teach Jerry.";
        }
    }
}
