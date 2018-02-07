
package helloworld_netbeans;

import Printers.SimplePrinter;


public class HelloWorld_Netbeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimplePrinter sp= new SimplePrinter("Printer1");
        sp.printSecretMessage("I love Switzerland!");
    }
}