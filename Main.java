public class Main {
    // Add main method below this comment
    
    public static void main(String[] args) {
        
        //Create Person object using the deafult constuctor
        Person personObject1 = new Person();
        //Create person object using parametrized constoctor
        Person personObject2 = new Person("John", 40);

        Student studentObject1 = new Student("G0067606", true );

        personObject1.setName("Sam");
        personObject1.setAge(10);

        System.out.println (    personObject1.getName() );
        System.out.println (    personObject1.getAge() );
        System.out.println (    personObject2.getName() );
        System.out.println (    personObject2.getAge() );

         System.out.println (   studentObject1.getStudentNumber() );
         System.out.println (   studentObject1.getFeesPaid() );

         studentObject1.studying();
    }
}
