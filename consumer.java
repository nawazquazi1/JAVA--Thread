import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class student {
//    private String name;
//    student(String name) {
//        this.name = name;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public static void main(String[] args) {
//        student s = new student("nawaz");
//        Consumer<student> studentConsumer = a -> a.setName("Nawaz Quazi");
//        System.out.println(s.getName());
//        studentConsumer.accept(s);
//        System.out.println(s.getName());
//    }
}

class SupplierDemo {
//    public static void main(String[] args) {
//        Supplier supplier=()->new Random().nextInt(50);
//        System.out.println(supplier.get());
//        System.out.println(supplier.get());
//        System.out.println(supplier.get());
//        System.out.println(supplier.get());
//        System.out.println(supplier.get());
//    }
}

class Predicate1 {
//    public static void main(String[] args) {
//     Predicate<Integer> LessThan18=i->(i<18);
//        System.out.println(LessThan18.test(12));
//        System.out.println(LessThan18.test(20));
//    }
}

class Predicate2 {
//    public static void main(String[] args) {
//        Predicate<Integer> predicate = i -> (i > 10);
//        Predicate<Integer> predicate1 = i -> (i < 20);
//        boolean result = predicate.and(predicate1).test(15);
//        System.out.println(result);
//         result = predicate.and(predicate1).test(25);
//        System.out.println(result);
//         result = predicate.and(predicate1).test(5);
//        System.out.println(result);
//           // use nagate
//         result = predicate.negate().test(15);
//        System.out.println(result);
//        result = predicate.negate().test(5);
//        System.out.println(result);
//    }
}

class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer, Double> half = a -> a / 2.0;
        System.out.println(half.apply(10));

//        half=half.andThen(a->a*3);
//        System.out.println(half.apply(10));

        half = half.compose(a -> a * 3);
        System.out.println(half.apply(10));
    }

}
class mnawaz{
    public static void main(String[] args) {
        ccccc cv=new ccccc(6);

    }
}
class gfhgjhk{
    gfhgjhk(){
        System.out.println("ggggg");
    }
}
class ccccc {
    ccccc(){
        System.out.println("cccc");
    }
    ccccc(int  x){
       final int kjhgf;
//        this();
        System.out.println("ccccc2");
    }
}

