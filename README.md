# DesignPatternsJava

The most important thing when studying design patterns is to understand the actual motivation of the pattern, and when it should be applied.

Implementations are less important because they can vary. The important thing is to solve the problem in an elegant way, using the idea behind the standard as a guide in the implementation. A very common statement about design patterns is that you apply them a thousand times, and a thousand times you end up with a different implementation of the same pattern.


## Infrastructure

* JUnit 5
* Java 8
* Eclipse Java EE IDE for Web Developers. [Version: Oxygen.2 Release (4.7.2)]

### Strategy

The Strategy pattern is very useful when we have a set of similar algorithms, and we need to switch between them in different pieces of the application. In the video example, we have different ways of calculating the tax, and we need to switch between them.

Strategy gives us a flexible way to write several different algorithms, and pass these algorithms on to client classes that need them. These clients are unaware of the "real" algorithm that is running, and just have the algorithm run. This causes the client class code to be quite decoupled from the concrete implementations of algorithms, thus enabling this client to be able to work with N different algorithms without having to change its code.

### Chain of Responsability

The Chain of Responsibility pattern falls like a glove when we have a list of commands to execute according to some specific scenario, and we also know which next scenario should be validated if the previous scenario does not satisfy the condition.

In such cases, the Chain of Responsibility enables us to separate responsibilities from small and lean classes, and provides a flexible and uncoupled way to bring these behaviors together again.

### Template Method

When we have different algorithms that have similar structures, the Template Method is a good solution. With it, we were able to define, at a more macro level, the structure of the algorithm and leave "holes", which will be implemented differently by each of the specific implementations.

In this way, we reuse rather than repeat code, and we facilitate possible evolutions, both of the algorithm in its macro structure, and of the details of the algorithm, since each class has its responsibility quite separate.
