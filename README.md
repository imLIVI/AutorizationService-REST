# AutorizationService-REST

## Task #1, #2
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

## Task #3
### Description
Write an NGINX configuration that will return a static site. You can use it to access your authorization service from your last homework assignment.

1. First you need to create an html form for authorization, which NGINX will return to you. You need to put this file in the appropriate folder, from where NGINX will be able to pick it up.
```html
<html>
    <body>
        <h1>Sign in form</h1>
    
        <form action="/authorize" method="get" target="_blank">
          <label for="user">User name:</label>
          <input type="text" id="user" name="user"><br><br>
          <label for="password">Password:</label>
          <input type="text" id="password" name="password"><br><br>
          <button type="submit">Submit</button>
        </form>
    </body>
</html>
```
2. You need to write the configuration for NGINX so that it when called http://localhost/signin he returned this html page to you, and he proxied everything else to your Spring Boot application, which runs on port 8080.

What you write in the configuration, add to a text file (any file format, for example, txt) in your project with the authorization service, upload to your repository and send a link to the repository.

 ### Results
 1. Add index.html

![image](https://user-images.githubusercontent.com/63547457/233652316-4cd5007b-533a-47c8-87c8-36420c45ce19.png)

2. Install <a href="https://nginx.org/ru/docs/windows.html">nginx for Windows</a>
3. In nginx-1.23.4\nginx-1.23.4\conf\nginx.conf writed:


![image](https://user-images.githubusercontent.com/63547457/234314696-e149e5c0-0587-4f06-9de1-3993be2aa2e0.png)

4. As a result get authorization form when write http://localhost/signin:

![Screenshot_2](https://user-images.githubusercontent.com/63547457/233652995-f7938f8b-e086-4715-9dec-2bf612a35a22.png)

P.S. 
* To monitor nginx processes: ```tasklist /fi "imagename eq nginx.exe"```
* To start nginx: ```start nginx```
* To reload: ```nginx -s reload```
* To quit: ```nginx -s quit```
