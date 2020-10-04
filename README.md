#  Automation Practice Tests

The chromedriver.exe should be placed in the path /usr/local/bin/chromedriver as mentioned in POM.XML to run the tests

## Tests
              
The feature files for the tests can be found at: ```src/test/resources/features``` 

## Running the tests

To run the tests you can execute the following commands from the `/automationpractice-ui-tests` directory

**Tests**:

```clean verify "-Dcucumber.options=--tags @automationpractice"```
## Reports

Once execution has completed a report will be available at: ```/target/site/serenity/*.html```
