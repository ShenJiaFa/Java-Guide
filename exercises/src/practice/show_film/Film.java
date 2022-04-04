package practice.show_film;

/**
 * Function: Film model class
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class Film {

    /**
     * Film name
     */
    private String name;

    /**
     * Film score
     */
    private double score;

    /**
     * Film actor
     */
    private String actor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public Film(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public Film() {
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", actor='" + actor + '\'' +
                '}';
    }

}
