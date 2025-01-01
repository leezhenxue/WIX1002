package Q5;

public class MovieCollection {
    private Movie[] movieCollection;
    private int numMovies;

    public MovieCollection() {
        this.movieCollection = new Movie[100]; 
        this.numMovies = 0;               
    }

    public boolean isEmpty() {
        return numMovies == 0;
    }

    public void addMovie(Movie movie) {
        if (numMovies < movieCollection.length) {
            movieCollection[numMovies++] = movie;
        } else {
            System.out.println("The movie collection is full!");
        }
    }

    public void removeMovie(String title) {
        for (int i = 0; i < numMovies; i++) {
            if (movieCollection[i].getTitle().equals(title)) {
                for (int j = i; j < numMovies - 1; j++) {
                    movieCollection[j] = movieCollection[j + 1];
                }
                movieCollection[--numMovies] = null;
                System.out.println("Removed movie: " + title);
                return;
            }
        }
        System.out.println("Movie with title \"" + title + "\" not found.");
    }

    public void findmovieCollectionByDirector(String director) {
        boolean found = false;
        System.out.println("Movies directed by '" + director + "':");
        for (int i = 0; i < numMovies; i++) {
            if (movieCollection[i].getDirector().equals(director)) {
                System.out.println(movieCollection[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movies found directed by " + director);
        }
    }

    public void findMovieByTitle(String title) {
        for (int i = 0; i < numMovies; i++) {
            if (movieCollection[i].getTitle().equals(title)) {
                System.out.println("Movie '" + title + "' found:");
                System.out.println(movieCollection[i]);
                return;
            }
        }
        System.out.println("Movie with title \"" + title + "\" not found.");
    }

    public void sortmovieCollectionByReleaseYear() {
        for (int i = 0; i < numMovies - 1; i++) {
            for (int j = i + 1; j < numMovies; j++) {
                if (movieCollection[i].getYear() > movieCollection[j].getYear()) {
                    Movie temp = movieCollection[i];
                    movieCollection[i] = movieCollection[j];
                    movieCollection[j] = temp;
                }
            }
        }
    }

    public void findmovieCollectionByReleaseYearRange(int startYear, int endYear) {
        boolean found = false;
        for (int i = 0; i < numMovies; i++) {
            if (movieCollection[i].getYear() >= startYear && movieCollection[i].getYear() <= endYear) {
                System.out.println(movieCollection[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No movies found in the year range " + startYear + " to " + endYear);
        }
    }

    public void displayCollection() {
        if (isEmpty()) {
            System.out.println("The movie collection is empty.");
        } else {
            for (int i = 0; i < numMovies; i++) {
                System.out.println(movieCollection[i]);
            }
        }
    }
}
