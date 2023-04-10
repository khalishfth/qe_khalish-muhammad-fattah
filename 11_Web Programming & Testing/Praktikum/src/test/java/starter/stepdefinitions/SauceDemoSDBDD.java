package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.*;

public class SauceDemoSDBDD {
    @Given("{actor} is on saucedemo login page")
    public void userIsOnSaucedemoLoginPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSauceDemoLoginPage());
    }

    @And("{actor} input valid saucedemo username {string}")
    public void userInputValidSaucedemoUsername(Actor actor, String username) {
        actor.attemptsTo(DoAnAction.fillSauceDemoUsername(username));
    }

    @And("{actor} input valid saucedemo password {string}")
    public void userInputValidSaucedemoPassword(Actor actor, String password) {
        actor.attemptsTo(DoAnAction.fillSauceDemoPassword(password));
    }

    @And("{actor} click on the saucedemo submit login button")
    public void userClickOnTheSaucedemoSubmitLoginButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickSauceDemoSubmitLoginButton());
    }

    @Then("{actor} see {string} text on inventory page")
    public void userSeeTextOnInventoryPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SauceDemoPage.INVENTORY_PAGE).hasText(text));
    }

    @Then("{actor} see {string} text on the login page")
    public void userSeeTextOnTheLoginPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SauceDemoPage.LOGIN_ALERT).hasText(text));
    }
    
    @Given("{actor} is logged in on saucedemo with username {string} and password {string}")
    public void userIsLoggedInOnSaucedemoWithUsernameAndPassword(Actor actor, String username, String password) {
        userIsOnSaucedemoLoginPage(actor);
        userInputValidSaucedemoUsername(actor, username);
        userInputValidSaucedemoPassword(actor,password);
        userClickOnTheSaucedemoSubmitLoginButton(actor);
    }

    @And("{actor} add Sauce Labs Backpack items to cart")
    public void userAddSauceLabsBackpackItemsToCart(Actor actor) {
        actor.attemptsTo(DoAnAction.addSauceLabsBackpackItemsButton());
    }

    @And("{actor} add Sauce Labs Fleece Jacket to cart")
    public void userAddSauceLabsFleeceJacketToCart(Actor actor) {
        actor.attemptsTo(DoAnAction.addSauceLabsFleeceJacketItemsButton());
    }

    @And("{actor} click on the cart button")
    public void userClickOnTheCartButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickSauceDemoCartButton());
    }

    @And("{actor} click on the checkout button")
    public void userClickOnTheCheckoutButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickSauceDemoCheckoutButton());
    }

    @And("{actor} fill on the first name field with {string}")
    public void userFillOnTheFirstNameFieldWith(Actor actor, String firstname) {
        actor.attemptsTo(DoAnAction.fillSauceDemoCheckoutFirstname(firstname));
    }

    @And("{actor} fill on the last name field with {string}")
    public void userFillOnTheLastNameFieldWith(Actor actor, String lastname) {
        actor.attemptsTo(DoAnAction.fillSauceDemoCheckoutLastname(lastname));
    }

    @And("{actor} fill on the postal code field with {string}")
    public void userFillOnThePostalCodeFieldWith(Actor actor, String postalcode) {
        actor.attemptsTo(DoAnAction.fillSauceDemoCheckoutPostalCode(postalcode));
    }

    @And("{actor} click on the continue button")
    public void userClickOnTheContinueButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickSauceDemoContinueButton());
    }

    @And("{actor} see {string} text as the confirmation")
    public void userSeeTextAsTheConfirmation(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SauceDemoPage.CHECKOUT_OVERVIEW).hasText(text));
    }

    @And("{actor} click on the finish button")
    public void userClickOnTheFinishButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickSauceDemoFinishButton());
    }

    @Then("{actor} see {string} text as the sign that the checkout has been successfull")
    public void userSeeTextAsTheSignThatTheCheckoutHasBeenSuccessfull(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SauceDemoPage.CHECKOUT_COMPLETE).hasText(text));
    }

    @Then("{actor} see {string} text as the sign that the checkout is failed")
    public void userSeeTextAsTheSignThatTheCheckoutIsFailed(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SauceDemoPage.CHECKOUT_FAILED).hasText(text));
    }

    @When("{actor} click the side navbar button")
    public void userClickTheSideNavbarButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickSauceDemoSideNavbarButton());
    }

    @And("{actor} click the about menu on side navbar")
    public void userClickTheAboutMenuOnSideNavbar(Actor actor) {
        actor.attemptsTo(DoAnAction.clickSauceDemoAboutMenuButton());
    }

    @Then("{actor} see {string} as success sign text on the about page")
    public void userSeeAsSuccessSignTextOnTheAboutPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SauceLabsPage.ABOUT_SUCCESS_PAGE).hasText(text));
    }

    @Then("{actor} see {string} as failed sign text on the about page")
    public void userSeeAsFailedSignTextOnTheAboutPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SauceLabsPage.ABOUT_404_PAGE).hasText(text));
    }
}
