
package reportesautopista;

import Controler.Operaciones;
import java.io.IOException;

public class ReportesAutopista {

    public static void main(String[] args) throws IOException {
    Operaciones oper = new Operaciones();
        try {
           oper.AlmacenarCobradores(); 
        } catch (IOException e) {
            System.out.println("exception main");
        }
     
        System.out.println("Fin de main");
        //System.exit(0);
    }
    
}
