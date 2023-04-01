package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.DoAnAction;
import starter.helpers.LinkedInPage;
import starter.helpers.NavigateTo;

public class LinkedInSDBDD {
    @Given("{actor} is on linkedin landing page")
    public void userIsOnLinkedinLandingPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theLinkedInLandingPage());
    }

    @When("{actor} click on the sign in menu")
    public void userClickOnTheSignInMenu(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLinkedInSignInMenu());
    }

    @And("{actor} input valid username {string}")
    public void userInputValidUsername(Actor actor, String username) {
        actor.attemptsTo(DoAnAction.fillValidLinkedInUsername(username));
    }

    @And("{actor} input valid password {string}")
    public void userInputValidPassword(Actor actor, String password) {
        actor.attemptsTo(DoAnAction.fillValidLinkedInPassword(password));
    }

    @And("{actor} click on the sign in button")
    public void userClickOnTheSignInButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLinkedInSignInButton());
    }

    @Then("{actor} redirected to my LinkedIn feed page and see {string} text")
    public void userRedirectedToMyLinkedInFeedPageAndSeeText(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(LinkedInPage.FEED_PAGE).hasText(text));
    }

    @And("{actor} input invalid username {string}")
    public void userInputInvalidUsername(Actor actor, String invUsername) {
        actor.attemptsTo(DoAnAction.fillInvalidLinkedInUsername(invUsername));
    }

    @And("{actor} input invalid password {string}")
    public void userInputInvalidPassword(Actor actor, String invPassword) {
        actor.attemptsTo(DoAnAction.fillInvalidLinkedInPassword(invPassword));
    }

    @Then("{actor} should see an error message {string} username is invalid")
    public void userShouldSeeAnErrorMessageUsernameIsInvalid(Actor actor, String message) {
        actor.attemptsTo(Ensure.that(LinkedInPage.INVALID_EMAIL_LABEL).hasText(message));
    }

    @When("{actor} click on the discover button on navbar")
    public void userClickOnTheDiscoverButtonOnNavbar(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLinkedInDiscoverButton());
    }

    @And("{actor} click on careers button")
    public void userClickOnCareersButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLinkedInCareersFiltersButton());
    }

    @And("{actor} click on internships button")
    public void userClickOnInternshipsButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLinkedInInternshipsTopicsButton());
    }

    @Then("{actor} see {string} sub-explore page")
    public void userSeeSubExplorePage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(LinkedInPage.INTERNSHIPS_EXPLORE_PAGES).hasText(text));
    }

    @When("{actor} click on the people button on navbar")
    public void userClickOnThePeopleButtonOnNavbar(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLinkedInPeopleButton());
    }

    @And("{actor} input {string} on first name of the person")
    public void userInputOnFirstNameOfThePerson(Actor actor, String first) {
        actor.attemptsTo(DoAnAction.fillSearchFirstNameField(first));
    }

    @And("{actor} input {string} on last name of the person")
    public void userInputOnLastNameOfThePerson(Actor actor, String last) {
        actor.attemptsTo(DoAnAction.fillSearchLastNameField(last));
    }

    @And("{actor} click on the people search button")
    public void userClickOnThePeopleSearchButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLinkedInPeopleSearchButton());
    }

    @Then("{actor} see {string} as total of results of their search")
    public void userSeeAsTotalOfResultsOfTheirSearch(Actor actor, String results) {
        actor.attemptsTo(Ensure.that(LinkedInPage.TOTAL_SEARCH_RESULTS).hasText(results));
    }

    @When("{actor} click on the jobs button on navbar")
    public void userClickOnTheJobsButtonOnNavbar(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLinkedInJobsButton());
    }

    @And("{actor} input {string} as the job keyword")
    public void userInputAsTheJobKeyword(Actor actor, String keyword) {
        actor.attemptsTo(DoAnAction.fillJobsSearchWithKeyword(keyword));
    }

    @And("{actor} click on the jobs search button")
    public void userClickOnTheJobsSearchButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLinkedInJobsSearchButton());
    }

    @Then("{actor} see {string} as the results of their search")
    public void userSeeAsTheResultsOfTheirSearch(Actor actor, String results) {
        actor.attemptsTo(Ensure.that(LinkedInPage.JOBS_SEARCH_RESULTS).hasText(results));
    }
}
