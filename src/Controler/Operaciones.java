package Controler;

import Model.Certificacion;
import Model.Cobrador;
import Model.Eludidos;
import Model.Evento;
import Model.EventoId;
import Model.Periodostarifas;
import Model.Supervisor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Operaciones {
public void AltaCobrador(Cobrador cobrador){
        SessionFactory sessionf = NewHibernateUtil.getSessionFactory();
        Session session;
        session=sessionf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cobrador);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Insertado Correctamente");
    }        
    
public void AlmacenarDatos() throws FileNotFoundException, IOException{
  /*  File myFile = new File("C:\\Users\\Mario Arellano\\Documents\\NetBeansProjects\\ReportesAutopista\\28-05-2017.xlsx");
        
        FileInputStream fis = new FileInputStream(myFile);
        
        XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
           
            // Return first sheet from the XLSX workbook
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
           
            // Get iterator to all the rows in current sheet
            Iterator<Row> rowIterator = mySheet.iterator();
            
            // Traversing over each row ofXLSX file
           
          // while (rowIterator.hasNext()) {
              Row row = rowIterator.next();    
                    row = rowIterator.next();  
                    row = rowIterator.next();  
                    row = rowIterator.next();  
                    row = rowIterator.next();  
                
                    int idFolioSistema= (int) row.getCell(7).getNumericCellValue();
                    //int supervisorIdNumeroEmpleado=(int) row.getCell(0).getNumericCellValue();
                    int empleadoIdNumeroEmpleado= (int) row.getCell(5).getNumericCellValue();
                    
                    
                    int periodosTarifasIdPeriodoTarifa1=(int) row.getCell(0).getNumericCellValue();
                    int supervisorIdNumeroEmpleado1=(int) row.getCell(0).getNumericCellValue();
                   
                   Cobrador cobrador = new Cobrador(1);
                                             
                   Supervisor supervisor= new Supervisor(1);
                           
                   //Eludidos eludido = new Eludidos(1);
                           
                   Periodostarifas tarifas = new Periodostarifas(1);
                           
                                      
                  // EventoId id = new EventoId(idFolioSistema, 1, 1, 1, 1);
                   
                   //Evento evento = new Evento(id, cobrador, eludido, tarifas, supervisor);
                   
                  
        SessionFactory sessionf = NewHibernateUtil.getSessionFactory();
        Session session;
        session=sessionf.openSession();
        Transaction tx = session.beginTransaction();
        
       // session.save(cobrador);
      //  session.save(supervisor);
       // session.save(eludido);
       // session.save(tarifas);
        session.save(evento);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Insertado Correctamente");
 */           
}
SessionFactory sessionf = NewHibernateUtil.getSessionFactory();
Session session;
public void AlmacenarCobradores() throws IOException{
     File myFile = new File("C:\\Users\\Mario Arellano\\Documents\\NetBeansProjects\\ReportesAutopista\\Cobradores.xlsx");    
     FileInputStream fis = new FileInputStream(myFile);
     XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
     XSSFSheet mySheet = myWorkBook.getSheetAt(0);
     Iterator<Row> rowIterator = mySheet.iterator();
     Row row ;
     Cobrador cobrador;
while (rowIterator.hasNext()) { 
        row = rowIterator.next();
        int NumeroEmpleado = (int) row.getCell(0).getNumericCellValue();
        String nombre = row.getCell(1).getStringCellValue();
        
        
        /*session=sessionf.openSession();
        
         cobrador = new Cobrador(NumeroEmpleado, nombre);
     
        Transaction tx = session.beginTransaction();
        session.save(cobrador);
        tx.commit();               
        session.close();*/
       
     }
    myWorkBook.close();
    fis.close();
  
    System.out.println("Ciclo terminado");  
}

}
