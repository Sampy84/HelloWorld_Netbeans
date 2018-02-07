
package Printers;


public class SimplePrinter {
    
    String name;
    
    public SimplePrinter(String str) {
    
        this.name=str;
        System.out.println("Hi, I'm "+this.name+", a SimplePrinter!");
    }
    
    public void printSecretMessage(String message){
    
        System.out.println("The secret message is: "+ message+ "\n");
        sayBye();
    }
    
    private void sayBye() {
    
        System.out.println("Bye!");
    }
}