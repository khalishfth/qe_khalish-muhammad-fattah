@LinkedIn
Feature: LinkedIn Main Page
  @Login @NormalPositive @LoginLinkedInSuccess
  Scenario: User can login with valid username and valid password
    Given user is on linkedin landing page
    When user click on the sign in menu
    And user input valid username "bunarachel9@gmail.com"
    And user input valid password "ew8a#$FdcqFwD,W"
    And user click on the sign in button
    Then user redirected to my LinkedIn feed page and see "Connections" text

  @Login @NormalNegative @LoginLinkedInFailed
  Scenario: User can't login with invalid username and invalid password
    Given user is on linkedin landing page
    When user click on the sign in menu
    And user input invalid username "invalidusername"
    And user input invalid password "invalidpassword"
    And user click on the sign in button
    Then user should see an error message "Please enter a valid username" username is invalid

  @Discover @NormalPositive @ExploreLinkedInInternshipTopics
  Scenario: User can access LinkedIn Explore in Internship Topics
    Given user is on linkedin landing page
    When user click on the discover button on navbar
    And user click on careers button
    And user click on internships button
    Then user see "Resource Center for Internships" sub-explore page

  @People @NormalPositive @SearchPeopleLinkedIn
  Scenario: User can search people with first and last name
    Given user is on linkedin landing page
    When user click on the people button on navbar
    And user input "Khalish" on first name of the person
    And user input "Muhammad" on last name of the person
    And user click on the people search button
    Then user see "4" as total of results of their search

  @Jobs @NormalPositive @SearchJobsLinkedIn
  Scenario: User can search jobs with the job keyword
    Given user is on linkedin landing page
    When user click on the jobs button on navbar
    And user input "Java Developer" as the job keyword
    And user click on the jobs search button
    Then user see "Java Developer Jobs in United States" as the results of their search