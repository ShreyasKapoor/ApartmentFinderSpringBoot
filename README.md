# Apartment Finder

This project is based on spring boot CRUD operations. 
The data base contains information about apartments. The user can login using the Google OAuth 2.0 authentication. When successful, the user will be redirected to the apartment list page.

From here, they can can Edit there profile, or Book an appointment to visit the apartment. They can also manage the appointments by canceling them.

## Technologies Used

- Java 1.8
- Spring Boot (Security, Thymeleaf, JPA, OAuth, web)
- Tomcat 9
- HTML and CSS


## How to Run

To run the project, clone it to your local and run the ApartmentManagerApplication file. Then on htto://localhost:8080/ApartmentFinder, you can proceed.

## Testing

The landing page gives you option to either login via giving the Email-id or password or by clicking "Login with Google". This flow is an OAuth flow using Spring security. The flow will validate your credentials and if validated successfully, will redirect you to the apartment list page.

![Image 1](/ApartmentFinder/src/main/resources/images/photo1.png)