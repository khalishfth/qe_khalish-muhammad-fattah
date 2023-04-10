package starter.helpers;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://linkedin.com")
public class LinkedInPage extends PageObject {

    // button

    public static Target SIGN_IN_MENU = Target.the("sign in menu").located(By.xpath("//a[contains(text(),'Sign in')]"));
    public static Target SIGN_IN_BUTTON = Target.the("sign in button").locatedBy("//button[contains(text(),'Sign in')]");
    public static Target DISCOVER_BUTTON = Target.the("discover button").locatedBy("//body/nav[1]/ul[1]/li[1]/a[1]");
    public static Target CAREERS_FILTER_BUTTON = Target.the("careers filter button").locatedBy("//a[contains(text(),'Careers')]");
    public static Target INTERNSHIPS_TOPICS_BUTTON = Target.the("internships topics button").locatedBy("//a[contains(text(),'Internships')]");
    public static Target PEOPLE_BUTTON = Target.the("people button").locatedBy("//body/nav[1]/ul[1]/li[2]/a[1]");
    public static Target PEOPLE_SEARCH_BUTTON = Target.the("people search button").locatedBy("//header/nav[1]/section[1]/section[1]/form[1]/button[1]");
    public static Target JOBS_SEARCH_BUTTON = Target.the("jobs search button").locatedBy("//header/nav[1]/section[1]/section[2]/form[1]/button[1]");
    public static Target JOBS_BUTTON = Target.the("jobs button").locatedBy("//body/nav[1]/ul[1]/li[4]/a[1]");

    // form field

    public static Target USERNAME_FIELD = Target.the("username field").located(By.id("username"));
    public static Target PASSWORD_FIELD = Target.the("password field").located(By.id("password"));
    public static Target FIRST_NAME_FIELD = Target.the("field first name").locatedBy("//header/nav[1]/section[1]/section[1]/form[1]/section[1]/input[1]");
    public static Target LAST_NAME_FIELD = Target.the("field last name").locatedBy("//header/nav[1]/section[1]/section[1]/form[1]/section[2]/input[1]");
    public static Target JOBS_SEARCH_FIELD = Target.the("jobs search field").located(org.openqa.selenium.By.id("job-search-bar-keywords"));

    // text

    public static Target INVALID_EMAIL_LABEL = Target.the("error invalid email").located(By.xpath("//div[@id='error-for-username']"));
    public static Target FEED_PAGE = Target.the("text add to your feed").locatedBy("//span[contains(text(),'Connections')]");
    public static Target TOTAL_SEARCH_RESULTS = Target.the("total search results").locatedBy("//span[contains(text(),'4')]");
    public static Target INTERNSHIPS_EXPLORE_PAGES = Target.the("interships explore pages").locatedBy("//h1[contains(text(),'Resource Center for Internships')]");
    public static Target JOBS_SEARCH_RESULTS = Target.the("jobs search results").locatedBy("//span[contains(text(),'Java Developer Jobs in United States')]");
}
