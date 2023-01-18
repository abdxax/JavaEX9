public class Main {
    public static void main(String[] args) {

        Book book=new Book("Java",250,"Ali");
        System.out.println(book.getDiscount());

        Movie movie=new Movie("TestName",75,"Ahmad");
        System.out.println(movie.getDiscount());

        MovablePoint point=new MovablePoint(10,12,8,6);
        point.moveDown();
        point.moveRight();
        System.out.println(point.getY());
        System.out.println(point.getX());
    }
}