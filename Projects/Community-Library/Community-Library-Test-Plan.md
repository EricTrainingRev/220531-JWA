# Test Plan

### Technologies to be used
- Java
- Maven
- Hibernate
- AWS RDS (Postgres)
- Selenium
- Cucumber
- Junit
- HTML
- CSS
- JavaScript

### Entities Tracker
Books:
- Id (int) (primary identifier)
- Title (String)
- Author (String)

#### User Stories and associated unit/service tests
- As a user I want to take a book so I can read it
    - Unit tests
        - remove book from database
            - method: removeBook()
        - see available books in database
            - method: getAllBooks()
    - Service tests
        - N/A
- As a user I want to edit a book so I can correct a mistake
    - Unit tests
        - update book in database
            - method: updateBook()
    - Service tests
        - J. R. R. Tolkien is not allowed
            - method: checkBookForTolkien()
- As a user I want to give a book so I can give back to the community
    - Unit tests
        - add book to database
            - method: addBook()
    - Service test
        - Books should have unique identifiers
            - method: addBook() **database will handle this**
        - J. R. R. Tolkien is not allowed
            - method: checkBookForTolkien()


