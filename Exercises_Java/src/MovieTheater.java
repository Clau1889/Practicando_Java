/*      Example CONTROL SENTENCES:
           using ----> SWITCH                   */

public class MovieTheater {
    private String category;



    public MovieTheater(String category) {
        this.category = category;
    }

    //Compare the category and receive recommendations
    public String chooseCategory(){

    switch(category.toLowerCase()) {
        case "action":
            System.out.println("Great Choose!. Recommendations: Matrix, Fast & Furious, Wonder Woman. ");
            break;

        case "fiction":
            System.out.println("Great Choose!. Recommendations: Avatar, Maze Runner, Avangers.");
            break;

        case "comedy":
            System.out.println("Great Choose!. Recommendations: Dead Pool, Wifi Ralp. ");
            break;

        case "drama":
            System.out.println("Great Choose!. Recommendations: Matrix, Fast & Furious, Avangers. ");
            break;

        case "fantasy":
            System.out.println("Great Choose!. Recommendations: Harry Potter, Narnia, The nutcracker.");
            break;

        case "musical":
            System.out.println("Great Choose!. Recommendations: Mamma mia, A star is born, The greatest showman.");
            break;

        case "love":
            System.out.println("Great Choose!. Recommendations: A walk to remember, Notebook, P.S i love you.");
            break;

        case "thriller":
            System.out.println("Great Choose!. Recommendations: The commuter, He´s Out There, The little Stranger.");
            break;

        case "scary":
            System.out.println("Great Choose!. Recommendations: Halloween, IT, Slender Man.");
            break;

        default:
            System.out.println("Sorry, Avaible category. ");

        }
        return  category;
    }

}