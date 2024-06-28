package chapter17;

import java.lang.reflect.Method;

public class UserAnnotationCheck {
    public static void main(String[] args) {
        UserAnnotationCheck sample = new UserAnnotationCheck();
        sample.checkAnnotations(UserAnnotationSample.class);
    }


    /*
        main () : number = 0, text = first annotation
        annotationSample1 () : number = 1, text = first annotation
        annotationSample2 () : number = 2, text = second
        annotationSample3 () : number = 3, text = third
    * */
    private void checkAnnotations(Class useClass) {
        Method[] methods = useClass.getDeclaredMethods();
        for(Method method : methods) {
            UseAnnotation annotation = method.getAnnotation(UseAnnotation.class);
            if(annotation != null) {
                int number = annotation.number();
                String text =  annotation.text();

                System.out.printf("""
                            %s () : number = %d, text = %s
                        """, method.getName(), number, text);
            }else {
                System.out.printf("""
                            %s () : annotation is null
                        """, method.getName());
            }
        }
    }
}
