# Software Developer Engineer in Test - Test Automation Engineer

### 1. AUTOMATED TEST SUITE
Using your preferred language/framework, create a test suite that
automatically validates that [WordCounter](https://wordcounter.net/) correctly displays:
- number of words
- number of characters
- The 3 most repeated words with the number of repetitions (Keyword
Density section)

You're free to create as many scenarios as you think are necessary to cover
those three points. It's mandatory to generate a summary report showing how
many scenarios were executed, how many passed, and how many failed with it's
error description.
Requirements

- You don't need to modify any settings in the website, always use the
default settings.
- Ask as many questions you have in order to clarify the scope of your
tests. 

Feel free to contact us or be sure to detail any assumption you
made. (Limit your questions to a single mail please)
For 1st and 4rd points:

- Upload your project to a GitHub repo and share it with us. 
- Provide detailed instructions on how to run your project (preferably also in the repo).

#### 1.1. AUTOMATED TEST SUITE - SOLUTION

Lumu Technologies is a project that developed the technical test presented in the previous paragraph.

In order to use best practices, the screemplay pattern was used, creating a single test scenario that encompasses all the test cases presented in the requirements.



#### 1.2. INSTALLATION

The development should be focused on the use of **Linux** OS or **Unix** based systems, to make the installation of the dependencies effective and ensure the operation of the project in any **development**, **testing**, and **production** environment.

For **Windows** operating systems based on version **11**, the installation of the project is performed with these steps:

1. First install [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) as the base programming language of this repository, install [Maven 3.8.6](https://maven.apache.org/download.cgi) and create the environment variables for each of the above tools.
   To test the installation you should run the following commands in your preferred command terminal.
```sh
$ java --version
$ mvn --version
```
### 1.3. How to run the tests?

Following these steps, we can perform the execution of the test suite or a specific feature:
```sh
$ mvn clean test verify
$ mvn clean verify -Dcucumber.filter.tags=@nombreTag
```
