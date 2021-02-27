package check;

public class Check {
     public static void main(String[] args) {
    	 
    	 String firstName = "梅村";
    	 String lastName = "潤也";
    	 
    	 printName(firstName,lastName);
    	 
    	 Pet pet = new Pet("java吉","hoge");
    	 pet.introduce();
    	 
    	 RobotPet rpet = new RobotPet("R2D2","ルーク");
    	 rpet.introduce();
     }
private  final static void printName(String firstName, String lastName ) {
	System.out.println("printNameメソッド→" + firstName + lastName);
 }
}