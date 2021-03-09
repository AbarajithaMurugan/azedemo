$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/adactin.feature");
formatter.feature({
  "name": "verify Adactin page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Open in Background",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enters background line one",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_enters_background_line_one()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters background line two",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_enters_background_line_two()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is in Scenario three",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@reg"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User enters Scenario three line one",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_enters_Scenario_three_line_one()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Scenario three line two",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_enters_Scenario_three_line_two()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});