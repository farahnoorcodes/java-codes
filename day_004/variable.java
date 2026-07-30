package day_004;

public class variable {
    public static void main(String[] args) {
        /**
    * variable
    */

    //In Java, a variable is a named container that holds a value. Before you use one, you have to declare its type — Java needs to know upfront what kind of data it will hold.
    //basic syntax:
    //type variableName = value;
    // = is called assisgnment operator, used to assisgn a value to a variable.
    int age = 18;          // whole numbers, no decimals
    double price = 9.99;    // decimal numbers
    char grade = 'A';       // a single character, single quotes
    boolean isStudent = true; // true or false only
    String name = "Farah";  // text, double quotes (capital S — String is a class, not a primitive type)
    //A few things worth knowing as a beginner:

    //1. Once you say int age, that variable can only ever hold whole numbers — you can't later put text into it.
    //2. You can declare without assigning a value right away: int age; then later age = 20;
    //example:
    int salary;
    salary=4000;
    //3. Variable names are case-sensitive (age and Age are different) and by convention start lowercase, with camelCase for multiple words (studentAge).
    String FARAH ="artist";
    String farah ="coder";
    //4. To print a variable, join it with a string using +, like System.out.println("age: " + age);
    //example:
    String Farah="chef";
        System.out.println("her name is "+name+" "+"she is a "+ Farah+", "+ FARAH+", "+farah);
        System.out.println("her salary is "+salary);
        System.out.println("her age is "+age);
        System.out.println("her bag price is "+price);
        System.out.println("her garde in 2nd sem is "+grade);
        System.out.println("she is a student ="+ isStudent);

        
    }

    
}

