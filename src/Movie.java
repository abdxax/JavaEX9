public class Movie extends Product{
    private String director;

    public Movie() {
    }

    @Override
    public double getDiscount() {
        double pr=(getPrice()*15)/100;
        return getPrice()-pr;
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
