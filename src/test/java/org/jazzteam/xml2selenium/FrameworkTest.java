package org.jazzteam.xml2selenium;

import org.jazzteam.xml2selenium.core.annotations.TestPath;
import org.jazzteam.xml2selenium.core.runner.junit.Xml2SeleniumJUnitRunner;
import org.junit.runner.RunWith;

/**
 * Test case for running UI-tests on xml2selenium framework
 * 
 * @author Konstantin
 * @see <a href="http://xml2selenium.com">xml2selenium.com</a>
 */
@RunWith(Xml2SeleniumJUnitRunner.class)
@TestPath(paths = { "tests" })
public class FrameworkTest {
}