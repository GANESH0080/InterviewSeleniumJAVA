# Created scenario 1 using scenario outline 
# Executed 2 cases using scenario outline
# If value is mention in <> then that is Scenario outline
@flipkart
Feature: Need to verify the Flipcart 
Scenario Outline: Get the count of product 
	Given user navigate to website 
	When user click on Search field 
	And search any <product> 
	Then Get the count of product 
	
	
	
	Examples: 
		|product|
		|mobiles|
		|shirts|
		
		
		
# Created scenario 2 and using " " 	
# " " means " " value we can pass through Feature file only	
@amazon
Scenario: Get the count of product 
	Given user navigate to "https://www.amazon.in/" 
	When user search product
	
	
	
	
	
		