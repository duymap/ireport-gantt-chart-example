import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class App{
	
    public static void main( String[] args ) {
        JasperPrint jasperPrint;
        try {       	
			String sourceFileName = "ganttchart.jasper";
			DataBeanFactory list = new DataBeanFactory();
		    ArrayList<TaskBean> dataList = list.getBeanList();
			JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(dataList);
			
			Map parameters = new HashMap();
        	jasperPrint = JasperFillManager.fillReport( sourceFileName,parameters, beanColDataSource);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "ganttchart.pdf");
        }
        catch(Exception e){
        	e.printStackTrace();
        }
        System.out.println( "Complete!" );
    }
}