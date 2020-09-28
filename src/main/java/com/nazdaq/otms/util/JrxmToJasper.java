package com.nazdaq.otms.util;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;


public class JrxmToJasper {
	public static void main(String[] args) throws JRException {
		// TODO Auto-generated method stub
		
        JasperCompileManager.compileReportToFile(
        		"F:\\git-workspace\\hrms-tms\\dcimch-otms\\src\\main\\resources\\overtime_details_report.jrxml", 
        		"F:\\overtime_details_report.jasper");
     }

}
