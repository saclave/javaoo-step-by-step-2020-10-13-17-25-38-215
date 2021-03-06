package practice08;

public class Klass {
    private int number;
    public Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class " + number;
    }

    public Klass assignLeader(Student student) {
        this.leader = student;
        return this;
    }

    public Student getLeader() { return leader; }
}
