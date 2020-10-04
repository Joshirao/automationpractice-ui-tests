@automationpractice
Feature: Scenario to verify the Automation Practice Page
Background:
   Given I open the automation practice homepage
  @add_popular_product
  Scenario: I want to be able to navigate to Automation Practice and add a product to cart from popular
    When I add first product under popular to cart
    And I click on continue shopping
    Then the product should be displayed

  @add_discounted_product
  Scenario: I want to be able to navigate to Automation Practice and add a discounted product to cart from bestseller

    And I add any discounted product under bestseller to cart
    Then the discounted price should appear in cart

  @place_order
  Scenario Outline: I want to successfully place an order on a product

    When I add first product under popular to cart
    And I click on Proceed to checkout
    And sign in with <username> and <password>
    Then address page is displayed
    And I click on Proceed
    Then shipping page is displayed
    And I agree to terms and Proceed to checkout
    Then payment page is displayed
    And I click on pay by check and confirm my order
    Then order is successfully placed

    Examples:
    |username              | password    |
    |Tester.one@gmail.com  |Password12345|

  @empty_cart
  Scenario: Cart is empty message is visible when no product is added to cart

    When I click on cart without adding any product
    Then the cart is empty message is displayed

  @login_negative
  Scenario Outline: Login should not be successfull when email or password is invalid

    When I click on sign in
    And sign in with <username> and <password>
    Then I see <errormessage>

    Examples:
    |username             | password     | errormessage             |
    |Tester               |Password12345 |Invalid email address.    |
    |Tester.one@gmail.com | pa           |Invalid password.         |
    |Tester.one@gmail.com |              |Password is required.     |
    |                     |Password12345 |An email address required.|
    |Tester.two@gmail.com |Password12345 |Authentication failed.    |


