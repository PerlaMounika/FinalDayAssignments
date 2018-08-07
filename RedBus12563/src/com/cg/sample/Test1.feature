Feature:Registration
Scenario: registration
Given user enters the details of website "https://www.redbus.in/?gclid=EAIaIQobChMIsOb108zX3AIViqoYCh0pbw0OEAAYASAAEgKOy_D_BwE"
When i am having " Pune" " Hyderabad" "10-aug-2018"
Then it should SearchBusses

Given user selects view seats
When i am having seatno 
Then it should select boardingpoint and droping point





