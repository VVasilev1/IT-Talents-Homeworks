package homework;

public class Person {
	 public static final int MIN_AGE = 0;
     String name;
     short age;
     boolean isMale;
     
     Person(String name, short age, boolean isMale) { 
         if (name != null && !name.equals(" ")) {
         this.name = name;
         }
         if (age > MIN_AGE ) {
         this.age = age;
         }
         this.isMale = isMale;
         
     }
     void showPersonInfo () {
         System.out.println(this.name + " " + this.age + " " + this.isMale);
              
     }

}
