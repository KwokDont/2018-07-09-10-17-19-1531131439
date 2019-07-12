package practice09;

public class Student extends Person{
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name,age);
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public String introduce(){
        if(this == klass.getLeader()){
            return super.introduce() + String.format(" I am a Student. I am Leader of Class %s."
                    ,klass.getNumber());
        }else{
            return super.introduce() + String.format(" I am a Student. I am at Class %s."
                    ,klass.getNumber());
        }
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
