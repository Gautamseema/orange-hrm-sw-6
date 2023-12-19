@sanity
Feature: User test
  As a user I want to verify User Page

  @author_max @sanity @regression
Scenario: adminShouldAddUserSuccessFully
Given I am on User page
When  Login to Application
Then  click On "Admin" Tab
Then  Verify "System Users" Text
And   click On "Add" button
And   Verify "Add User" Text
And   Select User Role "Admin"
And   enter Employee Name "Ananya Dash"
And   enter Username
And   Select status "Disable"
And   enter psaaword
And   enter Confirm Password
And   click On "Save" Button
Then   verify message "Successfully Saved"

@sanity @regression
Scenario: searchTheUserCreatedAndVerifyI
When  Enter Username
And   Select User Role
And   Select Satatus
And   Click on "Search" Button
And   Verify the User should be in Result list.

@regression
Scenario: verifyThatAdminShouldDeleteTheUserSuccessFully
When  Login to Application
Then  click On "Admin" Tab
Then  Verify "System Users" Text
And   Enter Username
And   Select User Role
And   Select Satatus
And   Click on "Search" Button
And   Verify the User should be in Result list.
And   Click on Check box
And   Click on Delete Button
And   Popup will display
And   Click on Ok Button on Popup
Then  verify message "Successfully Deleted"

@regression
Scenario: searchTheUserAndVerifyTheMessageRecordFound
When   Login to Application
Then   click On "Admin" Tab
And    Verify "System Users" Text
And    Enter Username <username>
And    Select User Role <userRole>
And    Enter EmployeeName <employeeName>
And    Select Satatus <status>
And    Click on "Search" Button verify message "(1) Record Found"
And    Verify username <username>
And    Click on Reset Tab