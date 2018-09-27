# Gym Project

This Project is based on an Online Coaching/Gym, which allows the user to create a profile as either a Member or a Trainer and perform subsequent actions based on this.

### Prerequisites

For this project, I used the "Intellij IDEA" IDE environment, which allowed me to write the programme and conduct the relevent tests required.

### The Project Contents

This project has 8 "Core" classes, "Assessments", "GymAPI", "Member", "MenuController", "Person", "PremiumMember", "StudentMember", and "Trainer". "Trainer" and "Member" are Sub-Classes of "Person", and "PremiumMember" and "StudentMember" are Sub-Classes of "Member". The programme allows the user to create a profile as either a Member of the gym or a Trainer. Depending which they choose, different actions become availible to the new User. In the case of a Member, some personal information is required, such as a Name, Email, Address, Height, Height, Gender etc. After logging in, a Member is able to do the following;
- View thier Profile 
- Update their Profile
- View their Progress 

In the case of a Trainer, some basic info is also required, including Name, Email, Address, Gender, and Training Speciality. A Tainer is then able to do the following;
- Add a new Member to their roster
- List all of the Members on their roster
- List all of the Members on their roster with an Ideal Bodyweight
- List all of the Members on their roster with a Specific BMI
- Search the Members on their roster by Email
- Add a Member Assessment
- View sorted Assessments of a specific Member

## Tests

I have included 3 JUnit tests in this project;
AssessmentTest;
      This Test checks the setting up of a new Assessment, and then ensures the Getters and Setters within the class work by returning the expected values.

StudentMemberTest;
      This Test checks the setting up of a new StudentMember, and then ensures the Getters and Setters within the class work by returning the expected values. It also ensures the "toString" function prints the data in a user-friendly format.
      
TrainerTest;
      This Test checks the setting up of a new Trainer, and then ensures the Getters and Setters within the class work by returning the expected values. It also ensures the "toString" function prints the data in a user-friendly format.
      

## Built With

* [Intellij IDEA](https://www.jetbrains.com/idea/) - The IDE environment used
* [Github](https://github.com/) - Version Control System used


## Authors

* **Daniel Collins**

This was a solo project completed as part of my studies in the WIT I.o.T Degreee
