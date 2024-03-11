# SDM Lab sockets


1. Write a program MyServer and a program MyClient communicating through TCP sockets. Both programs use the same port number and the customer uses the address "localhost" to connect to the server that is on the same machine. The server is always ready to connect to a client. The server is notified when the connection with the client is established and prints this message: "Connection accepted:" + socketName. 

While connection is up the server reads line by line the data sent from the client, prints them on console and sends them to the client. The end of the program is notified by the client by sending "END" message. 

Test the program with the following scenario:

When the client connects, it writes "socket =" + socketName and then sends 10 lines of text "I am " + rowNumber. After each send operation the client reads the response from the server and prints it (so each message should be printed twice - once in the server, once in the client). At the end send "END" to end the transmission. 



2. Partially reusing the code of the previous exercise, write a program for a client / server system that delivers services to more customers at once. Customers are simulated by an object of  a class MultiClients that uses thread‐objects belonging to another class MonoClient that access the server and behave as in the previous problem.
