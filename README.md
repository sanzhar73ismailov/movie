# Programming Tasks
These tasks consist of several aspects of programming that might be useful as an entry level for an interview.

# Task Description and Requirements
The goal of this task is to create a movie recommender system. The basic description of the system is provided below:

The application is a catalog of movies of different genres. 
Each movie has a title, description, film director, list of actors, and image(s) from the main playbill. 
Each movie is categorized into one or more genres. 
Only the administrator can create, remove and update the list of movies. 
Users can rate the movies according to different criteria (e.g, how novel are the ideas 
of the movie, their final score, etc.). 
The main feature of the system is that users can pick one movie and get the list of similar movies and/or 
movies that were liked the most by other users watching the same movie (no need for complex algorithms, 
some simple recommendation is enough!).

**The project requirements**:

*For backend*:
- Design and implement a database (provide figure of ERD, DDL and DML scripts of that -- consider creating 
  a database role for an application accessing that database, insert suitable amount of data).
- Design and implement a backend service (on top of the database).
  - The backend should be separate for data layer, service layer, and rest layer (if needed add more layers).
  - If possible document REST API appropriately (e.g., using Swagger).
  - If possible integrate a suitable security of the created API (e.g., using Single-sign on).
  - Discuss, how the video files can be effectively stored.
- Implement automated tests to verify the functionality (consider corner cases).

*For frontend*:
- Design a mockups of the system (screens with application possible look-in).
- Choose appropriate libraries/frameworks for the system.
- If the system is without the backend service, create a "mockup server" that will return appropriate data.
- Implement a service (focus on design, responsivity, meaningful routes, etc.).
- If possible integrate a security to the system (e.g., Single sign-on).

*Optional*:
- Integrate the GitLab/GitHub CI/CD.
- Use containerization via Docker-compose or Kubernetes to run the developed platform.

**The project delivery**:

Submit the URL to the Git repository where your solution is placed.
