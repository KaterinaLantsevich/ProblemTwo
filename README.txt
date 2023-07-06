STEP 1: Open a terminal and navigate to the root directory of the project. Build the project using this command:

mvn clean package

STEP 2: Once the build is successful, execute the application using the Maven Exec Plugin:

mvn exec:java -Dexec.mainClass="org.example.Main"

This command will launch the application using the specified Main class.
By using the Maven Exec Plugin, it will automatically handle the classpath and dependencies,
ensuring that the necessary libraries (including Selenium WebDriver) are available during execution