package CollectionTesting;

import java.util.*;

public class Testing {
    public static void main(String[] args) {
        List<Declare> list = new ArrayList<>();
        Random random = new Random();
        System.out.print("Insert Amount: ");
        Integer amount = new Scanner(System.in).nextInt();
//        Declare array[] = new Declare[amount];
        for (int i = 0; i < amount; i++) {
            System.out.print("Name "+(i+1)+" : ");
            String name = new Scanner(System.in).nextLine();
            System.out.print("Age "+(i+1)+" : ");
            Integer age = new Scanner(System.in).nextInt();
            System.out.print("Subject "+(i+1)+" : ");
            String[] subject = new Scanner(System.in).nextLine().split(",");

//            Using Array
//            array[i] = new Declare(
//                    random.nextInt(100),
//                    name,
//                    age,
//                    subject
//            );

            //Using List
            list.add(new Declare(
                    random.nextInt(100),
                    name,
                    age,
                    subject
            ));
        }
        System.out.println(list);
    }
}
