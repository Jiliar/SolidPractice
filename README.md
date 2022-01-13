# SolidPractice
This project was created to apply knowledges about SOLID, Here you could watch some applications to show to applicability of SOLID using diagrams and JAVA .

### Single Responsability:

This principle establishes that a component or class must have a simple, single and concrete responsability. <br/>
This simplifies code by avoiding the existence of classes <br/> that fulfuill with several funtions, wich are difficult <br/> 
to memorize and often waste time looking for wich part of code does witch function. <br/>
A class should have only a reason to change, that is to say classes should have a high cohesion.

### Open / Closed:

This principle is that the objects and entities must be open for its extensions, but closed for modifications.
This principle is usually solved using inheritance.

### Liskov Sustitution:

Subtypes can be substituted for base types.

### Interfaces Segregation:

Clients should never be forced to depend on methods that not use. Always after create interfaces to define behaviors, <br/>
we must be sure that the classes which implements interfaces use all methods, on the other hand we should create <br/> 
interfaces a little less complex to avoid fat interfaces.

### Dependency Inversion:

This principle allow creating applications more flexible, that's to say, applications that we can extend easily. <br/>
The entities must depend on abstractions and not concretions. This definition establishes that a high level module <br/>
shouldn't depend on a low level module, else it must depend on abstractions.