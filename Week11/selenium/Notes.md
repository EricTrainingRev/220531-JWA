# What is in this example?
- How to use the WebDriverManager Class
- Example use of the Actions API
- How to take a screenshot with Selenium
- How to upload a file to an input with the type "file"
- How to set up your Runner class so that it only runs during the integration-test step of the "verify" build phase, not the "test" phase

### WebDriverManager
[Homepage for WebDriverManager](https://bonigarcia.dev/webdrivermanager)
```xml
<!-- this dependency will give you access to the WebDriverManager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.2.3</version>
    <scope>test</scope>
</dependency>
```
```java
// pick one, call it in your setup method, and then instantiate your driver
WebDriverManager.chromedriver().setup();
WebDriverManager.firefoxdriver().setup();
WebDriverManager.edgedriver().setup();
WebDriverManager.operadriver().setup();
WebDriverManager.chromiumdriver().setup()
WebDriverManager.iedriver().setup();
```
You can now use your driver without having to manually download it or set System Properties

### Actions API
The [Actions API](https://www.selenium.dev/documentation/webdriver/actions_api/) provides a means for more fine-tuned control over Selenium's interactions with the web page. This tool can be useful when you have specific use cases, like needing to wait a moment before an action is taken, actually scrolling to where the web element is located and placing the mouse over the element, performing a copy and paste action, etc. There are 3 main interfaces the Actions API allows for fine tune control over:
- Keyboard inputs
    - note that this simulates the inputs directly, you must manually ensure that the key inputs are being applied to the correct element
- Mouse inputs
    - Pen inputs are included in this
- Scrolling inputs

You can perform many of the same actions you could do with regular WebElements, but with the Actions API you can chain multiple actions together (such as entering text into an input and then pressing a submit button)

### Using Selenium to take a screenshot
Taking a screenshot with Selenium is not hard to code, but due to the fact you are creating/saving files you will have to handle the IOException, which is a checked exception. Therefore, your code is going to look something like this when you want to take a screenshot:
```java
try{
    /*
        the line below typcasts the driver to a TakesScreenshot object to gain access to the getScreenshotAs()
        method. This saves the data we need so we can convert it to an image file
    */
    File screenshotData = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    /*
        the FileUtils.copyFile() method takes in two arguments: the file data, and the location where you want to
        save the file. Note that you don't have to save it as a png, you can choose your preffered image type
    */
    FileUtils.copyFile(screenshotData, new File("path/to/file/file-name.png"));
} catch(IOException e){
    // handle exception here
}
```
### How to upload files to the file input
When working with inputs of the "file" type you can simply use the sendKeys() method and the path to the file you want to upload. Note that if you try using the Actions API to upload a file you will end up opening the file explorer where you can select the file you want to upload, which is not a window that is part of the browser. Selenium can not interact with this window, so stick with using sendKeys() via the WebElement directly.

### How to set up runner so it only runs during "verify" phase
As long as you add the Maven Failsafe plugin to your POM and follow the naming conventions it requires you can keep
your runner from being executed during the "test" build phase and make it so it is executed during the "verify" build phase, which is more propper.
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-failsafe-plugin</artifactId>
    <version>3.0.0-M7</version>
        <executions>
            <execution>
                <goals>
                    <goal>integration-test</goal>
                    <goal>verify</goal>
                </goals>
            </execution>
        </executions>
</plugin>
```
The failsafe plugin looks for classes with the following naming conventions:
- IT*.java
- *IT.java
- *ITCase.java

The exception to this rule is if you try naming your runner TestRunnerIT.java: the maven surefire plugin looks for TestRunner to execute unit tests, which will cause your E2E tests to be executed in the wrong phase if you try naming your runner TestRunnerIT.java (note you can configure the surefire plugin to ignore TestRunnerIT.java, but it is easier to just avoid the name altogether when using a runner class for your E2E tests)
- TestRunnerIT.java
    - tests will run with "mvn test" command
- ITTestRunner.java
    - tests will run with "mvn verify" command