$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To check the login page of ASl airlines by invalid username and password",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user should be in ASl login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_ASl_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user fill the all required deatails and moving into next page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user click the departure and arrival airport date and passenger deatils",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition2.user_click_the_departure_and_arrival_airport_date_and_passenger_deatils()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition2.user_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will navigate the flight details page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition2.user_will_navigate_the_flight_details_page()"
});
formatter.result({
  "status": "passed"
});
});