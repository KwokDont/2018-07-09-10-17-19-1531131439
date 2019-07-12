package practice10;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    private Klass klass;
    private List<Klass> classes = new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id,name,age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public String introduce(){
        if(classes.size() != 0){
            String classString = "";
            List<String> classNoList = new ArrayList<>();
            for(Klass klass:classes){
                classNoList.add(String.valueOf(klass.getNumber()));
            }
            classString = StringUtils.join(classNoList,", ");
            return super.introduce() + String.format(" I am a Teacher. I teach %s.","Class " + classString);
        }else{
            return super.introduce() + String.format(" I am a Teacher. I teach %s.","No Class");
        }
    }
    public String introduceWith(Student student){
        if(isTeaching(student)){
            return super.introduce() + String.format(" I am a Teacher. I %s.", "teach " + student.getName());
        }else{
            return super.introduce() + String.format(" I am a Teacher. I %s.", "don't teach " + student.getName());
        }

    }

    public boolean isTeaching(Student student){
        return classes.contains(student.getKlass());
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public List<Klass> getClasses() { return classes; }

    public void setClasses(List<Klass> classes) { this.classes = classes; }
}
