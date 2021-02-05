$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/carSearch.feature");
formatter.feature({
  "name": "validation of car search page",
  "description": "In order to validate the car search\nas a buyer\nI navigate to http://www.carsguide.com.au",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Searching for a new car",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the home page http://www.carsguide.com.au",
  "keyword": "Given "
});
formatter.match({
  "location": "CarSearchSteps.i_am_on_the_home_page_http_www_carsguide_com_au()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I move on the buy+sell menu",
  "keyword": "When "
});
formatter.match({
  "location": "CarSearchSteps.i_move_on_the_buy_sell_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Search Cars",
  "keyword": "Then "
});
formatter.match({
  "location": "CarSearchSteps.i_click_on_Search_Cars()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Make as \"BMW\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearchSteps.i_select_Make_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Model as \"1 Series\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearchSteps.i_select_Model_as(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: 1 Series\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-L49GJNQ\u0027, ip: \u0027192.168.1.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:147)\r\n\tat StepDefinitions.CarSearchSteps.i_select_Model_as(CarSearchSteps.java:90)\r\n\tat ✽.I select Model as \"1 Series\"(file:src/test/resources/features/carSearch.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I select location as \"NSW - Central Coast\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearchSteps.i_select_location_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I select price as \"$50,000\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearchSteps.i_select_price_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on Find My Next Car button",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearchSteps.i_click_on_Find_My_Next_Car_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see the list of \"4 BMW 1 Series for Sale under $50,000 in Central Coast, NSW\" cars",
  "keyword": "Then "
});
formatter.match({
  "location": "CarSearchSteps.i_should_see_the_list_of_cars(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "page tilte should be \"Bmw 1 Series Under 50000 for Sale Central Coast NSW | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearchSteps.page_tilte_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});