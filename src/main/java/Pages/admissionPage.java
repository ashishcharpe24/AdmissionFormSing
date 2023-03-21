package Pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import Base.PreReq;

public class admissionPage extends PreReq {

	//Page1
	@FindBy(xpath = "//select[@name='Country']")private WebElement country;
	@FindBy(xpath = "//select[@name='Campus']")private WebElement Campus;
	@FindBy(xpath = "//select[@name='AdmissionFor']")private WebElement AdmissionFor;
	@FindBy(xpath = "//input[@name='FatherFirstName']")private WebElement firstName;
	@FindBy(xpath = "//input[@name='FatherLastName']")private WebElement lastName;
	@FindBy(xpath = "//input[@name='FatherEmailAddress']")private WebElement eMail;
	@FindBy(xpath = "//input[@name='FatherhMobileNumber']")private WebElement mobNum ;
	@FindBy(xpath = "//input[@value='Father']")private WebElement fatherRadBtn;
	@FindBy(xpath = "//input[@value='Mother']")private WebElement motherRadBtn;
	@FindBy(xpath = "//button[@id='SaveAndContinueButtonPageOne']")private WebElement saveAndContBtn;
	
	//Page2
	@FindBy(xpath = "(//i[@class='glyphicon glyphicon-calendar'])[1]")private WebElement calendarBtn;
	@FindBy(xpath = "//strong[@class='ng-binding']")private WebElement currDate;
	@FindBy(xpath = "//select[@name='FatherIdentification']")private WebElement fatherID;
	@FindBy(xpath = "//input[@id='FatherIdentificationNumber']")private WebElement fatherIDNum;
	@FindBy(xpath = "//select[@name='FatherEducation']")private WebElement fatherEducation;
	@FindBy(xpath = "//select[@name='FatherAnnualIncome']")private WebElement fatherAnnualIncm;
	@FindBy(xpath = "//input[@id='FatherEmployerName']")private WebElement fatherEmployerName;
	@FindBy(xpath = "//input[@id='FthExp']")private WebElement fatherExp;
	@FindBy(xpath = "//select[@name='FatherCurrentPosition']")private WebElement FatherCurrentPosition;
	@FindBy(xpath = "//select[@name='FatherMartialStatus']")private WebElement fatherMaritalStatus;
	@FindBy(xpath = "//input[@name='FatherhHomeNumber']")private WebElement fatherhHomeNumber;
	@FindBy(xpath = "//select[@name='FthSocioEconomic']")private WebElement fatherthSocioEconomic;
	@FindBy(xpath = "(//a[text()='Upload Photograph'])[1]")private WebElement fatherPhotoUpload;
	@FindBy(xpath = "//input[@id='UploadPhotoModal']")private WebElement chooseFileBtn;
	@FindBy(xpath = "//button[@class='btn btn-primary ng-pristine ng-untouched ng-valid ng-empty']")private WebElement uploadBtn;
	@FindBy(xpath = "(//i[@class='glyphicon glyphicon-calendar'])[2]")private WebElement motherDOBCalBtn;
	@FindBy(xpath = "//select[@name='FatherNationality']")private WebElement fatherNationality;
	@FindBy(xpath = "//select[@name='MotherNationality']")private WebElement motherNationality;
	@FindBy(xpath = "//select[@name='MotherIdentification']")private WebElement motherID;
	@FindBy(xpath = "//select[@name='MotherEducation']")private WebElement motherEducation;
	@FindBy(xpath = "//input[@name='MotherIdentificationNumber']")private WebElement MotherIdentificationNumber;
	@FindBy(xpath = "//select[@name='MotherAnnualIncome']")private WebElement motherAnnualIncome;
	@FindBy(xpath = "//input[@id='MotherEmployerName']")private WebElement motherEmployerName;
	@FindBy(xpath = "//input[@id='MthExp']")private WebElement mthExp;
	@FindBy(xpath = "//select[@name='MotherCurrentPosition']")private WebElement motherCurrentPosition;
	@FindBy(xpath = "//select[@name='MotherMartialStatus']")private WebElement motherMaritalStatus;
	@FindBy(xpath = "//input[@name='MotherEmailAddress']")private WebElement motherEmail;
	@FindBy(xpath = "//input[@name='MotherhMobileNumber']")private WebElement motherMobileNum;
	@FindBy(xpath = "//input[@name='MotherhHomeNumber']")private WebElement motherHomeNum;
	@FindBy(xpath = "//select[@name='MthSocioEconomic']")private WebElement motherSocioEcnm;
	@FindBy(xpath = "(//a[text()='Upload Photograph'])[2]")private WebElement motherPhotoUpload;
	@FindBy(xpath = "//input[@id='UploadPhotoModal']")private WebElement chooseFileMotherBtn;
	@FindBy(xpath = "//button[@class='btn btn-primary ng-pristine ng-valid ng-not-empty ng-touched']")private WebElement uploadMBtn;
	@FindBy(xpath = "(//button[normalize-space(text())='Save & Continue'])[3]")private WebElement saveAndContMBtn;
	@FindBy(xpath = "//input[@name='MotherFirstName']")private WebElement motherFirstName;
	@FindBy(xpath = "//input[@name='MotherLastName']")private WebElement motherLastName;
	
	
	//Page3
	@FindBy(xpath = "//input[@id='FirstName']")private WebElement studentFirstName;
	@FindBy(xpath = "//input[@id='LastName']")private WebElement studentLastName;
	@FindBy(xpath = "(//i[@class='glyphicon glyphicon-calendar'])[3]")private WebElement calendarBtnStudent;
	@FindBy(xpath = "//input[@value='Male']")private WebElement genderMaleStudent;
	@FindBy(xpath = "//input[@value='Female']")private WebElement genderFemaleStudent;
	@FindBy(xpath = "//input[@name='PhoneNumber']")private WebElement phoneNumStudent;
	@FindBy(xpath = "//select[@name='Identification']")private WebElement studentIDType;
	@FindBy(xpath = "//input[@name='IdentificationNumber']")private WebElement studentIdNum;
	@FindBy(xpath = "//select[@name='Nationality']")private WebElement studentNationality;
	@FindBy(xpath = "//input[@name='StudBithPlace']")private WebElement studentBirthPlace;
	@FindBy(xpath = "//select[@name='CountryofBirth']")private WebElement studentBirthCountry;
	@FindBy(xpath = "//select[@name='ClassStuding']")private WebElement studentSeekingAdmInClss;
	@FindBy(xpath = "//select[@name='Class']")private WebElement currentClass;
	@FindBy(xpath = "//input[@name='PresentSchoolName']")private WebElement presentSchoolName;
	@FindBy(xpath = "//input[@name='PresentSchoolCity']")private WebElement presentSchoolCity;
	@FindBy(xpath = "//select[@name='PresentSchoolCountry']")private WebElement presentSchoolCountry;
	@FindBy(xpath = "//select[@name='BloodGroup']")private WebElement bloodGroup;
	@FindBy(xpath = "(//i[@class='glyphicon glyphicon-calendar'])[4]")private WebElement schoolAttendinDateCalBtn;
	@FindBy(xpath = "//select[@name='MotherTongue']")private WebElement motherTongue;
	@FindBy(xpath = "//select[@name='StudRaceId']")private WebElement studRaceId;
	@FindBy(xpath = "//a[@id='AncStudentPhotograph']")private WebElement studentPhoto;
	@FindBy(xpath="//input[@id='UploadPhotoModal']")private WebElement chooseFileStudentBtn;
	@FindBy(xpath = "//button[normalize-space(text())='Upload']")private WebElement studentPhotoUploadBtn;
	@FindBy(xpath = "//select[@name='SecondLang']")private WebElement secondLang;
	@FindBy(xpath = "//select[@name='ThirdLang']")private WebElement thirdLang;
	
	
	@FindBy(xpath = "//select[@name='ResidentialStatus']")private WebElement residentialStatus;
	@FindBy(xpath = "//input[@name='Block']")private WebElement block;
	@FindBy(xpath = "//input[@name='AddressLine1']")private WebElement addressline1;
	@FindBy(xpath = "//input[@name='AddressLine2']")private WebElement addressline2;
	@FindBy(xpath = "//input[@name='City']")private WebElement city;
	@FindBy(xpath = "//select[@name='CurrentHomeCountry']")private WebElement currenthomeCountry;
	@FindBy(xpath = "//input[@name='PostalCode']")private WebElement postalCode;
	@FindBy(xpath = "(//button[normalize-space(text())='Save & Continue'])[5]")private WebElement saveAndContinueBtn;
	//Page4
	@FindBy(xpath = "//button[normalize-space(text())='Submit']")private WebElement submitBtn;
	
	public admissionPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void admissionForm() throws InterruptedException, IOException
	{
		String str = Readpropertyfile("NumberOfStudents");
		int s = 0;
		try{
			  s = Integer.parseInt(str);
		}
		catch (NumberFormatException ex){
			ex.printStackTrace();
		}
		
		for(int i=1;i<=s;i++)
		{
			if(i==1)
			{
				
		Thread.sleep(5000);
		Select conSel = new Select(country);
		//conSel.selectByVisibleText("Singapore");
		conSel.selectByVisibleText(Readpropertyfile("Country"));
		Thread.sleep(500);
		Select camSel = new Select(Campus);
		//camSel.selectByVisibleText("East Coast");
		camSel.selectByVisibleText(Readpropertyfile("Campus"));
		Thread.sleep(500);
		Select admSel = new Select(AdmissionFor);
		admSel.selectByVisibleText("2022-2023");
		Thread.sleep(500);
		firstName.sendKeys(readExcelFile(i, 0));
		Thread.sleep(500);
		lastName.sendKeys(readExcelFile(i, 1));
		Thread.sleep(500);
		eMail.sendKeys(readExcelFile(i, 2));
		Thread.sleep(500);
		mobNum.sendKeys(readExcelFile(i, 3));
		Thread.sleep(500);
		String parent=readExcelFile(i, 4);
		Thread.sleep(500);
		if(parent.equalsIgnoreCase("Father"))
		{
			fatherRadBtn.click();
		}
		else if(parent.equalsIgnoreCase("Mother"))
		{
			motherRadBtn.click();
		}
		
		Thread.sleep(500);
		saveAndContBtn.click();
		Thread.sleep(10000);
	
		
		//Page 2
		
		calendarBtn.click();
		Thread.sleep(500);
		String dateOfBirthFather = readExcelFile(i, 5);
		Thread.sleep(500);
		String[] dateSplit =  dateOfBirthFather.split("-");
		Thread.sleep(500);
		String date = dateSplit[0];
		Thread.sleep(1000);
		String monthAndYear = (dateSplit[1]+" "+dateSplit[2]);
		//System.out.println(monthAndYear);
		Thread.sleep(1000);
		String actualMonthAndYear = currDate.getText();
		//System.out.println(actualMonthAndYear);
		Thread.sleep(1000);
		while(!monthAndYear.equals(actualMonthAndYear))
		{
			System.out.println("while loop");
			driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-chevron-left']")).click();
			Thread.sleep(500);
			actualMonthAndYear=currDate.getText();
			Thread.sleep(500);
		}
		
		WebElement expDate=driver.findElement(By.xpath("//button//span[@class='ng-binding' and text()='"+date+"']"));
		 expDate.click();
		 Thread.sleep(500);
		 
		 Select selNationality = new Select(fatherNationality);
		 selNationality.selectByVisibleText(readExcelFile(i, 6));
		 
		 Select selID = new Select(fatherID);
		 selID.selectByVisibleText(readExcelFile(i, 7));
		 Thread.sleep(500);
		 fatherIDNum.sendKeys(readExcelFile(i, 8));
		 Thread.sleep(500);
		 Select selEdu = new Select(fatherEducation);
		 selEdu.selectByVisibleText("B.Tech");
		 Thread.sleep(500);
		 Select selAnualInc = new Select(fatherAnnualIncm);
		// selAnualInc.selectByVisibleText("80k-140k(SGD)");
		 selAnualInc.selectByIndex(2);
		 Thread.sleep(500);
		 fatherEmployerName.sendKeys(readExcelFile(i, 9));
		 Thread.sleep(500);
		 fatherExp.sendKeys("4");
		 Thread.sleep(500);
		 Select selcurrPosition = new Select(FatherCurrentPosition);
		 selcurrPosition.selectByVisibleText("Technical Consultant");
		 Thread.sleep(500);
		 Select selmaritalStatus = new Select(fatherMaritalStatus);
		 selmaritalStatus.selectByVisibleText("Married");
		 Thread.sleep(500);
		 fatherhHomeNumber.sendKeys(readExcelFile(i, 10));
		 Thread.sleep(500);
		 Select selsocioEco = new Select(fatherthSocioEconomic);
		 selsocioEco.selectByVisibleText("Graduate-Service");
		 Thread.sleep(500);
		 fatherPhotoUpload.click();
		 Thread.sleep(500);
		 chooseFileBtn.sendKeys(readExcelFile(i, 11));
		 Thread.sleep(5000);
		 uploadBtn.click();
		 Thread.sleep(5000);
		 
		 
		 //Mother Details
		 motherFirstName.sendKeys(readExcelFile(i, 12));
		 Thread.sleep(500);
		 motherLastName.sendKeys(readExcelFile(i, 13));
		 Thread.sleep(500);
		 motherDOBCalBtn.click();
		 Thread.sleep(500);
		 String dateOfBirthMother = readExcelFile(i, 14);
			Thread.sleep(500);
			String[] dateSplitMother =  dateOfBirthMother.split("-");
			Thread.sleep(500);
			String dateMother = dateSplitMother[0];
			Thread.sleep(1000);
			String monthAndYearMother = (dateSplitMother[1]+" "+dateSplitMother[2]);
			//System.out.println(monthAndYear);
			Thread.sleep(1000);
			String actualMonthAndYearMother = currDate.getText();
			//System.out.println(actualMonthAndYear);
			Thread.sleep(1000);
			while(!monthAndYearMother.equals(actualMonthAndYearMother))
			{
				
				driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-chevron-left']")).click();
				Thread.sleep(1000);
				actualMonthAndYearMother=currDate.getText();
				Thread.sleep(1000);
			}
			
			WebElement expDateMother=driver.findElement(By.xpath("//button//span[@class='ng-binding' and text()='"+dateMother+"']"));
			expDateMother.click();
			Thread.sleep(500);
			
			 Select selNationalityMother = new Select(motherNationality);
			 selNationalityMother.selectByVisibleText(readExcelFile(i, 15));
			 Thread.sleep(500);
			 
			 Select selIdMother = new Select(motherID);
			 selIdMother.selectByVisibleText(readExcelFile(i, 16));
			 Thread.sleep(500);
			 
			 MotherIdentificationNumber.sendKeys(readExcelFile(i, 17));
			 
			 Select selEduMother  = new Select(motherEducation);
			 selEduMother .selectByVisibleText("B.Tech");
			 Thread.sleep(500);
			 
			 Select selAnualIncMother  = new Select(motherAnnualIncome);
//			 selAnualIncMother .selectByVisibleText("80k-140k(SGD)");
			 selAnualIncMother.selectByIndex(2);
			 Thread.sleep(500);
			 
			 motherEmployerName.sendKeys(readExcelFile(i, 18));
			 Thread.sleep(500);
			 
			 mthExp.sendKeys("2");
			 Thread.sleep(500);
			 
			 Select selcurrPositionMother  = new Select(motherCurrentPosition);
			 selcurrPositionMother .selectByVisibleText("Consultant");
			 Thread.sleep(500);
			 
			 Select selmaritalStatusMother = new Select(motherMaritalStatus);
			 selmaritalStatusMother.selectByVisibleText("Married");
			 Thread.sleep(500);
			 
			 motherEmail.sendKeys(readExcelFile(i, 19));
			 Thread.sleep(500);
			 
			 motherMobileNum.sendKeys(readExcelFile(i, 20));
			 Thread.sleep(500);
			 
			 motherHomeNum.sendKeys(readExcelFile(i, 21));
			 Thread.sleep(500);
			 
			 Select selSocioEcnmMother = new Select(motherSocioEcnm);
			 selSocioEcnmMother.selectByVisibleText("Graduate-Service");
			 Thread.sleep(500);
			 
			 motherPhotoUpload.click();
			 Thread.sleep(500);
			 chooseFileMotherBtn.sendKeys(readExcelFile(i, 22));
			 Thread.sleep(500);
			 uploadMBtn.click();
			 Thread.sleep(3000);
			 saveAndContMBtn.click();
			 Thread.sleep(5000);
			 
			
			 // Page3 Student Info 
			 
			 studentFirstName.sendKeys(readExcelFile(i, 23));
			 Thread.sleep(500);
			 studentLastName.sendKeys(readExcelFile(i, 24));
			 Thread.sleep(500);
			 calendarBtnStudent.click();
			 Thread.sleep(500);
			 String dateOfBirthStudent = readExcelFile(i, 25);
			 Thread.sleep(500);
			 String[] dateSplitStudent =  dateOfBirthStudent.split("-");
			 Thread.sleep(500);
			 String dateStudent = dateSplitStudent[0];
			 Thread.sleep(1000);
			 String monthAndYearStudent = (dateSplitStudent[1]+" "+dateSplitStudent[2]);
			 //System.out.println(monthAndYear);
			 Thread.sleep(1000);
			 String actualMonthAndYearStudent = currDate.getText();
			 //System.out.println(actualMonthAndYear);
			 Thread.sleep(1000);
			 while(!monthAndYearStudent.equals(actualMonthAndYearStudent))
			 {

				 driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-chevron-left']")).click();
				 Thread.sleep(1000);
				 actualMonthAndYearStudent=currDate.getText();
				 Thread.sleep(1000);
			 }

			 WebElement expDateStudent=driver.findElement(By.xpath("//button//span[@class='ng-binding' and text()='"+dateStudent+"']"));
			 expDateStudent.click();
			 Thread.sleep(500);

			 String gender=readExcelFile(i, 26);
			 if(gender.equalsIgnoreCase("Male"))
			 {
				 genderMaleStudent.click();
			 }
			 else if(gender.equalsIgnoreCase("Female"))
			 {
				 genderFemaleStudent.click();
			 }

			 phoneNumStudent.sendKeys(readExcelFile(i, 27));
			 Thread.sleep(500);

			 Select selStudID = new Select(studentIDType);
			 selStudID.selectByVisibleText(readExcelFile(i, 28));
			 Thread.sleep(500);

			 studentIdNum.sendKeys(readExcelFile(i, 29));
			 Thread.sleep(500);

			 Select selStudNationality = new Select(studentNationality);
			 selStudNationality.selectByVisibleText(readExcelFile(i, 30));
			 Thread.sleep(500);

			 studentBirthPlace.sendKeys(readExcelFile(i, 31));
			 Thread.sleep(500);

			 Select selStudBirthCountry = new Select(studentBirthCountry);
			 selStudBirthCountry.selectByVisibleText(readExcelFile(i, 32));
			 Thread.sleep(500);

			 Select selstudSeekingAdmiss = new Select(studentSeekingAdmInClss);
			 //				//selstudSeekingAdmiss.selectByVisibleText(adf.readProprtyFile("ClassToTakeAdmissionIn"));
			 selstudSeekingAdmiss.selectByVisibleText(readExcelFile(i, 33));
			 Thread.sleep(500);

			 Select selstudCurrClass = new Select(currentClass);
			 selstudCurrClass.selectByVisibleText(readExcelFile(i, 34));
			 Thread.sleep(500);

			 presentSchoolName.sendKeys("Pre School");
			 Thread.sleep(500);

			 presentSchoolCity.sendKeys(readExcelFile(i,42));
			 Thread.sleep(500);

			 presentSchoolCountry.sendKeys(readExcelFile(i,43));
			 Thread.sleep(500);

			 Select selstudCurrentSchoolCountry = new Select(presentSchoolCountry);
			 selstudCurrentSchoolCountry.selectByVisibleText(readExcelFile(i,43));
			 Thread.sleep(500);

			 Select selstudBloodGrp = new Select(bloodGroup);
			 selstudBloodGrp.selectByVisibleText("B+");
			 Thread.sleep(500);

			 schoolAttendinDateCalBtn.click();
			 String schoolAttendingDateExcel = readExcelFile(i, 36);
			 Thread.sleep(500);
			 String[] schoolAttendingDate =  schoolAttendingDateExcel.split("-");
			 Thread.sleep(500);
			 String dateSchoolAttending = schoolAttendingDate[0];
			 Thread.sleep(1000);
			 String monthAndYearSchoolAttending = (schoolAttendingDate[1]+" "+schoolAttendingDate[2]);
			 //System.out.println(monthAndYear);
			 Thread.sleep(1000);
			 String actualMonthAndYearSchoolAttending = currDate.getText();
			 //System.out.println(actualMonthAndYear);
			 Thread.sleep(1000);
			 while(!monthAndYearSchoolAttending.equals(actualMonthAndYearSchoolAttending))
			 {

				 driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-chevron-right']")).click();
				 Thread.sleep(1000);
				 actualMonthAndYear=currDate.getText();
				 Thread.sleep(1000);
			 }

			 WebElement expSchoolAttendingDate=driver.findElement(By.xpath("//button//span[@class='ng-binding' and text()='"+dateSchoolAttending+"']"));
			 expSchoolAttendingDate.click();
			 Thread.sleep(500);

			 Select selstudMotherTongue = new Select(motherTongue);
			 selstudMotherTongue.selectByVisibleText(readExcelFile(i,38));
			 Thread.sleep(500);

			 Select selstudRaceId = new Select(studRaceId);
			 selstudRaceId.selectByVisibleText(readExcelFile(i,30));
			 Thread.sleep(500);

			 studentPhoto.click();
			 Thread.sleep(500);
			 chooseFileStudentBtn.sendKeys(readExcelFile(i, 36));
			 Thread.sleep(500);
			 studentPhotoUploadBtn.click();
			 Thread.sleep(5000);

			 Select selSecondLang = new Select(secondLang);
			 selSecondLang.selectByVisibleText(readExcelFile(i,45));
			 Thread.sleep(500);

			 Select selThirdLang = new Select(thirdLang);
			 selThirdLang.selectByVisibleText(readExcelFile(i,46));
			 Thread.sleep(500);















			 //Address 

			 Select selstudResidentStatus= new Select(residentialStatus);
			 selstudResidentStatus.selectByVisibleText(readExcelFile(s, 38));
			 Thread.sleep(500);

			 block.sendKeys(readExcelFile(i, 39));
			 Thread.sleep(500);

			 addressline1.sendKeys(readExcelFile(i, 40));
			 Thread.sleep(500);

			 addressline2.sendKeys(readExcelFile(i, 41));
			 Thread.sleep(500);

			 city.sendKeys(readExcelFile(i, 42));
			 Thread.sleep(500);

			 Select selResidentialStatus= new Select(currenthomeCountry);
			 selResidentialStatus.selectByVisibleText(readExcelFile(s, 43));
			 Thread.sleep(500);

			 postalCode.sendKeys(readExcelFile(i, 44));
			 Thread.sleep(500);

			 String studentStayWithParent = "Yes";
			 if(studentStayWithParent.equalsIgnoreCase("Yes"))
			 {
				 driver.findElement(By.xpath("(//input[@name='StudentStayWithParent'])[1]")).click();
			 }
			 else
			 {
				 driver.findElement(By.xpath("(//input[@name='StudentStayWithParent'])[2]")).click();
			 }

			 Thread.sleep(500);

			 driver.findElement(By.xpath("//input[@name='SibName']")).sendKeys("TestSibTestZZZ");
			 //				
			 driver.findElement(By.xpath("(//i[@class='glyphicon glyphicon-calendar'])[5]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//button[text()='Today']")).click();
			 driver.findElement(By.xpath("//input[@name='SibPrestSchlName']")).sendKeys("SiblingPresentSchool");
			 Thread.sleep(500);

			 saveAndContinueBtn.click();
			 Thread.sleep(5000);


			 // Page4

			 Thread.sleep(15000);
			 WebElement medicalConditionNo = driver.findElement(By.xpath("//input[@name='OptionSelected_1'][2]"));
			 medicalConditionNo.click();


			 WebElement hearingSpeechNo = driver.findElement(By.xpath("//input[@name='OptionSelected_2'][2]"));
			 hearingSpeechNo.click();


			 WebElement specialNeedNo = driver.findElement(By.xpath("//input[@name='OptionSelected_3'][2]"));
			 specialNeedNo.click();

			 WebElement behaviouralDiffNo = driver.findElement(By.xpath("//input[@name='OptionSelected_4'][2]"));
			 behaviouralDiffNo.click();


			 WebElement anyOtherNo = driver.findElement(By.xpath("//input[@name='OptionSelected_5'][2]"));
			 anyOtherNo.click();

			 String pickUp = "Bus";//

			 if(pickUp.equalsIgnoreCase("Bus"))
			 {
				 driver.findElement(By.xpath("//input[@value='School Bus']")).click();
			 }
			 else if(pickUp.equalsIgnoreCase("Mother"))
			 {
				 driver.findElement(By.xpath("//input[@value='Mother']")).click();
			 }
			 else if(pickUp.equalsIgnoreCase("Father"))
			 {
				 driver.findElement(By.xpath("//input[@value='Father']")).click();
			 }
			 else if(pickUp.equalsIgnoreCase("Another Individual"))
			 {
				 driver.findElement(By.xpath("//input[@value='Another Individual']")).click();
			 }

			 Thread.sleep(500);
			 //to upload passport
			 driver.findElement(By.xpath("//a[text()='Upload Document'][1]")).click();
			 driver.findElement(By.xpath("//input[@name='UploadPhotoModal']")).sendKeys("C:\\Users\\acharpe\\Downloads\\img1.jpg");
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//button[normalize-space(text())='Upload']")).click();
			 Thread.sleep(10000);
			 //				
			 //				// to upload NRIC
			 //				
			 driver.findElement(By.xpath("(//a[text()='Upload Document'])[2]")).click();
			 driver.findElement(By.xpath("//input[@name='UploadPhotoModal']")).sendKeys("C:\\Users\\acharpe\\Downloads\\img1.jpg");
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//button[normalize-space(text())='Upload']")).click();
			 Thread.sleep(10000);
			 //				//to upload immunization 
			 //					

			 driver.findElement(By.xpath("(//a[text()='Upload Document'])[3]")).click();
			 driver.findElement(By.xpath("//input[@name='UploadPhotoModal']")).sendKeys("C:\\Users\\acharpe\\Downloads\\img1.jpg");
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//button[normalize-space(text())='Upload']")).click();
			 Thread.sleep(10000);

			 //								// to upload TC
			 driver.findElement(By.xpath("(//a[text()='Upload Document'])[4]")).click();
			 driver.findElement(By.xpath("//input[@name='UploadPhotoModal']")).sendKeys("C:\\Users\\acharpe\\Downloads\\img1.jpg");
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//button[normalize-space(text())='Upload']")).click();
			 Thread.sleep(10000);

			 //								
			 //								// to upload Ms
			 driver.findElement(By.xpath("(//a[text()='Upload Document'])[5]")).click();
			 driver.findElement(By.xpath("//input[@name='UploadPhotoModal']")).sendKeys("C:\\Users\\acharpe\\Downloads\\img1.jpg");
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//button[normalize-space(text())='Upload']")).click();
			 Thread.sleep(5000);

			 //								
			 //								// to upload MR
			 driver.findElement(By.xpath("(//a[text()='Upload Document'])[6]")).click();
			 driver.findElement(By.xpath("//input[@name='UploadPhotoModal']")).sendKeys("C:\\Users\\acharpe\\Downloads\\img1.jpg");
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//button[normalize-space(text())='Upload']")).click();
			 Thread.sleep(5000);
			 //								
			 //								// to upload other
			 driver.findElement(By.xpath("(//a[text()='Upload Document'])[7]")).click();
			 driver.findElement(By.xpath("//input[@name='UploadPhotoModal']")).sendKeys("C:\\Users\\acharpe\\Downloads\\img1.jpg");
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//button[normalize-space(text())='Upload']")).click();
			 Thread.sleep(5000);

			 String satisfactionNum = "4";

			 if(satisfactionNum.equals("1"))
			 {
				 driver.findElement(By.xpath("(//input[@name='SatisfactionLevel'])[1]")).click();
			 }
			 else if(satisfactionNum.equals("2"))
			 {
				 driver.findElement(By.xpath("(//input[@name='SatisfactionLevel'])[2]")).click();
			 }
			 else if(satisfactionNum.equals("3"))
			 {
				 driver.findElement(By.xpath("(//input[@name='SatisfactionLevel'])[3]")).click();
			 }
			 else if(satisfactionNum.equals("4"))
			 {
				 driver.findElement(By.xpath("(//input[@name='SatisfactionLevel'])[4]")).click();
			 }
			 else if(satisfactionNum.equals("5"))
			 {
				 driver.findElement(By.xpath("(//input[@name='SatisfactionLevel'])[5]")).click();
			 }
			 //								 
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//input[@name='AdditionalFeedback']")).sendKeys("Additional feedback test");
			 Thread.sleep(500);
			 submitBtn.click();

			}
			else
			{
				Thread.sleep(5000);
				driver.get(Readpropertyfile("URL"));
				Thread.sleep(5000);
				Select conSel = new Select(country);
				conSel.selectByVisibleText("Singapore");
				Thread.sleep(500);
				Select camSel = new Select(Campus);
				camSel.selectByVisibleText("East Coast");
				Thread.sleep(500);
				Select admSel = new Select(AdmissionFor);
				admSel.selectByVisibleText("2022-2023");
				Thread.sleep(500);
				firstName.sendKeys(readExcelFile(i, 0));
				Thread.sleep(500);
				lastName.sendKeys(readExcelFile(i, 1));
				Thread.sleep(500);
				eMail.sendKeys(readExcelFile(i, 2));
				Thread.sleep(500);
				mobNum.sendKeys(readExcelFile(i, 3));
				Thread.sleep(500);
				String parent=readExcelFile(i, 4);
				Thread.sleep(500);
				if(parent.equalsIgnoreCase("Father"))
				{
					fatherRadBtn.click();
				}
				else if(parent.equalsIgnoreCase("Mother"))
				{
					motherRadBtn.click();
				}

				Thread.sleep(500);
				saveAndContBtn.click();
				Thread.sleep(10000);


				//Page 2

				calendarBtn.click();
				Thread.sleep(500);
				String dateOfBirthFather = readExcelFile(i, 5);
				Thread.sleep(500);
				String[] dateSplit =  dateOfBirthFather.split("-");
				Thread.sleep(500);
				String date = dateSplit[0];
				Thread.sleep(1000);
				String monthAndYear = (dateSplit[1]+" "+dateSplit[2]);
				//System.out.println(monthAndYear);
				Thread.sleep(1000);
				String actualMonthAndYear = currDate.getText();
				//System.out.println(actualMonthAndYear);
				Thread.sleep(1000);
				while(!monthAndYear.equals(actualMonthAndYear))
				{
					System.out.println("while loop");
					driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-chevron-left']")).click();
					Thread.sleep(500);
					actualMonthAndYear=currDate.getText();
					Thread.sleep(500);
				}

				WebElement expDate=driver.findElement(By.xpath("//button//span[@class='ng-binding' and text()='"+date+"']"));
				expDate.click();
				Thread.sleep(500);

				Select selNationality = new Select(fatherNationality);
				selNationality.selectByVisibleText(readExcelFile(i, 6));

				Select selID = new Select(fatherID);
				selID.selectByVisibleText(readExcelFile(i, 7));
				Thread.sleep(500);
				fatherIDNum.sendKeys(readExcelFile(i, 8));
				Thread.sleep(500);
				Select selEdu = new Select(fatherEducation);
				selEdu.selectByVisibleText("B.Tech");
				Thread.sleep(500);
				Select selAnualInc = new Select(fatherAnnualIncm);
				selAnualInc.selectByVisibleText("80k-140k(SGD)");
				Thread.sleep(500);
				fatherEmployerName.sendKeys(readExcelFile(i, 9));
				Thread.sleep(500);
				fatherExp.sendKeys("4");
				Thread.sleep(500);
				Select selcurrPosition = new Select(FatherCurrentPosition);
				selcurrPosition.selectByVisibleText("Technical Consultant");
				Thread.sleep(500);
				Select selmaritalStatus = new Select(fatherMaritalStatus);
				selmaritalStatus.selectByVisibleText("Married");
				Thread.sleep(500);
				fatherhHomeNumber.sendKeys(readExcelFile(i, 10));
				Thread.sleep(500);
				Select selsocioEco = new Select(fatherthSocioEconomic);
				selsocioEco.selectByVisibleText("Graduate-Service");
				Thread.sleep(500);
				fatherPhotoUpload.click();
				Thread.sleep(500);
				chooseFileBtn.sendKeys(readExcelFile(i, 11));
				Thread.sleep(5000);
				uploadBtn.click();
				Thread.sleep(5000);


				//Mother Details
				motherFirstName.sendKeys(readExcelFile(i, 12));
				Thread.sleep(500);
				motherLastName.sendKeys(readExcelFile(i, 13));
				Thread.sleep(500);
				motherDOBCalBtn.click();
				Thread.sleep(500);
				String dateOfBirthMother = readExcelFile(i, 14);
				Thread.sleep(500);
				String[] dateSplitMother =  dateOfBirthMother.split("-");
				Thread.sleep(500);
				String dateMother = dateSplitMother[0];
				Thread.sleep(1000);
				String monthAndYearMother = (dateSplitMother[1]+" "+dateSplitMother[2]);
				//System.out.println(monthAndYear);
				Thread.sleep(1000);
				String actualMonthAndYearMother = currDate.getText();
				//System.out.println(actualMonthAndYear);
				Thread.sleep(1000);
				while(!monthAndYearMother.equals(actualMonthAndYearMother))
				{

					driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-chevron-left']")).click();
					Thread.sleep(1000);
					actualMonthAndYearMother=currDate.getText();
					Thread.sleep(1000);
				}

				WebElement expDateMother=driver.findElement(By.xpath("//button//span[@class='ng-binding' and text()='"+dateMother+"']"));
				expDateMother.click();
				Thread.sleep(500);

				Select selNationalityMother = new Select(motherNationality);
				selNationalityMother.selectByVisibleText(readExcelFile(i, 15));
				Thread.sleep(500);

				Select selIdMother = new Select(motherID);
				selIdMother.selectByVisibleText(readExcelFile(i, 16));
				Thread.sleep(500);

				MotherIdentificationNumber.sendKeys(readExcelFile(i, 17));

				Select selEduMother  = new Select(motherEducation);
				selEduMother .selectByVisibleText("B.Tech");
				Thread.sleep(500);

				Select selAnualIncMother  = new Select(motherAnnualIncome);
				selAnualIncMother .selectByVisibleText("80k-140k(SGD)");
				Thread.sleep(500);

				motherEmployerName.sendKeys(readExcelFile(i, 18));
				Thread.sleep(500);

				mthExp.sendKeys("2");
				Thread.sleep(500);

				Select selcurrPositionMother  = new Select(motherCurrentPosition);
				selcurrPositionMother .selectByVisibleText("Consultant");
				Thread.sleep(500);

				Select selmaritalStatusMother = new Select(motherMaritalStatus);
				selmaritalStatusMother.selectByVisibleText("Married");
				Thread.sleep(500);

				motherEmail.sendKeys(readExcelFile(i, 19));
				Thread.sleep(500);

				motherMobileNum.sendKeys(readExcelFile(i, 20));
				Thread.sleep(500);

				motherHomeNum.sendKeys(readExcelFile(i, 21));
				Thread.sleep(500);

				Select selSocioEcnmMother = new Select(motherSocioEcnm);
				selSocioEcnmMother.selectByVisibleText("Graduate-Service");
				Thread.sleep(500);

				motherPhotoUpload.click();
				Thread.sleep(500);
				chooseFileMotherBtn.sendKeys(readExcelFile(i, 22));
				Thread.sleep(500);
				uploadMBtn.click();
				Thread.sleep(3000);
				saveAndContMBtn.click();
				Thread.sleep(5000);


				// Page3 Student Info 

				studentFirstName.sendKeys(readExcelFile(i, 23));
				Thread.sleep(500);
				studentLastName.sendKeys(readExcelFile(i, 24));
				Thread.sleep(500);
				calendarBtnStudent.click();
				Thread.sleep(500);
				String dateOfBirthStudent = readExcelFile(i, 25);
				Thread.sleep(500);
				String[] dateSplitStudent =  dateOfBirthStudent.split("-");
				Thread.sleep(500);
				String dateStudent = dateSplitStudent[0];
				Thread.sleep(1000);
				String monthAndYearStudent = (dateSplitStudent[1]+" "+dateSplitStudent[2]);
				//System.out.println(monthAndYear);
				Thread.sleep(1000);
				String actualMonthAndYearStudent = currDate.getText();
				//System.out.println(actualMonthAndYear);
				Thread.sleep(1000);
				while(!monthAndYearStudent.equals(actualMonthAndYearStudent))
				{

					driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-chevron-left']")).click();
					Thread.sleep(1000);
					actualMonthAndYearStudent=currDate.getText();
					Thread.sleep(1000);
				}

				WebElement expDateStudent=driver.findElement(By.xpath("//button//span[@class='ng-binding' and text()='"+dateStudent+"']"));
				expDateStudent.click();
				Thread.sleep(500);

				String gender=readExcelFile(i, 26);
				if(gender.equalsIgnoreCase("Male"))
				{
					genderMaleStudent.click();
				}
				else if(gender.equalsIgnoreCase("Female"))
				{
					genderFemaleStudent.click();
				}

				phoneNumStudent.sendKeys(readExcelFile(i, 27));
				Thread.sleep(500);

				Select selStudID = new Select(studentIDType);
				selStudID.selectByVisibleText(readExcelFile(i, 28));
				Thread.sleep(500);

				studentIdNum.sendKeys(readExcelFile(i, 29));
				Thread.sleep(500);

				Select selStudNationality = new Select(studentNationality);
				selStudNationality.selectByVisibleText(readExcelFile(i, 30));
				Thread.sleep(500);

				studentBirthPlace.sendKeys(readExcelFile(i, 31));
				Thread.sleep(500);

				Select selStudBirthCountry = new Select(studentBirthCountry);
				selStudBirthCountry.selectByVisibleText(readExcelFile(i, 32));
				Thread.sleep(500);

				Select selstudSeekingAdmiss = new Select(studentSeekingAdmInClss);
				//						//selstudSeekingAdmiss.selectByVisibleText(adf.readProprtyFile("ClassToTakeAdmissionIn"));
				selstudSeekingAdmiss.selectByVisibleText(readExcelFile(i, 33));
				Thread.sleep(500);

				Select selstudCurrClass = new Select(currentClass);
				selstudCurrClass.selectByVisibleText(readExcelFile(i, 34));
				Thread.sleep(500);

				presentSchoolName.sendKeys("Pre School");
				Thread.sleep(500);

				presentSchoolCity.sendKeys(readExcelFile(i,42));
				Thread.sleep(500);

				presentSchoolCountry.sendKeys(readExcelFile(i,43));
				Thread.sleep(500);

				Select selstudCurrentSchoolCountry = new Select(presentSchoolCountry);
				selstudCurrentSchoolCountry.selectByVisibleText(readExcelFile(i,43));
				Thread.sleep(500);

				Select selstudBloodGrp = new Select(bloodGroup);
				selstudBloodGrp.selectByVisibleText("B+");
				Thread.sleep(500);

				schoolAttendinDateCalBtn.click();
				String schoolAttendingDateExcel = readExcelFile(i, 36);
				Thread.sleep(500);
				String[] schoolAttendingDate =  schoolAttendingDateExcel.split("-");
				Thread.sleep(500);
				String dateSchoolAttending = schoolAttendingDate[0];
				Thread.sleep(1000);
				String monthAndYearSchoolAttending = (dateSplitStudent[1]+" "+dateSplitStudent[2]);
				//System.out.println(monthAndYear);
				Thread.sleep(1000);
				String actualMonthAndYearSchoolAttending = currDate.getText();
				//System.out.println(actualMonthAndYear);
				Thread.sleep(1000);
				while(!monthAndYearSchoolAttending.equals(actualMonthAndYearSchoolAttending))
				{

					driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-chevron-right']")).click();
					Thread.sleep(1000);
					actualMonthAndYearSchoolAttending=currDate.getText();
					Thread.sleep(1000);
				}

				WebElement expSchoolAttendingDate=driver.findElement(By.xpath("//button//span[@class='ng-binding' and text()='"+dateSchoolAttending+"']"));
				expSchoolAttendingDate.click();
				Thread.sleep(500);

				Select selstudMotherTongue = new Select(motherTongue);
				selstudMotherTongue.selectByVisibleText(readExcelFile(i,37));
				Thread.sleep(500);

				Select selstudRaceId = new Select(studRaceId);
				selstudRaceId.selectByVisibleText(readExcelFile(i,30));
				Thread.sleep(500);

				studentPhoto.click();
				Thread.sleep(500);
				chooseFileStudentBtn.sendKeys(readExcelFile(i, 35));
				Thread.sleep(500);
				studentPhotoUploadBtn.click();
				Thread.sleep(5000);

				Select selSecondLang = new Select(secondLang);
				selSecondLang.selectByVisibleText(readExcelFile(i,45));
				Thread.sleep(500);

				Select selThirdLang = new Select(thirdLang);
				selThirdLang.selectByVisibleText(readExcelFile(i,46));
				Thread.sleep(500);

				
				//Address 

				Select selstudResidentStatus= new Select(residentialStatus);
				selstudResidentStatus.selectByVisibleText(readExcelFile(s, 38));
				Thread.sleep(500);

				block.sendKeys(readExcelFile(i, 39));
				Thread.sleep(500);

				addressline1.sendKeys(readExcelFile(i, 40));
				Thread.sleep(500);

				addressline2.sendKeys(readExcelFile(i, 41));
				Thread.sleep(500);

				city.sendKeys(readExcelFile(i, 42));
				Thread.sleep(500);

				Select selResidentialStatus= new Select(currenthomeCountry);
				selResidentialStatus.selectByVisibleText(readExcelFile(s, 43));
				Thread.sleep(500);

				postalCode.sendKeys(readExcelFile(i, 44));
				Thread.sleep(500);

				String studentStayWithParent = "Yes";
				if(studentStayWithParent.equalsIgnoreCase("Yes"))
				{
					driver.findElement(By.xpath("(//input[@name='StudentStayWithParent'])[1]")).click();
				}
				else
				{
					driver.findElement(By.xpath("(//input[@name='StudentStayWithParent'])[2]")).click();
				}

				Thread.sleep(500);

				driver.findElement(By.xpath("//input[@name='SibName']")).sendKeys("TestSibTestZZZ");
				//						
				driver.findElement(By.xpath("(//i[@class='glyphicon glyphicon-calendar'])[5]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath("//button[text()='Today']")).click();
				driver.findElement(By.xpath("//input[@name='SibPrestSchlName']")).sendKeys("SiblingPresentSchool");
				Thread.sleep(500);

				saveAndContinueBtn.click();
				Thread.sleep(5000);


				// Page4

				Thread.sleep(15000);
				WebElement medicalConditionNo = driver.findElement(By.xpath("//input[@name='OptionSelected_1'][2]"));
				medicalConditionNo.click();


				WebElement hearingSpeechNo = driver.findElement(By.xpath("//input[@name='OptionSelected_2'][2]"));
				hearingSpeechNo.click();


				WebElement specialNeedNo = driver.findElement(By.xpath("//input[@name='OptionSelected_3'][2]"));
				specialNeedNo.click();

				WebElement behaviouralDiffNo = driver.findElement(By.xpath("//input[@name='OptionSelected_4'][2]"));
				behaviouralDiffNo.click();


				WebElement anyOtherNo = driver.findElement(By.xpath("//input[@name='OptionSelected_5'][2]"));
				anyOtherNo.click();

				String pickUp = "Bus";//

				if(pickUp.equalsIgnoreCase("Bus"))
				{
					driver.findElement(By.xpath("//input[@value='School Bus']")).click();
				}
				else if(pickUp.equalsIgnoreCase("Mother"))
				{
					driver.findElement(By.xpath("//input[@value='Mother']")).click();
				}
				else if(pickUp.equalsIgnoreCase("Father"))
				{
					driver.findElement(By.xpath("//input[@value='Father']")).click();
				}
				else if(pickUp.equalsIgnoreCase("Another Individual"))
				{
					driver.findElement(By.xpath("//input[@value='Another Individual']")).click();
				}

				Thread.sleep(500);
				//to upload passport
				driver.findElement(By.xpath("//a[text()='Upload Document'][1]")).click();
				driver.findElement(By.xpath("//input[@name='UploadPhotoModal']")).sendKeys("C:\\Users\\acharpe\\Downloads\\img1.jpg");
				Thread.sleep(500);
				driver.findElement(By.xpath("//button[normalize-space(text())='Upload']")).click();
				Thread.sleep(10000);
				//						
				//						// to upload NRIC
				//						
				driver.findElement(By.xpath("(//a[text()='Upload Document'])[2]")).click();
				driver.findElement(By.xpath("//input[@name='UploadPhotoModal']")).sendKeys("C:\\Users\\acharpe\\Downloads\\img1.jpg");
				Thread.sleep(500);
				driver.findElement(By.xpath("//button[normalize-space(text())='Upload']")).click();
				Thread.sleep(10000);
				//						//to upload immunization 
				//							

				driver.findElement(By.xpath("(//a[text()='Upload Document'])[3]")).click();
				driver.findElement(By.xpath("//input[@name='UploadPhotoModal']")).sendKeys("C:\\Users\\acharpe\\Downloads\\img1.jpg");
				Thread.sleep(500);
				driver.findElement(By.xpath("//button[normalize-space(text())='Upload']")).click();
				Thread.sleep(10000);

				//										// to upload TC
				driver.findElement(By.xpath("(//a[text()='Upload Document'])[4]")).click();
				driver.findElement(By.xpath("//input[@name='UploadPhotoModal']")).sendKeys("C:\\Users\\acharpe\\Downloads\\img1.jpg");
				Thread.sleep(500);
				driver.findElement(By.xpath("//button[normalize-space(text())='Upload']")).click();
				Thread.sleep(10000);

				//										
				//										// to upload Ms
				driver.findElement(By.xpath("(//a[text()='Upload Document'])[5]")).click();
				driver.findElement(By.xpath("//input[@name='UploadPhotoModal']")).sendKeys("C:\\Users\\acharpe\\Downloads\\img1.jpg");
				Thread.sleep(500);
				driver.findElement(By.xpath("//button[normalize-space(text())='Upload']")).click();
				Thread.sleep(5000);

				//										
				//										// to upload MR
				driver.findElement(By.xpath("(//a[text()='Upload Document'])[6]")).click();
				driver.findElement(By.xpath("//input[@name='UploadPhotoModal']")).sendKeys("C:\\Users\\acharpe\\Downloads\\img1.jpg");
				Thread.sleep(500);
				driver.findElement(By.xpath("//button[normalize-space(text())='Upload']")).click();
				Thread.sleep(5000);
				//										
				//										// to upload other
				driver.findElement(By.xpath("(//a[text()='Upload Document'])[7]")).click();
				driver.findElement(By.xpath("//input[@name='UploadPhotoModal']")).sendKeys("C:\\Users\\acharpe\\Downloads\\img1.jpg");
				Thread.sleep(500);
				driver.findElement(By.xpath("//button[normalize-space(text())='Upload']")).click();
				Thread.sleep(5000);

				String satisfactionNum = "4";

				if(satisfactionNum.equals("1"))
				{
					driver.findElement(By.xpath("(//input[@name='SatisfactionLevel'])[1]")).click();
				}
				else if(satisfactionNum.equals("2"))
				{
					driver.findElement(By.xpath("(//input[@name='SatisfactionLevel'])[2]")).click();
				}
				else if(satisfactionNum.equals("3"))
				{
					driver.findElement(By.xpath("(//input[@name='SatisfactionLevel'])[3]")).click();
				}
				else if(satisfactionNum.equals("4"))
				{
					driver.findElement(By.xpath("(//input[@name='SatisfactionLevel'])[4]")).click();
				}
				else if(satisfactionNum.equals("5"))
				{
					driver.findElement(By.xpath("(//input[@name='SatisfactionLevel'])[5]")).click();
				}
				//										 
				Thread.sleep(500);
				driver.findElement(By.xpath("//input[@name='AdditionalFeedback']")).sendKeys("Additional feedback test");
				Thread.sleep(500);
				submitBtn.click();

			}
		}
	}





}
