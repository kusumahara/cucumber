Feature: Login1
Background: common steps

When Open chrome1 
Then open orangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: Functionality client
When login username "Admin" Password "admin123" 
Then Navigate PIM
#Then Addemployee for below records1 
    #|firistname|lastname|id|
    #|"cucumber1"|"success1"|"4378164"|
    #|"lettuce" |"failure"|"4378162"|

