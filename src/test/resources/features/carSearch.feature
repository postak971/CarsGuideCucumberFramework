Feature: validation of car search page
In order to validate the car search
as a buyer
I navigate to http://www.carsguide.com.au

Scenario: Searching for a new car
Given I am on the home page http://www.carsguide.com.au
When I move on the buy+sell menu
Then I click on Search Cars
And I select Make as "BMW"
And I select Model as "1 Series"
And I select location as "NSW - Central Coast"
And I select price as "$50,000"
And I click on Find My Next Car button
Then I should see the list of "4 BMW 1 Series for Sale under $50,000 in Central Coast, NSW" cars
And page tilte should be "Bmw 1 Series Under 50000 for Sale Central Coast NSW | carsguide"