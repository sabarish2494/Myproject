package org.step;

import org.base.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {
	public PojoClass()  // non parameterized constructor
	{
		PageFactory.initElements(driver, this); // to rectify the staleElementRefrerenceException occuring  while once refresh the webpage
	}
	
	
}
