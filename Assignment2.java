
package assignment2;

class Assignment2 {

  public static void main(String[] args){
       
       Nokia Nokia3210=new Nokia();
       Nokia3210.alertType();
       
       Samsung SamsungLite = new Samsung();
       SamsungLite.alertType();
       
       
       System.out.println("The Nokia 3210 gets your attention through: " + Nokia3210.alertType());
       System.out.println("The Samsung Lite gets your attention through: "+ SamsungLite.alertType());
       
    }
}

