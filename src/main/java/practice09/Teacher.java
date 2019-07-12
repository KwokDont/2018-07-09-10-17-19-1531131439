package practice09;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id,name,age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public String introduce(){
        return super.introduce() + String.format(" I am a Teacher. I teach %s."
                ,(klass == null)?"No Class" : "Class " + klass.getNumber());
    }
    public String introduceWith(Student student){
        return super.introduce() + String.format(" I am a Teacher. I %s."
                , student.getKlass() == klass ? "teach " + student.getName():"don't teach " + student.getName());
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
