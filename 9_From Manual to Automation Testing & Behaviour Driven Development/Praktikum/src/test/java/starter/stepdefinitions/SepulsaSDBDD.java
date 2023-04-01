package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.DoAnAction;
import starter.helpers.NavigateTo;
import starter.helpers.SepulsaPage;

public class SepulsaSDBDD {
    @Given("{actor} is on sepulsa home page")
    public void userIsOnSepulsaHomePage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSepulsaHomePage());
    }

    @When("{actor} click on the masuk button")
    public void userClickOnTheMasukButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickMasukButton());
    }

    @And("{actor} input valid sepulsa username {string}")
    public void userInputValidSepulsaUsername(Actor actor, String username) {
        actor.attemptsTo(DoAnAction.fillValidSepulsaUsername(username));
    }

    @And("{actor} input valid sepulsa password {string}")
    public void userInputValidSepulsaPassword(Actor actor, String password) {
        actor.attemptsTo(DoAnAction.fillValidSepulsaPassword(password));
    }

    @And("{actor} click on the submit login button")
    public void userClickOnTheSubmitLoginButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickSubmitLoginButton());
    }

    @And("{actor} click on the akun button on navbar")
    public void userClickOnTheAkunButtonOnNavbar(Actor actor) {
        actor.attemptsTo(DoAnAction.clickProfileButton());
    }

    @Then("{actor} can see their profile page and this text {string}")
    public void userCanSeeTheirProfilePage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SepulsaPage.PROFILE_PAGE).hasText(text));
    }

    @And("{actor} input invalid sepulsa username {string}")
    public void userInputInvalidSepulsaUsername(Actor actor, String invUsername) {
        actor.attemptsTo(DoAnAction.fillInvalidSepulsaUsername(invUsername));
    }

    @And("{actor} input invalid sepulsa password {string}")
    public void userInputInvalidSepulsaPassword(Actor actor, String invPassword) {
        actor.attemptsTo(DoAnAction.fillInvalidSepulsaPassword(invPassword));
    }

    @Then("{actor} see this {string} alert message invalid account")
    public void userGotAlertMessageInvalidAccount(Actor actor, String alert) {
        actor.attemptsTo(Ensure.that(SepulsaPage.ALERT_MESSAGE).hasText(alert));
    }

    @When("{actor} click on the pulsa button on menu")
    public void userClickOnThePulsaButtonOnMenu(Actor actor) {
        actor.attemptsTo(DoAnAction.clickPulsaButton());
    }

    @And("{actor} input nomor handphone {string}")
    public void userInputNomorHandphone(Actor actor, String nomorHp) {
        actor.attemptsTo(DoAnAction.fillNomorHPWithValue(nomorHp));
    }

    @And("{actor} choose nominal 20 ribu")
    public void userChooseNominal20Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa20rb());
    }

    @Then("{actor} can see {string} checkout page")
    public void userCanSeeCheckoutPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SepulsaPage.TOTAL_PEMBAYARAN).hasText(text));
    }

    @When("{actor} click on the uang elektronik button on menu")
    public void userClickOnTheUangElektronikButtonOnMenu(Actor actor) {
        actor.attemptsTo(DoAnAction.clickUangElektronikButton());
    }

    @And("{actor} click on the Go-Pay button")
    public void userClickOnTheGoPayButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickGoPayButton());
    }

    @And("{actor} choose nominal 25 ribu")
    public void userChooseNominal25Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.chooseGoPay25rb());
    }

    @Given("{actor} is logged in on sepulsa with username {string} and password {string}")
    public void userIsLoggedInOnSepulsaWithUsernameAndPassword(Actor actor, String username, String password) {
        userIsOnSepulsaHomePage(actor);
        userClickOnTheMasukButton(actor);
        userInputValidSepulsaUsername(actor, username);
        userInputValidSepulsaPassword(actor, password);
        userClickOnTheSubmitLoginButton(actor);
    }

    @And("{actor} click on the ShopeePay button")
    public void userClickOnTheShopeePayButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickShopeePayButton());
    }

    @And("{actor} choose nominal 15 ribu")
    public void userChooseNominal15Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.chooseShopeePay15rb());
    }

    @And("{actor} click on the GoPay payment method")
    public void userClickOnTheGoPayPaymentMethod(Actor actor) {
        actor.attemptsTo(DoAnAction.clickGoPayPaymentMethod());
    }

    @Then("{actor} click on the Bayar Sekarang button")
    public void userClickOnTheBayarSekarangButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickBayarSekarangButton());
    }
}