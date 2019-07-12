package practice06;

public class Teacher extends Person{
    private int klass;

    public Teacher(String name, int age) {
        super(name,age);
    }

    public Teacher(String name, int age, int klass) {
        super(name,age);
        this.klass = klass;
    }

    public String introduce(){
        return super.introduce() + String.format(" I am a Teacher. I teach %s."
                ,(klass == 0)?"No Class" : "Class " + klass);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
