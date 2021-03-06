package check;

import constants.Constants;


public class Check {
     
    	 private String firstName = "梅村";
    	 private String lastName = "潤也";
    	 
    	 private void printName() {
    		 System.out.println("printNameメソッド" + " " + "→" +" " + firstName + lastName);
    	 }
    	 
    	 public static void main(String[] args) {
    		 Check ch = new Check();
    		   ch.printName();
    		 
    	     Pet pt = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
    	     pt.introduce();
    	     
    	     RobotPet rpt = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
    	     rpt.introduce();
    	 }
}