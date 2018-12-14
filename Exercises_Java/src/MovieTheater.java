/*      Example CONTROL SENTENCES:
           using ----> SWITCH                   */

public class MovieTheater {
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public MovieTheater(String category) {

        setCategory(category);
    }

    public void chooseCategory(String category){

    switch(category.toLowerCase()) {
        case "action":
            System.out.println("Great Choose!. Recommendations: Matrix, Fast & Furious, WonderWoman.\n ");
            break;

        case "fiction":
            System.out.println("Great Choose!. Recommendations: Avatar, Maze Runner, Avangers.\n");
            break;

        case "comedy":
            System.out.println("Great Choose!. Recommendations: DeadPool, Wifi Ralp.\n ");
            break;

        case "drama":
            System.out.println("Great Choose!. Recommendations: Matrix, Fast & Furious, Avangers.\n ");
            break;

        case "fantasy":
            System.out.println("Great Choose!. Recommendations: Harry Potter, Narnia, The nutcracker. \n");
            break;

        case "musical":
            System.out.println("Great Choose!. Recommendations: Mamma mia, A star is born, The greatest showman.\n ");
            break;

        case "love":
            System.out.println("Great Choose!. Recommendations: A walk to rememeber, Notebook, P.S i love you .\n");
            break;

        case "thriller":
            System.out.println("Great Choose!. Recommendations: The commuter, He´s Out There, The little Stranger .\n");
            break;

        case "scary":
            System.out.println("Great Choose!. Recommendations: Halloween, IT, Slender Man.\n ");
            break;

        default:
            System.out.println("Sorry, Avaible category.\n ");

        }
    }

}