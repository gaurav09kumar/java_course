public class Student {
    int SID;
    String Sname;
    double Sub1;
    double Sub2;
    double Sub3;
    
    public void setStuData(int Sid , String Sname){
        this.SID = Sid;
        this.Sname = Sname;
    }
    
    public void setStuMarks(double Sub1 , double Sub2 , double Sub3){
        this.Sub1 = Sub1;
        this.Sub2 = Sub2;
        this.Sub3 = Sub3;
    }
    
    public double calTotalMarks(){
         return (this.Sub1 + this.Sub2 + this.Sub3);
    }
    
	public static void main(String [] args){
	    //Classes and Objects
	    Student s1 = new Student();
	    s1.setStuData(198 , "Matt");
	    s1.setStuMarks(55, 100, 55);
	    System.out.println("Total marks of Student : " + s1.Sname + " is : " + 
	    s1.calTotalMarks());
	   }
	}