Spring Container Configuration without XML
==========================================
Very simple proof of concept application demonstrating how to configure a Spring IoC container using plain Java classes and annotations instead of XML.

References
==========
* http://blog.springsource.org/2011/06/10/spring-3-1-m2-configuration-enhancements/
* http://static.springsource.org/spring/docs/3.1.x/spring-framework-reference/html/new-in-3.0.html#new-java-configuration
* http://static.springsource.org/spring/docs/3.1.x/spring-framework-reference/html/scheduling.html
* http://static.springsource.org/spring/docs/3.1.x/javadoc-api/org/springframework/scheduling/annotation/EnableScheduling.html

Running
=======
$ mvn test
$ mvn exec:java -Dexec.mainClass=net.degiere.scheduler.Demo

