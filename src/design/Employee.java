package design;

import java.util.ArrayList;

public interface Employee extends employeeDatabase {
    static void main(String[] args) {

    }
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
    //please read the following method and understand the business requirements of these following methods
    //and then implement these in a concrete class.

    //employeeId() will return employee id.
    int employeeId();

    //employeeName() will return employee name
    String employeeName();

    //assignDepartment() will assign employee to departments
    void assignDepartment();

    //calculate employee salary
    int calculateSalary();

    //employee benefit
    void benefitLayout();

    // assignComputer() will assign employee to a computer
    void assignComputer();

    // assignManager() will assign employee a manager
    void assignManager();

    // employeeAddress(); will look at employee's present location to see if relocation is needed
    void employeeAddress();

    // employeeJobRole(); will assign the employee a role in his department
    void employeeJobRole();

    void printEmployeeInfo();
}

// Interface inside a Interface
interface employeeDatabase{

    // employeeDatabase Interface's variables
    String employeeResume="2 pages required";
    boolean isUnemployed=true;
    int daysSinceUnemployed=23;
    double previousMonthlyWage=1000.67;
    char employeeGender='m';

    // Methods
    void criminalRecord();
    void reasonForLeavingPreviousJob();
    void goalsIn5Years();
    void questionsInMind();


}
// Company's HR has an interface
interface companyHR{

    // Variables
    String internalDetails="Full review";
    long hrContactNumber=222-444-5555;

    // Methods
    void networkInfo();
    void hoursOfAvailability();
    void idDetails();
}