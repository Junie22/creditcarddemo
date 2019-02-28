This project uses two concepts: 

1. REST API & Polymorphism


The first step was to add Jax-rs or specifically jersey archtype to the list of archtypes since it doesnt come added int. 
the second was to create a project from that archtype. 

then... once the default project is created, run it as is.. and you should get the index page on startup. 

Check if the link to myresource is working. It should. 

then add your own REST API and then get mad from there. 

Used the concept of polymorphism through the credit card exmaple. 

There is this CreditCard Interface that has 2 functions which basically should be implemented by any 
concrete class -> here MasterCard and VisaCard. 

The CardDetails is a model class in itself that holds the data for any kind of card. 
I pass the creditcard type to the service layer where it calls the appropriate implementing class. 
the code down the line is agnostic of which kind of card i have actually created or been passed by the user
from the REST API layer. 
Thats how polymorphism is in play here. 
