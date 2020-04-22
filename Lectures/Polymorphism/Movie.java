package Lectures.Polymorphism;

public class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here...";
    }

    public String getName() {
        return name;
    }
    /*
           **Polymorphism Example**

        for (int i = 0; i < 11; i++) {

            Movie movie = randomMovie();
            System.out.format("Movie # %s, %s \nPlot: %s\n", i, movie.getName(), movie.plot());
        }


        public static Movie randomMovie() {
        int randomNum = (int) (Math.random()* 4) ;
        switch (randomNum) {
            case 0 -> {
                return new Jaws();
            }
            case 1 -> {
                return new IndependenceDay();
            }
            case 2 -> {
                return new MazeRunner();
            }
            case 3 -> {
                return new Forgettable();
            }
        }
        return null;
        }

     */

}
