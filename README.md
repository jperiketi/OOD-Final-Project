Patterns :
1. Repository pattern
● I have created one Repository Service using Repository pattern which helps in accessing complex API operations when using Spring Data.
It restrcits us to work directly with the data in the application and creates new layers for database operations, business logic, and the application's UI.
● It is used between database layer and api layer.

2. Singleton pattern
● It is a design pattern that restricts the instantiation of a class to one object. 
● I have acheived this pattern while using dependency injection for FanService in Fancontroller class which follows Singleton pattern.
● It represents database tables/Mongo Collection. 

3. Prototype pattern
● I have created  one Rest controller which traps all the incoming web requests and map accordingly based on given request URI path
It is a creational design pattern in software development. It is used when the type
of objects to create is determined by a prototypical instance, which is cloned to
produce new objects.
● It is a controller that we use out of api's.

4. Factory Method pattern
● The repository object that persists in MongoDB is a factory design pattern
● It is a creational pattern that uses factory methods to deal with the problem of
creating objects without having to specify the exact class of the object that will be
created.
● It creates the records based on the api calls. 

5. Proxy pattern
● DataRepository interface follows proxy pattern and helps in accessing MongoRepository methods.
● It is a software design pattern. A proxy, in its most general form, is a class functioning as an interface to something else.
● For creating repository patterns this helped.

6. Command Pattern.
I have created CeilingFanHigh object which uses command pattern to identify which object will execute bases on the type of command.
