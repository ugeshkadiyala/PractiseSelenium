$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/OrangeHRM.feature");
formatter.feature({
  "name": "Orange HRM Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Logo presence on Orange HRM homepage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "Open the browser and load the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.OrangeHRMSteps.open_the_browser_and_load_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "URL opens provide Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.OrangeHRMSteps.url_opens_provide_Username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.OrangeHRMSteps.click_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the logo presence post login",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.OrangeHRMSteps.validate_the_logo_presence_post_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.OrangeHRMSteps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});