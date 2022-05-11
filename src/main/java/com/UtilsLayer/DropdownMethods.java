package com.UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.BaseClass;

public class DropdownMethods extends BaseClass {
	public static void selectValueByVisibleText(WebElement wb, String Value) {
		new Select(wb).selectByVisibleText(Value);
	}

}
