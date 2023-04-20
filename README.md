# AutorizationService-REST
### Description
It is necessary to implement a service for user authorization by login and password. The key is the program's response to errors that your service will throw out in 
different cases.


#### Requirements for error handlers:
1. On ```InvalidCredentials```, it must send back to the client the HTTP status with the code 400 and the body in the form of an exception message;
2. On an ```UnauthorizedUser```, he must send back to the client the HTTP status with the 401 code and the body in the form of a message from exception and write a
 message from exception to the console.
 
<a href="https://github.com/netology-code/jd-homeworks/tree/master/spring_boot_rest"> (RUS version of description)</a>
 
 ### Results
_Request:_ ```GET localhost:8080/authorize?user=<ИМЯ_ЮЗЕРА>&password=<ПАРОЛЬ_ЮЗЕРА>```

**Check 1: **

![Screenshot_1](https://user-images.githubusercontent.com/63547457/233495282-a3288b93-a093-4bb3-9f01-ffc5bbc60590.png)

**Check 2: **

![Screenshot_2](https://user-images.githubusercontent.com/63547457/233495349-435e2d56-3066-457f-9ee5-4e5e41813364.png)
