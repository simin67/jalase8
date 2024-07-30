public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

    }

    public void calMohit() {
        int mohit = (width + height) * 2;
        System.out.println("mohit" + mohit);
    }

    public void calMasahat() {
        int masahat = width * height;
        System.out.println("masahat" + masahat);

    }

}
