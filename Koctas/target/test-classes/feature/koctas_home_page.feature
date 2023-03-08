Feature: products to favorites list add/remove process
Scenario: User able to login 
Given the user on the koctas homepage
Then the user able to see open homepage
When the user click on the icon member
And the user click login title
And the user enter valid email as "qa@mailinator.com"
And the user enter valid password as "Quality7"
And the user click giris yap button
Then the user able to see logged in

Scenario: User able to add products to favorites
Given the user on the koctas homepage
When the user types "Gardiroplar" in the search bar
And the user click search button
Then the user able to see open page
When the user click on second page
Then the user able to see open second page
When the user click button the third product
And the user click favorilerime ekle
And the user click button my favorites in the open popup
And the user click save button
And the user click on the hesabim button
And the user click on the my favorite list link
Then the user able to verify newly added products in the list
And the user able to see name of the list
When the user click on favorite list
And the user click on product
And the user click button as favorilerimden kaldir
And the user click button my favorites in the open popup
And the user click save button
And the user click on the hesabim button
And the user click on the my favorite list link
Then the user able to verify product removed from the list
