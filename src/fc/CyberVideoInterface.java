package fc;
public class CyberVideoInterface {

    public void requestMovieAsBluRay(Movie mov ){
        System.out.println("fc.BluRay request send for : " + mov.getTitle());
    }
}
