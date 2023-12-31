# University Management System
## Classes
### Person
A class with 3 attributes: ID, First Name and Last name; the methods are basic (getters, and a joinEvent method that will be explained later)
#### Student
A class that inherits from Person, each student will have a level, timetable, he will be enrolled in groups and clubs.
A student will be able to join / leave groups and clubs, join courses and pass exams
#### Employee
An Employee is also identified by his salary and the year he joined the university
##### Teacher
A class that inherits from Employee, each a professor is specialized in a subject, and leads multiple courses

### Level
Each level is identified by an ID, a Number, a Speciality, and A duration (e.g. 2 Semesters), a list of exams and a list of students
### Course
Each course is identified by its name, its teacher, students, its subject and the classroom where the course will have place.
Each course has a mark given to as= student when he attends it
### Exam
Each exam is identified by its subject, the level that can pass it and and average mark that is based on old statistics

### Club
Each club is identified by its ID, its name, its foundation year, the activity, and a list of the students that are members of this club
Every time a student joins the club, this list will be updated
### Group
Each group has an ID, a Name, and a list of students that members of this group
The features are the same as a club
### Event
An event is identified by its title, date, place, the organizer club, and the list of its attendees
Every person can join the event
Every time a person joins the event the list of attendees is updated
