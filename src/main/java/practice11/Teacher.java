package practice11;

import java.util.LinkedList;

import static CommonConstants.CommonConstants.TEACHER;

public class Teacher extends Person{
    public LinkedList<Klass> klasses;
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }


    public LinkedList getClasses(){
        return klasses;
    }

    public String introduce(){
        if(klasses == null){
            return super.introduce() + TEACHER + " I teach No Class.";
        }

        return super.introduce() + TEACHER + " I teach Class "+iterateClasses()+".";
    }

    private String iterateClasses() {
        String classes = "";

        for(Klass klass : klasses){
            if(klass == klasses.getLast()){
                classes += klass.getNumber();
                break;
            }
            classes += klass.getNumber() + ", ";
        }

        return classes;
    }

    public String introduceWith(Student student){
        if(klasses.contains(student.getKlass())){
            return super.introduce() + TEACHER + " I teach "+student.getName()+".";
        }
        else{
            return super.introduce() + TEACHER + " I don't teach "+student.getName()+".";
        }
    }

    public boolean isTeaching(Student student) {
        return klasses.stream()
                .anyMatch(stud -> stud.equals(stud.isIn(student)));
    }

}
