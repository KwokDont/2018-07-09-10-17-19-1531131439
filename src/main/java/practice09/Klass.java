package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> member = new ArrayList<Student>();

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName(){
        return String.format("Class %s",number);
    }

    public void assignLeader(Student leader){
        if(member.contains(leader)){
            this.leader = leader;
        }else{
            System.out.print("It is not one of us.\n");
        }

    }

    public void appendMember(Student student){
        member.add(student);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public List<Student> getMember() { return member; }

    public void setMember(List<Student> member) { this.member = member; }
}
