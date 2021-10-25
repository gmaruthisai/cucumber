Feature: Test Case _ Adding Jobs
 
		

  Scenario Outline: To add jobs Record
  
    Given to open my website
    When I have entered valid "Admin" and valid "admin123"  
    Then I created Addjobs Record "<Title>" "<Desc>" "<Note>"

    Examples: 
      | Title  | Desc      |Note    |
      | hi     | A helo    |hiii    |
      | hfd    | Ahelo     |hfgfdii |