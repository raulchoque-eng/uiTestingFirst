$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/test.feature");
formatter.feature({
  "name": "Chrome browser",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Open the Chrome browser",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am logged in to the Application",
  "keyword": "Given "
});
formatter.match({
  "location": "Test.verifyLoginToApplication()"
});
formatter.result({
  "status": "passed"
});
});