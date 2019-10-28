package at.htl.asciidoctor;

//import static org.asciidoctor.Asciidoctor.Factory.create;
//import org.asciidoctor.Asciidoctor;

public class AsciidoctorDemo {

    public static void main(String[] args) {
        //Asciidoctor asciidoctor = create();
        // tag::myloop[]
        for (int i = 10; i <= 100; i+=10) {
            System.out.println(i);
        }
        // end::myloop[]
        System.out.println("not in asciidoctor-file anymore");
    }

}
