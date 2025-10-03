package utlity;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import hooks.Hooks;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Library extends Hooks {

	public void takeScreenshot(String screenShotName) {

		String timestamp = new SimpleDateFormat("yyyyMMdd_HH:mm:ss").format(new Date());
		String screenshotName = screenShotName + "_" + timestamp + ".png";

		String screenshotDiretroy = "./testdata/screenshot";
		File directory = new File(screenshotDiretroy);

		if (!directory.exists()) {
			directory.mkdir();
		}

		File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(screenShotFile, new File(screenshotDiretroy + "/" + screenshotName));
			System.out.println("Screen shot saved " + screenshotDiretroy + "/" + screenshotName);

		} catch (IOException e) {
			System.err.println("Failed to save screenshot " + e.getMessage());

		}

	}

}
