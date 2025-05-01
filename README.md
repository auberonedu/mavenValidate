sdev334
coder: Jonathan Sule
project: install and validate Maven framework
date: April 30, 2025

# mavenValidate

A repo to test your installation of Maven.

Please validate that the below work. If things aren't working, see the Notes section.

## Validation Steps

1. Run the code with the below command works. If it's working properly, you should see a graph show up.
    ```
    mvn exec:java
    ```
1. Run the tests with the below command works. If it's working properly, you should see test results in the terminal.
    ```
    mvn test
    ```
1. Run the code with the play button in the top right of the VS Code window when App.java is open. You may also be able to do it if a "Run" button appears above the main method.
1. Run the tests with the testing side panel in VS Code.

## Notes
1. Do not worry about any warning messages so long as it all works
1. The extensions may take a long time to begin recognizing everything.
1. There is a fair amount of data that will be downloaded the first time you run each of the commands.
1. If the `mvn` commands aren't working in VS Code's built in terminal, try them in a separate terminal.
1. If the VS Code testing panel doesn't work, that's ok so long as `mvn test` works
1. If the run button doesn't show up in VS Code, that's OK so long as `mvn exec:java` works