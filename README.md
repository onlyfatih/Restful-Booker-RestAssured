# API Test Project

This project is developed using **RestAssured** and **Cucumber** with **Java** language on **IntelliJ IDEA**, to test the hotel reservation creation and cancellation processes on the Restful Booker website.

## Project Content

The project is designed to perform the following scenario:
Scenario: As a User, I can create a hotel reservation

    Given a user creates a new reservation.
    When the user enters the necessary information for the reservation.
    And the user creates the hotel reservation.
    Then the successful creation of the reservation is confirmed.
    And the user cancels the created reservation.

## Installation

This project requires Java 8 or higher Java Development Kit (JDK). Internet connection may be required.
Download and install IntelliJ IDEA or your preferred Java IDE.
Download this project from GitHub or copy the source code.

## Project Structure

The project consists of the following files and folders:

- src: The folder where the source code is located.
    - test: The folder containing test scenarios and helper classes.
        - java: The folder containing Java classes.
            - steps: Cucumber step definitions where the scenario steps are implemented.
            - runners: Test runner classes used to run Cucumber scenarios.
        - resources: The folder containing Cucumber feature files for test scenarios.
- pom.xml: Maven project configuration file.

## How to Run

1. Open IntelliJ IDEA.
2. Use "Open" or "Import" options to open the project and select the directory where the project is located.
3. Wait for Maven dependencies to be automatically loaded.
4. To run the test scenarios, find and run the Cucumber test runner classes in the `src/test/java/runners` folder.
5. Check the validity of the scenarios and view the test results.

## Notes

- Make sure you have internet access to reach the Restful Booker website before running the scenarios.
- Redirecting to the Restful Booker website and logging in are not included in the scenarios. Ensure that these steps are performed before the scenarios.

This README file is prepared to explain the usage of the API Test Project. For more details about the project, you can refer to the source code and documentation.

