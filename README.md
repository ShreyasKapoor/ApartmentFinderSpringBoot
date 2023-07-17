# Apartment Finder

This project is based on spring boot CRUD operations. 
The database contains information about apartments. The user can log in using the Google OAuth 2.0 authentication. When successful, the user will be redirected to the apartment list page.

From here, they can Edit their profile, or Book an appointment to visit the apartment. They can also manage the appointments by canceling them.

## Technologies Used

- Java 1.8
- Spring Boot (Security, Thymeleaf, JPA, OAuth, web)
- Tomcat 9
- HTML and CSS


## How to Run

To run the project, clone it to your local and run the ApartmentManagerApplication file. Then on htto://localhost:8080/ApartmentFinder, you can proceed.

## Testing

The landing page gives you the option to either log in via giving the Email-id or password or by clicking "Login with Google". This flow is an OAuth flow using Spring security. The flow will validate your credentials and if validated successfully, will redirect you to the apartment list page.

![Image 1](https://github.com/ShreyasKapoor/ApartmentFinderSpringBoot/blob/main/src/main/resources/images/photo1.png)

After you click on the "Login with Google" option, Spring Security will redirect you to authenticate yourself. 

![Image 2](https://github.com/ShreyasKapoor/ApartmentFinderSpringBoot/blob/main/src/main/resources/images/photo2.png)

Once you are authenticated, you will be redirected to the http://localhost:8080/ApartmentFinder/list page where you can find all the apartments that are there in the database. From here, you can either Edit your profile, Manage your appointments or Book an appointment

![Image 3](https://github.com/ShreyasKapoor/ApartmentFinderSpringBoot/blob/main/src/main/resources/images/photo3.png)

### Editing Profile

If you click on the "Edit Profile" option, you will be redirected to the http://localhost:8080/ApartmentFinder/edit/{userId} page. Here, you can update your password, email Address, and Contact No. Once you click the update button, a request will be sent to the controller which will update the database accordingly.

![Image 4](https://github.com/ShreyasKapoor/ApartmentFinderSpringBoot/blob/main/src/main/resources/images/photo4.png)

After successfully updating the database, you will be redirected to the apartment list page.

### Booking an Appointment

If you click on the "Book Appointment" option, you will be redirected to http://localhost:8080/ApartmentFinder/book/{apartmentid}/{userid} URL. 
Here, you can give the appointmentDate and AppointmentTime parameters. With these, and along with userId, apartmentId, and auto-generated appointmentId, the data will be saved in the database.

![Image 5](https://github.com/ShreyasKapoor/ApartmentFinderSpringBoot/blob/main/src/main/resources/images/photo5.png)

After successfully updating the database, you will be redirected to the apartment list page.

### Manage appointment

When you click on the "Manage Appointment" button, you will be redirected to http://localhost:8080/ApartmentFinder/manage/{userId} page where all the appointments that the user has booked will be listed. When you click on the cancel appointment button, the entry of that appointment will be deleted from the database.

![Image 6](https://github.com/ShreyasKapoor/ApartmentFinderSpringBoot/blob/main/src/main/resources/images/photo6.png)

