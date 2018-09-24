$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/E2E.feature");
formatter.feature({
  "line": 1,
  "name": "checkout functionality",
  "description": "",
  "id": "checkout-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 467492792,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "As a user I am able to checkout as guest",
  "description": "",
  "id": "checkout-functionality;as-a-user-i-am-able-to-checkout-as-guest",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I visit the website as a guest user",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search for the product \"dress\" from searchbox",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I navigate to product details page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I select a random product",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I navigate to PDP",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on \"ADD TO CART\" button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on bag icon from header",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I navigate to shopping bag page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I proceed to checkout as guest",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I navigate to checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "E2ESteps.iVisitTheWebsiteAsAGuestUser()"
});
