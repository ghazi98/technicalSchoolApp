# technicalSchoolApp
This repository will host my technical school application that I created using JAVA during my Programming 2 class at Auckland University of Technology.

# Technical School Application

This project focuses on creating a technical school application in Java to determine whether or not a student is certified, their transcript is checked against a certification criterion. I will develop classes to store data for modules, students, and their transcripts.

# Methodology

I will provide an outline of eight classes that contain the core functionalities of the technical school app: Grade, ModuleType, Level, Module, Student, Result, TechnicalSchool, and StudentEvaluation. The relationships between classes are described below using a UML Class Diagram.

<img width="378" alt="image" src="https://user-images.githubusercontent.com/61443806/147510967-3f9a3743-4b8a-4ef5-9852-5c7cb15c8dc5.png">

# Creating enumerated types

1. I created an enumerated type Grade, which maintains:
# A list of Grade values with associated boundaries for each mark:
- 100% ≥ A+ (APLUS) ≥ 90%
- 90% > A ≥ 85%
- 85% > A- (AMINUS) ≥ 80%
- 80% > B+(BPLUS) ≥ 75%
- 75% > B ≥ 70%
- 70% > B- (BMINUS) ≥ 65%
- 65% > C+ (CPLUS) ≥ 60%
- 60% > C ≥ 55%
- 55% > C- (CMINUS) ≥ 50%
- 50% > D
# Encapsulated instance variables (for each Grade):
- Two integer variables indicating the range of each letter grade
- A Boolean variable to indicate if the grade is a pass (greater than or equal to 50%).
- isPass() method, which returns true if the Grade is a pass and false otherwise.
- A constructor with input for all instance variables to initialize Grade objects.
2. Created an enumerated type ModuleType, which maintains four values corresponding to the type of modules available: SELF_STUDY, TAUGHT, PROJECT, and CLIENT_PROJECT.
3. Created an enumerated type Level containing three-level values: ONE, TWO, THREE.

# The Module Class
I created a Module class which:
- maintains instance variables for type, title, code, and level. All instance variables are private with get and set methods.
- has one constructor with input for all instance variables to initialize Module object.
- overrides the toString method to return a beautiful text representation.

# The Technical School class
The TechnicalSchool class maintains the Semester 1 Module Offerings T based on the following table:
<img width="378" alt="image" src="https://user-images.githubusercontent.com/61443806/147511712-50c9e07a-c400-4ff7-8222-0cd9c79367b1.png">

- maintains a private instance variable Module[] offerings which stores the Semester 1 Modules based on Table 1.
- has a method private static Module[] semesterOneModuleOfferings(), which returns a primitive array populated by 13 Module objects, corresponding to each row of the table.
- create a default constructor TechnicalSchool() instantiates the offerings variable with appropriate Module objects comes from semesterOneModuleOfferings()
(i.e. this.offerings = TechnicalSchool.semesterOneModuleOfferings())
- has a get method for offerings variable.
- has a public Module lookup(String code) method to search the offerings array and return a module with the matching code.

# The Result class
The Result class:
- stores Module and Grade objects.
- has an appropriate constructor to initialize both instance variables.
- has get and set methods.
- has a toString method to represent the result object.

# The Student class
The Student class:
- maintains an array of results, called a transcript.
- declares:
- a student name,
- a private final static integer variable that sets the maximum size of the array (e.g., MAX_TRANSCRIPT_LENGTH = 20)
- an instance variable called numberOfResults, which maintains the number of results available for the student.

# Student class methods
- a constructor initializes name (using input parameter) and transcript as a new array
- public void addResultToTranscript(Module module, Grade grade), which creates a Result object and adds it to the end of the transcript and updates numberOfResults. If the transcript is already full, do not add the result.
- public Result[] getTranscript() which returns an array of Result objects. The returned array should not contain any null entries; e.g., it is of length numberOfResults.

# Certification Algorithm
The certification algorithm is a method (i.e., isCertified method) in the TechnicalSchool class. It takes a Student object as an input and examines his transcript to determine if he is certified, according to the following criteria:
- at least three modules passed at level 1, either taught or self-study AND
- at least three modules passed at level 2, more than one must be self-study AND
- at least four modules passed at level 3, at least two must be taught AND
- at least one project module passed (either of project or client project).
- if the student satisfies ALL of the above four criteria and false otherwise.

# The StudentEvaluation Class
StudentEvaluation class contains:
- the main method to run my application
- four static methods. Each method returns a Student object populated with results from the Transcript Tables below. To test and demonstrate my implementation of the certification algorithm, I need to print out the result for students Robin, Kate, Axel, and Jim. I also need to provide more examples of students to show the functionality of my code.

<img width="378" alt="image" src="https://user-images.githubusercontent.com/61443806/147512128-b17a2eb3-2f3a-4ecd-91e5-177d1164b3ea.png">
