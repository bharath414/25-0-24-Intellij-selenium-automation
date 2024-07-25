package practice;
//To refer current class intance variables
//To invoke current class method
//To invoke current class instructer

public class Thiskeyword {
        int rollno;
        String name;
        float fee;
        Thiskeyword(int rollno, String name, float fee){
          this.rollno=rollno;
           this.name=name;
           this.fee=fee;
        }
        void display(){System.out.println(rollno+" "+name+" "+fee);
       // this.display1();
        }

    public void display1(){System.out.println("Invoke current class metohd");
        this.display();
        }

}
    class TestThis1{
        public static void main(String args[]){
            Thiskeyword s1=new Thiskeyword(111,"ankit",5000f);
          //  Thiskeyword s2=new Thiskeyword(112,"sumit",6000f);
            s1.display();
           // s2.display();
            s1.display1();
        }
}