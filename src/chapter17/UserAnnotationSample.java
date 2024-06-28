package chapter17;

public class UserAnnotationSample {
    @UseAnnotation(number = 0)
    public static void main(String[] args) {
        UserAnnotationSample sample = new UserAnnotationSample();
    }

    @UseAnnotation(number = 1)
    public void annotationSample1(){

    }
    @UseAnnotation(number = 2, text = "second")
    public void annotationSample2(){

    }
    @UseAnnotation(number = 3, text = "third")
    public void annotationSample3(){

    }
}
