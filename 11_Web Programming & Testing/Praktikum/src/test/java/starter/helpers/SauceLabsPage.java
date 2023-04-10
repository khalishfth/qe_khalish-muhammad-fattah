package starter.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://saucelabs.com")
public class SauceLabsPage extends PageObject{
    // text
    public static Target ABOUT_404_PAGE = Target.the("about 404 page description").locatedBy("//body/div[@id='__next']/div[2]/div[1]/div[1]/h2[1]");
    public static Target ABOUT_SUCCESS_PAGE = Target.the("about success page description").locatedBy("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]");
}
