## Spock Testing for Kotlin Project
This project is created to explain how spock specification kind unit testing could be done in a kotlin project.

### Technology that we used
1. Gradle
2. Groovy for Testing
3. Kotlin

### How it Works
Clone the project and have a look to the TestableSpec. You will see a test specification class which is written in Groovy.
If you open the terminal and type command ```gradle test -i``` this will run all test function in the specification.
If you run ```gradle -Dtest.single=Testable test -i``` this will run only the TestableSpec. You can also create a `test`
task in your build.gradle to manage your test individually, this could be helpful if you want to distinguish unit and 
integration specs.

### Why Spock
* Easy and takes less time to create a test. (Comparison of JUnit and some mocking framework).
* It comes mocking, spying, and stubbing out of the box. 
* BDD(Behavior driven development) like, that makes your test even more clear.
* Perfectly works with Groovy syntax. Use closures, straightforward maps, iterate with various inputs combination on ```where``` block.

Note: You can still write jUnit test under test.kotlin folder. It is possible to test your units with both framework.

[more about spock](http://spockframework.org/)
