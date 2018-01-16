## quandoo-assignment

This is the web test automation project for testing http://the-internet.herokuapp.com/ website. It was built using Java 8, Selenium 3, Cucumber and Selenide frameworks [http://selenide.org/index.html ].

## Features

Project has tree feature files which represents the following scenarios:
1. Login page:
  * positive login and confirmation message text verification
  * negative login: wrong username and validation message verification
  * negative login: wrong password and validation message verification
  
2. Hovers page:
  * hover each avatar and verify username text appeared underneath
  
3. Tables page:
  * Order the Last Name column of the table Example 2 to check correct ascending/descending ordering of the entries

Feature files location:

`src\test\resources\com\quandoo\`

## Prerequisites Software/Tools

1. Java Development Kit
2. Java Runtime Environment
3. Maven [ http://maven.apache.org/ ]
4. Git [ http://git-scm.com/downloads ]
5. Chrome browser

## Installation/Running Tests

`git clone https://github.com/violettka/quandoo-assignment.git`

`cd quandoo-assignment/`

`mvn test`

## Contributors

Violeta Abramova abramova.violetta@gmail.com