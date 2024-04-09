import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Patient patient = new Patient(1);
        System.out.println(patient.getDoctor().getClass().getName());

//        Задание с яблоком
//        Сделано с помощью рефлекии(гуглил)

        Apple apple = new Apple();
        Field field = apple.getClass().getDeclaredField("color");
        field.setAccessible(true);
        System.out.println(apple.getColor());
        field.set(apple, "Red");
        System.out.println(apple.getColor());
    }
}