package q5.library.members;

public class Member {

    private String name;

    public Member(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void display(){
        System.out.println("Member: " + name);
    }
}