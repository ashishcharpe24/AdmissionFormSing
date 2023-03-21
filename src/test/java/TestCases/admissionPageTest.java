package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.PreReq;
import Pages.admissionPage;

public class admissionPageTest extends PreReq {

	admissionPage af;
	@BeforeMethod
	
	public void preReq() throws IOException
	{
		Browserselection();
		af= new admissionPage();
	}
	
	
	
	@Test()
	public void admissionFormTest() throws InterruptedException, IOException
	{
		af.admissionForm();
	}
}
