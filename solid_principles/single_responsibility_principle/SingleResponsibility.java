package solid_principles.single_responsibility_principle;
// Single responsiblity principle states that a class should have only one responsibility. 
// By having only one responsibility, the code becomes easier to debug and understand

// consider the student class. It has 3 responsibilities. So it violates the Single responsibilty principle.
class Student {

    public void registerStudent() {
        // some logic
    }

    public void calculateStudentResults() {
        // some logic
    }

    public void sendEmail() {
        // some logic
    }

}

// So if we want to follow this principle, we make 3 classes as shown below for each responsibility.
class StudentRegister {
    public void registerStudent() {
        // some logic
    }
}

class StudentResult {
    public void calculateStudentResult() {
        // some logic
    }
}

class StudentEmails {
    public void sendEmail() {
        // some logic
    }
}

// So here we can also inherit the classes for method reusability.