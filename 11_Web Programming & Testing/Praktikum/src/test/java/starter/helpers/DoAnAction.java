package starter.helpers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DoAnAction {

    // for LinkedInPage

    public static Performable clickLinkedInSignInMenu() {
        return Task.where("{0} click sign in menu",
                Click.on(LinkedInPage.SIGN_IN_MENU)
        );
    }

    public static Performable fillValidLinkedInUsername(String username) {
        return Task.where("{0} fill linked username field with " + username,
                Enter.theValue(username)
                        .into(LinkedInPage.USERNAME_FIELD)
        );
    }

    public static Performable fillValidLinkedInPassword(String password) {
        return Task.where("{0} fill password field with " + password,
                Enter.theValue(password)
                        .into(LinkedInPage.PASSWORD_FIELD)
        );
    }

    public static Performable fillInvalidLinkedInUsername(String invUsername) {
        return Task.where("{0} fill linked username field with " + invUsername,
                Enter.theValue(invUsername)
                        .into(LinkedInPage.USERNAME_FIELD)
        );
    }

    public static Performable fillInvalidLinkedInPassword(String invPassword) {
        return Task.where("{0} fill password field with " + invPassword,
                Enter.theValue(invPassword)
                        .into(LinkedInPage.PASSWORD_FIELD)
        );
    }

    public static Performable clickLinkedInSignInButton() {
        return Task.where("{0} click sign in button",
                Click.on(LinkedInPage.SIGN_IN_BUTTON)
        );
    }

    public static Performable clickLinkedInDiscoverButton() {
        return Task.where("{0} click discover button",
                Click.on(LinkedInPage.DISCOVER_BUTTON)
        );
    }

    public static Performable clickLinkedInCareersFiltersButton() {
        return Task.where("{0} click careers filter button",
                Click.on(LinkedInPage.CAREERS_FILTER_BUTTON)
        );
    }

    public static Performable clickLinkedInInternshipsTopicsButton() {
        return Task.where("{0} click interships topics button",
                Click.on(LinkedInPage.INTERNSHIPS_TOPICS_BUTTON)
        );
    }

    public static Performable clickLinkedInPeopleButton() {
        return Task.where("{0} click people button",
                Click.on(LinkedInPage.PEOPLE_BUTTON)
        );
    }

    public static Performable clickLinkedInPeopleSearchButton() {
        return Task.where("{0} click people search button",
                Click.on(LinkedInPage.PEOPLE_SEARCH_BUTTON)
        );
    }

    public static Performable clickLinkedInJobsSearchButton() {
        return Task.where("{0} click people jobs button",
                Click.on(LinkedInPage.JOBS_SEARCH_BUTTON)
        );
    }

    public static Performable clickLinkedInJobsButton() {
        return Task.where("{0} click jobs button",
                Click.on(LinkedInPage.JOBS_BUTTON)
        );
    }

    public static Performable fillSearchFirstNameField(String first) {
        return Task.where("{0} fill first name with " + first,
                Enter.theValue(first)
                        .into(LinkedInPage.FIRST_NAME_FIELD)
        );
    }

    public static Performable fillSearchLastNameField(String last) {
        return Task.where("{0} fill last name with " + last,
                Enter.theValue(last)
                        .into(LinkedInPage.LAST_NAME_FIELD)
        );
    }

    public static Performable fillJobsSearchWithKeyword(String keyword) {
        return Task.where("{0} fill search field with " + keyword,
                Enter.theValue(keyword)
                        .into(LinkedInPage.JOBS_SEARCH_FIELD)
        );
    }

    // for SepulsaPage

    public static Performable clickMasukButton() {
        return Task.where("{0} click masuk button",
                Click.on(SepulsaPage.MASUK_BUTTON)
        );
    }

    public static Performable fillValidSepulsaUsername(String username) {
        return Task.where("{0} fill linked username field with " + username,
                Enter.theValue(username)
                        .into(SepulsaPage.USERNAME_FIELD)
        );
    }

    public static Performable fillValidSepulsaPassword(String password) {
        return Task.where("{0} fill linked username field with " + password,
                Enter.theValue(password)
                        .into(SepulsaPage.PASSWORD_FIELD)
        );
    }

    public static Performable clickProfileButton() {
        return Task.where("{0} click profile button",
                Click.on(SepulsaPage.PROFILE_BUTTON)
        );
    }

    public static Performable fillInvalidSepulsaUsername(String invUsername) {
        return Task.where("{0} fill linked username field with " + invUsername,
                Enter.theValue(invUsername)
                        .into(SepulsaPage.USERNAME_FIELD)
        );
    }

    public static Performable fillInvalidSepulsaPassword(String invPassword) {
        return Task.where("{0} fill linked username field with " + invPassword,
                Enter.theValue(invPassword)
                        .into(SepulsaPage.PASSWORD_FIELD)
        );
    }

    public static Performable clickSubmitLoginButton() {
        return Task.where("{0} click submit login button",
                Click.on(SepulsaPage.SUBMIT_LOGIN_BUTTON)
        );
    }


    public static Performable clickPulsaButton() {
        return Task.where("{0} click beli pulsa button",
                Click.on(SepulsaPage.PULSA_BUTTON)
        );
    }

    public static Performable clickUangElektronikButton() {
        return Task.where("{0} click uang elektronik button",
                Click.on(SepulsaPage.UANG_ELEKTRONIK_BUTTON)
        );
    }

    public static Performable clickGoPayButton() {
        return Task.where("{0} click gopay button",
                Click.on(SepulsaPage.GOPAY_BUTTON)
        );
    }

    public static Performable clickShopeePayButton() {
        return Task.where("{0} click shopeepay button",
                Click.on(SepulsaPage.SHOPEEPAY_BUTTON)
        );
    }

    public static Performable chooseShopeePay15rb() {
        return Task.where("{0} choose shopeepay 15rb",
                Click.on(SepulsaPage.SHOPEEPAY_15000)
        );
    }

    public static Performable clickGoPayPaymentMethod() {
        return Task.where("{0} click gopay payment button",
                Click.on(SepulsaPage.GOPAY_PAYMENT_CHECKBOX)
        );
    }

    public static Performable clickBayarSekarangButton() {
        return Task.where("{0} click bayar sekarang button",
                Click.on(SepulsaPage.BAYAR_SEKARANG_BUTTON)
        );
    }

    public static Performable clickVoucherGameButton() {
        return Task.where("{0} click voucher game button",
                Click.on(SepulsaPage.VOUCHER_GAME_BUTTON)
        );
    }

    public static Performable clickTwitchButton() {
        return Task.where("{0} click twitch button",
                Click.on(SepulsaPage.TWITCH_BUTTON)
        );
    }

    public static Performable fillNomorHPWithValue(String nomorHp) {
        return Task.where("{0} fill nominal pulsa with " + nomorHp,
                Enter.theValue(nomorHp)
                        .into(SepulsaPage.NOMOR_HP_FIELD)
        );
    }

    public static Performable choosePulsa20rb() {
        return Task.where("{0} choose pulsa 20rb",
                Click.on(SepulsaPage.PULSA_20000)
        );
    }

    public static Performable chooseGoPay25rb() {
        return Task.where("{0} choose gopay 25rb",
                Click.on(SepulsaPage.GOPAY_25000)
        );
    }

    // for SauceDemo Page

    public static Performable fillSauceDemoUsername(String username) {
        return Task.where("{0} fill saucedemo username field with " + username,
                Enter.theValue(username)
                        .into(SauceDemoPage.USERNAME_FIELD)
        );
    }

    public static Performable fillSauceDemoPassword(String password) {
        return Task.where("{0} fill saucedemo username field with " + password,
                Enter.theValue(password)
                        .into(SauceDemoPage.PASSWORD_FIELD)
        );
    }

    public static Performable clickSauceDemoSubmitLoginButton() {
        return Task.where("{0} click saucedemo submit login button",
                Click.on(SauceDemoPage.SUBMIT_LOGIN_BUTTON)
        );
    }

    public static Performable clickSauceDemoSideNavbarButton() {
        return Task.where("{0} click saucedemo side navbar button",
                Click.on(SauceDemoPage.SIDE_NAVBAR_BUTTON)
        );
    }

    public static Performable clickSauceDemoAboutMenuButton() {
        return Task.where("{0} click saucedemo about menu button",
                Click.on(SauceDemoPage.ABOUT_MENU_BUTTON)
        );
    }

    public static Performable addSauceLabsBackpackItemsButton() {
        return Task.where("{0} click saucedemo add backpack button",
                Click.on(SauceDemoPage.ADD_BACKPACK_BUTTON)
        );
    }

    public static Performable addSauceLabsFleeceJacketItemsButton() {
        return Task.where("{0} click saucedemo add jacket button",
                Click.on(SauceDemoPage.ADD_JACKET_BUTTON)
        );
    }

    public static Performable clickSauceDemoCartButton() {
        return Task.where("{0} click saucedemo cart button",
                Click.on(SauceDemoPage.CART_BUTTON)
        );
    }

    public static Performable clickSauceDemoCheckoutButton() {
        return Task.where("{0} click saucedemo checkout button",
                Click.on(SauceDemoPage.CHECKOUT_BUTTON)
        );
    }

    public static Performable fillSauceDemoCheckoutFirstname(String firstname) {
        return Task.where("{0} fill saucedemo firstname field with " + firstname,
                Enter.theValue(firstname)
                        .into(SauceDemoPage.FIRSTNAME_FIELD)
        );
    }

    public static Performable fillSauceDemoCheckoutLastname(String lastname) {
        return Task.where("{0} fill saucedemo lastname field with " + lastname,
                Enter.theValue(lastname)
                        .into(SauceDemoPage.LASTNAME_FIELD)
        );
    }

    public static Performable fillSauceDemoCheckoutPostalCode(String postalcode) {
        return Task.where("{0} fill saucedemo postalcode field with " + postalcode,
                Enter.theValue(postalcode)
                        .into(SauceDemoPage.POSTALCODE_FIELD)
        );
    }

    public static Performable clickSauceDemoContinueButton() {
        return Task.where("{0} click saucedemo continue button",
                Click.on(SauceDemoPage.CONTINUE_BUTTON)
        );
    }

    public static Performable clickSauceDemoFinishButton() {
        return Task.where("{0} click saucedemo finish button",
                Click.on(SauceDemoPage.FINISH_BUTTON)
        );
    }
}