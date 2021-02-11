package study;

public class Main {

    public static void main(String[] args) {

        String firstName ="Umemura";
        String lastName ="Junya";
        
        System.out.println(getName(firstName, lastName));
        System.out.println();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for ( int n = 0; n < arr.length; n++) {
        	if(n % 2 != 0)
        		System.out.println(n + "は奇数です。");
        }
}
    public static String getName(String firstName,String lastName) {
    	
    	return firstName + lastName;
    }
    
    public static void isOdd(int num) {
      if(num % 2 != 0) {
        System.out.println(num + "は奇数です。");
        }
  }
}