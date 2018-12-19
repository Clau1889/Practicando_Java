public class Main {
    public static void main(String[] args){
        /*Put any age and discover your school Grade
        * IF-ELSE
        */
        SchoolGrades grades= new SchoolGrades(24);
        System.out.println("Tienes " + grades.knowingMyGrade() + " años." + "\n");

        /* Choices: Action, Fiction, Comedy, drama, fantasy, musical, love, thriller, scary and take movie recomendations
        * SWITCH
        */
        MovieTheater clasifyCinema = new MovieTheater("comedy");
        System.out.println("You choice: " + clasifyCinema.chooseCategory() + "\n");

        /* Finding current avaible pets in PetShop
        * ARRAY
        */
        PetShop pet= new PetShop();
        System.out.println("Current avaible pets: " + pet.pets.length);
        pet.avaiblePets();
    }
}
