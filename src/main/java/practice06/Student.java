package practice06;

public class Student extends Person{
    private int klass;

    public Student(String name, int age, int klass) {
        super(name,age);
        this.klass = klass;
    }

    public String introduce(){
        return super.introduce() + String.format(" I am a Student. I am at Class %s.",klass);
    }


    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
