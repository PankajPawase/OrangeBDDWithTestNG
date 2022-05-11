package com.UtilsLayer;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseClass.BaseClass;

public class UtilsClass extends BaseClass {

	public static String ScreenShot(String filename) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_HHmmss");
		String date = sdf.format(new Date());
		String Dest = System.getProperty("user.dir") + "\\" + filename + date + ".png";

		try {
			FileUtils.copyFile(f, new File(Dest));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Dest;

	}

}
