// . EXERCISE TO PRACTICE IF-ELSE

public class SchoolGrades {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public SchoolGrades(int age){
        this.setAge(age);
        //this.age = age;
        knowingMyGrade();
    }

    /*Control_sentences using conditions
     * First Example:  IF-ELSE IF- ELSE
     *  US-GRADES */
    private void knowingMyGrade() {

        if (this.age < 3) {
            System.out.println("Sorry!, You cannot be in school yet.");
        } else if (this.age>= 3 && this.age<= 5) {
            System.out.println("Nice!, You are in Pre-school.");
        } else if (this.age== 6) {
            System.out.println("Amazing!, You are officially in Kindergarten.");
        } else if (this.age> 6 && this.age <= 11) {
            System.out.println("Awesome!, You are in Elementary School");
        } else if (this.age> 11 && this.age <= 15) {
            System.out.println("Great!, You are a fantastic teenager and you are in Middle School");
        } else if (this.age> 15 && this.age<= 18) {
            System.out.println("Wow! You are almost done. You are in High School");
        } else if (this.age > 18 && this.age<= 22) {
            System.out.println("Nice Job!, Right now you are in College");
        } else {
            System.out.println("Wonderful!, You are at University.");
        }
    }

}
