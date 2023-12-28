Feature : Goibibo hotel booking

Scenario: To click login and signup
Given user launch the url "https://www.goibibo.com/hotels/"
And user click login 
And user enter mobile number 
And user click continue 
And user enter the name 
And user enter the mailid
And user click let's go


Scenario: To select the hotel
Given user click india option
And user enter the hotel name 
And user want to give check in date 
And user want to give check out date
And User click search