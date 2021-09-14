Feature: Flipkart Assignment 
Scenario: Verify price of the porduct 
	Given The URL and I launch 
	When I search for flower pot 
	And I click on AGAMI Plant Container Set and verify the price 
	Then Price should dislpay 
	
Scenario: Verify the price of the product after increasing 
	Given Product AGAMI Plant Container Set 
	When I click on Add to cart 
	And I click + button to increase item and verify the price 
	Then Price of the product should display 
	
Scenario: Verify the name and price of Air purifire product 
	Given The Add Cart link 
	When I navigate to home page 
	And I mouse hover on Appliances>Home appliances and select Air purifire 
	And Clcik on Low to High sort 
	Then All items should diplay with the price low to high 
	
Scenario: Verify Error message for invalid login 
	Given The flipkart URL and I launch 
	When I click on Loign button 
	And I enter Invalid username,password and click on Login button 
	Then Error message should display