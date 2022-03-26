
package assignment2;

public class phone {
    
       public String alertType(){
            return ("Sound and vibration.");
        }
    
    
     //New Class Nokia inherits alert type from class phone + has its own method
     
    
}

class Nokia extends phone{
       public void gaming(){
           
       }
     
   }
   
   //Class Samsung inherits has own method and own alert type
       class Samsung extends phone {
           
       public void screenReader(){
       }
       
       @Override 
       public String alertType(){
           return ("Bright flash.");
       }
   }
     
    