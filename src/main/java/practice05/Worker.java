package practice05;

import static CommonConstants.CommonConstants.WORKER;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        return super.introduce() + " "+WORKER;
    }
}
