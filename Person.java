public class Person {
    // Instance Variables
  private  String name;
     private int age;


    // Constructors
    //Deafult Constructor
    public Person(){
        this.name = null;
        this.age= 0;
    }
//Paremeterized Constroctor
public Person(String name, int age ){
    this.name = name;
    this.age = age;
}



    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


  
    // Setters
    
   public  void setName(String newName){
        name = newName;

    }

    public void setAge(int newAge){
        if(newAge < 0 || newAge > 130){
            System.out.println("InvaildAge!");

        }else{
            this.age = newAge;
        }
    }

}
