public class Library {
    private double book;
    private double checkout;

    public Library(double book, double checkout) {
        this.book = book;
        this.checkout = checkout;
    }

    public double getNumBooks() {
        return book;
    }

    public double getCheckout() {
        return checkout;
    }

    public void takeBook(double amount) {
        checkout = checkout + amount;
        book = book - amount;
    }
}