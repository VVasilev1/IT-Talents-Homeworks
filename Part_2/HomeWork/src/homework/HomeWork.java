package homework;

public class HomeWork {
	  public static void main(String[] args) {
	       Person [] arr = new Person[10];
	       Person p1 = new Person("Gosho",(short)15,true);
	       Person p2 = new Person("Goshko",(short)16,true);
	       Student s1 = new Student("Vladimir", (short)21,true,6.00);
	       Student s2 = new Student("Dimitar", (short)20,true,6.00);
	       Employee e1 = new Employee("Stefan" , (short) 50, true, 10.00);
	       Employee e2 = new Employee("Daniela" , (short) 48, false, 10.00);
	       
	       arr[0] = p1;
	       arr[1] = p2;
	       arr[2] = s1;
	       arr[3] = s2;
	       arr[4] = e1;
	       arr[5] = e2;
	       
	      for (int index = 0 ; index < arr.length; index ++) {
	    	  if (arr[index] == null) {
	    		  continue;
	    	  }
	    	  
	    	  if (arr[index].getClass().toString().equals("class homework.Person")) {
	    		  arr[index].showPersonInfo();
	    	  }
	    	  if (arr[index].getClass().toString().equals("class homework.Student")) {
	    		  ((Student) arr[index]).showStudentInfo();
	    	  }
	    	  if (arr[index].getClass().toString().equals("class homework.Employee")) {
	    		  ((Employee) arr[index]).showEmployeeInfo();
	    	  }	    	 
	    	  
	      }
	      for (int index = 0 ; index < arr.length; index ++) {
	    	  if (arr[index] == null) {
	    		  continue;
	    	  }
	    	  if (arr[index].getClass().toString().equals("class homework.Employee")) {
	    		  System.out.println(((Employee) arr[index]).calculateOverTime(2.00));
	    	  }
	      }
	    }

}
