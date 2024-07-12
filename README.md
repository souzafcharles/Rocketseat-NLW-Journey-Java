![GitHub language count](https://img.shields.io/github/languages/count/souzafcharles/Rocketseat-NLW-Journey-Java)
![GitHub top language](https://img.shields.io/github/languages/top/souzafcharles/Rocketseat-NLW-Journey-Java)
![GitHub](https://img.shields.io/github/license/souzafcharles/Rocketseat-NLW-Journey-Java)
![GitHub last commit](https://img.shields.io/github/last-commit/souzafcharles/Rocketseat-NLW-Journey-Java)


# :coffee: Rocketseat Course: NLW Journey | Java

:triangular_flag_on_post: Fernanda Kipper - Software Enginner @Itáu, Microsoft MVP

:white_square_button: IDE used: IntelliJ IDEA 

:coffee: Java version: :two::one:

---
### Lesson 1: Plann.er

### About the Project

> The Journey project aims to assist the user in organizing business or leisure trips. Users can create a trip with a name, start and end dates. Within the trip, users can plan activities to be carried out each day.
> 

## Requirements

### Functional Requirements

1. The user registers a trip by providing the destination, start date, end date, guest emails, their full name, and email address.
2. The trip creator receives an email to confirm the new trip via a link. Clicking the link confirms the trip, sends confirmation emails to guests, and redirects the creator to the trip page.
3. Guests, upon clicking the attendance confirmation link, are redirected to the application where they must enter their name (in addition to the pre-filled email) to confirm their attendance.
4. On the event page, trip participants can add important links such as Airbnb reservations, places to visit, etc.
5. Additionally, on the event page, both the creator and guests can add activities planned during the trip with titles, dates, and times.
6. New participants can be invited within the event page via email and must go through the confirmation flow like any other guest.

## Creating the Project

### Trip Entity

```json
    "destination": {
      "type": "string",
      "minLength": 4,
      "description": "The destination of the trip."
    },
    "starts_at": {
      "type": "string",
      "format": "date-time",
      "description": "The start date and time of the trip in RFC 3339 format."
    },
    "ends_at": {
      "type": "string",
      "format": "date-time",
      "description": "The end date and time of the trip in RFC 3339 format."
    },
    "emails_to_invite": {
      "type": "array",
      "items": {
        "type": "string",
        "format": "email"
      },
      "description": "A list of emails to be invited to the trip."
    },
    "owner_name": {
      "type": "string",
      "description": "The name of the trip owner."
    },
    "owner_email": {
      "type": "string",
      "format": "email",
      "description": "The email of the trip owner."
    }
```

- [X]  Create project using [Spring Initializr](https://start.spring.io/)
    - Spring Web
    - Flyway
    - Dev Tools
    - Lombok
    - JPA
    - H2 Database
- [X]  Configure database in the application
- [X]  Create migration for `trips` table creation
    - Migration files represent changes to our database structure
        - create a table
        - alter table, remove field, add a field
        - install driver
        - bulk data insertion, default data
    - Migration files ⇒ SQL scripts, run commands in the database
- [X]  Create entities representing a `Trip`
- [X]  Create repository for the trip entity
- [X]  Create endpoint for trip creation **`POST /trips`**
- [X]  Create endpoint for trip retrieval **`GET /trips/{tripId}`**

##
### Lesson 2: Plann.er

In that lesson, we implemented the remaining functionalities for trips and participant registration and confirmation.

- [X] Create endpoint for trip update **`PUT /trips/{tripId}`**
- [X] Create endpoint for trip confirmation **`GET /trips/{tripId}/confirm`**
- [X] Create `Participant` table
- [X] Create entity representing a `Participant`
- [X] Create repository for the participant entity
- [X] Create endpoint for participant confirmation **`POST /participants/{participantId}/confirm`**
- [X] Create endpoint for inviting participant **`POST /trips/{tripId}/invites`**
- [X] Create endpoint for querying participants **`GET /trips/{tripId}/participants`**
##
### Lesson 3: Plann.er

In this lesson, we will implement all functionalities related to trip activities and links:

- [X] Create `Activities` table
- [X] Create entity representing an `Activity`
- [X] Create repository for the activity entity
- [X] Create endpoint for activity creation **`POST /trips/{tripId}/activities`**
- [X] Create endpoint for querying activities of a trip **`GET /trips/{tripId}/activities`**
- [X] Create `Links` table
- [X] Create entity representing a `Link`
- [X] Create repository for the link entity
- [X] Create endpoint for link creation **`POST /trips/{tripId}/links`**
- [X] Create endpoint for querying links of a trip **`GET /trips/{tripId}/links`**

## Additional Features

- [X] Add validation for date fields
    - [X] Start date of the trip must be before end date of the trip
    - [X] Activity date must fall within the trip dates
    
    **Example:**
    Trip from July 20th to July 25th in Rio de Janeiro
    
    ⇒ Activity on July 19th
    
    ⇒ Activity on July 21st
    
- [X] Extract core trip logic into a Service class
- [X] Map exceptions within our application with custom error handling
      
##
### :scroll: [Certificate of participation](https://github.com/souzafcharles/Rocketseat-NLW-Journey-Java/blob/master/CERTIFICATE.pdf)
##
# More Information :link: [Rocketseat | NLW Journey ](https://www.rocketseat.com.br/eventos/nlw)
