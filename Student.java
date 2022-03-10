public class Student {
//Instance variables
   private String studentNumber;
    private boolean feesPaid;

    //Parmetrized Constroctor
    public Student(String studentNumber, boolean feesPaid){
        this.studentNumber = studentNumber;
        this.feesPaid = feesPaid;
    }
    //Getters

    public String getStudentNumber() {
        return studentNumber;
    }

    public boolean getFeesPaid() {
        return feesPaid;
    }
    //Setters

    public  void setstudentNumber(String  studentNumber ){
         this.studentNumber =  studentNumber;
         }

         public void studying(){
             System.out.println("I am studying...");
             
         }

}