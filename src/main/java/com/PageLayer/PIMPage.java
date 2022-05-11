package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;
import com.UtilsLayer.DropdownMethods;


public class PIMPage extends BaseClass {
	
	@FindBy(xpath = "//b[text()='PIM']")
	WebElement PIMTab;

	@FindBy(id = "btnAdd")
	WebElement AddButton;

	@FindBy(id = "firstName")
	WebElement FirstName;

	@FindBy(id = "middleName")
	WebElement MiddleName;

	@FindBy(id = "lastName")
	WebElement LastName;

	@FindBy(id = "employeeId")
	WebElement EmployeeId;

	@FindBy(id = "btnSave")
	WebElement SaveOrEditButton;

	@FindBy(id = "personal_txtLicenNo")
	WebElement LicenNumber;

	@FindBy(id = "personal_txtNICNo")
	WebElement SSN;

	@FindBy(id = "personal_txtLicExpDate")
	WebElement LiscenExpiryDate;

	@FindBy(xpath = "//Select[@class='ui-datepicker-month']")
	WebElement Month;

	@FindBy(xpath = "//Select[@class='ui-datepicker-year']")
	WebElement Year;


	@FindBy(id = "personal_cmbMarital")
	WebElement MarriatialStatus;

	@FindBy(id = "personal_DOB")
	WebElement Birthdate;
	
	@FindBy(id="empsearch_id")
	WebElement SearchId;
	
	@FindBy(id="searchBtn")
	WebElement SerchButton;
	
	@FindBy(name="chkSelectRow[]")
	WebElement CheckBox;
	
	@FindBy(id="btnDelete")
	WebElement DeleteButton;
	
	@FindBy(id="dialogDeleteBtn")
	WebElement DialogDeleteButton;
	
	

	public PIMPage() {
		PageFactory.initElements(driver, this);
	}

	public static String id;
	
	public String validatePIMPage()
	{
		return driver.getCurrentUrl();
	}

	public void addNewUser(String fname, String mname, String lname) {
		PIMTab.click();
		AddButton.click();
		FirstName.sendKeys(fname);
		MiddleName.sendKeys(mname);
		LastName.sendKeys(lname);
		id = EmployeeId.getAttribute("value");
		SaveOrEditButton.click();
	}
	
	public void addMorePersonalDetails(String licenNumber,String ssn,String LCEXmonth, String LCEXyear,
			String LCEXdate)
	{
		SaveOrEditButton.click();
		LicenNumber.sendKeys(licenNumber);
		SSN.sendKeys(ssn);		
		LiscenExpiryDate.click();
		DropdownMethods.selectValueByVisibleText(Month, LCEXmonth);
		DropdownMethods.selectValueByVisibleText(Year, LCEXyear);
		driver.findElement( By.xpath("//a[text()='" + LCEXdate + "']")).click();;
		SaveOrEditButton.click();
	}
	
	public void serchUser()
	{
		PIMTab.click();
		SearchId.sendKeys(id);
		SerchButton.click();
	}
	
	public void deleteUser()
	{
		CheckBox.click();
		DeleteButton.click();
		DialogDeleteButton.click();
	}

}
