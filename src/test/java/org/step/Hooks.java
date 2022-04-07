package org.step;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;

public class Hooks extends BaseClass

{
@After
public static void failure(Scenario s) 

{
if (s.isFailed())
{
	TakesScreenshot tk=(TakesScreenshot)driver;
	byte[] ss = tk.getScreenshotAs(OutputType.BYTES);
	s.embed(ss,"image/png");
}
}
}
