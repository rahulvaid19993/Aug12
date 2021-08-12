package ch3_3_auto.elem;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex06_UsingXPath extends BaseTest1 {

	/*
	 * Identify User Name text field with Absolute XPath (tag name) DO NOT USE THIS
	 * in PROFESSIONAL WORK Absolute XPath are evil :_>
	 */
	@Test
	void test00() {
		WebElement element = getDriver().findElement(By.xpath("/html/body/div[1]/form/p[1]/label/input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Now onwards we stick with relative XPath as Absolute XPath are brittle
	 * Identify User Name text field with XPath (tag name)
	 */
	@Test
	void test01() {
		WebElement element = getDriver().findElement(By.xpath("//input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify User Name text field with XPath (tag name with attribute)
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify Password text field with XPath (tag name, attribute and value)- type
	 */
	@Test
	void test03_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type='password']"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

	/*
	 * Identify User Name text field with XPath Variant of test03_01 - ID
	 */
	@Test
	void test03_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@id='user_login']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify User Name text field with XPath Variant of test03_01 - Class
	 */
	@Test
	void test03_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class='input']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify User Name text field with XPath Variant of test03_01 - Name
	 */
	@Test
	void test03_04() {
		WebElement element = getDriver().findElement(By.xpath("//input[@name='log']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify User Name text field with XPath Variant of test03_01 - Any tag
	 */
	@Test
	void test03_05() {
		WebElement element = getDriver().findElement(By.xpath("//*[@name='log']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify Lost your password link with XPath - text
	 */
	@Test
	void test04() {
		WebElement element = getDriver().findElement(By.xpath("//*[text()='Lost your password?']"));
		SeleniumUtils.printElementInfo("Lost you password link", element);
	}

	/*
	 * Identify User Name text field with XPath - Relationships - Child
	 */
	@Test
	void test05_01() {
		WebElement element = getDriver().findElement(By.xpath("//label/input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify User Name text field with XPath - Relationships - Following sibling
	 */
	@Test
	void test05_02() {
		WebElement element = getDriver().findElement(By.xpath("//br/following-sibling::input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify User Name text field with XPath - Partial Match - Attribute value
	 * Contains
	 */
	@Test
	void test06_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[contains(@id,'er_l')]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

	/*
	 * Identify User Name text field with XPath - Partial Match - Attribute value
	 * Starts-with
	 */
	@Test
	void test06_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[starts-with(@id,'user_')]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify User Name text field with XPath - Partial Match - ends-with
	 * ends-with is not supported in current browsers. 
	 * As it requires XPath 2.0, however all browsers use XPath v1
	 * 
	 */
	@Test
	void test06_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[ends-with(@id,'_login')]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}

}
