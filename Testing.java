package CollectionTesting;
import java.util.*;

public class Testing {
    static List<Declare> list = new ArrayList<>();
    static void add(){
        Random random = new Random();
        System.out.print("Insert Amount: ");
        Integer amount = new Scanner(System.in).nextInt();
        for (int i = 0; i < amount; i++) {
            System.out.print("Name "+(i+1)+" : ");
            String name = new Scanner(System.in).nextLine();
            System.out.print("Age "+(i+1)+" : ");
            Integer age = new Scanner(System.in).nextInt();
            System.out.print("Subject "+(i+1)+" : ");
            String[] subject = new Scanner(System.in).nextLine().split(",");
            list.add(new Declare(
                    random.nextInt(100),
                    name,
                    age,
                    subject
            ));
        }
    }
    static void update(){
        System.out.println("Update by ID: ");
        int id = new Scanner(System.in).nextInt();
        Iterator<Declare> iterator = list.iterator();
        while(iterator.hasNext()){
            Declare declare = iterator.next();
            if(declare.getId().equals(id)){
                System.out.println("Update option");
                System.out.println("1. Update Namee");
                System.out.println("2. Update Age");
                System.out.println("3. Update Subject");
                System.out.println("4. Update All");
                System.out.print("Choose your option: ");
                int op = new Scanner(System.in).nextInt();
                switch (op){
                    case 1->updateName(declare);
                    case 2->updateAge(declare);
                    case 3->updateSubject(declare);
                    case 4->{
                        updateName(declare);
                        updateAge(declare);
                        updateSubject(declare);
                    }
                }
            }
        }
    }
    static void updateName(Declare declare){
        System.out.println("New Name: ");
        String name = new Scanner(System.in).nextLine();
        declare.setName(name);
    }
    static void updateAge(Declare declare){
        System.out.print("New age: ");
        Integer age = new Scanner(System.in).nextInt();
        declare.setAge(age);
    }
    static void updateSubject(Declare declare){
        System.out.print("New subject: ");
        String[] subject = new Scanner(System.in).nextLine().split(",");
        declare.setSubjects(subject);
    }
    static void removebyID(){
        System.out.print("Remove by ID: ");
        Integer id = new Scanner(System.in).nextInt();
        list.removeIf(a -> a.getId().equals(id));
    }
    static void removebyName(){
        System.out.print("Remove by Name: ");
        String name = new Scanner(System.in).nextLine();
        list.removeIf(a -> a.getName().equals(name));
    }
    static void remove(){
        System.out.println("Remove by ID or Name");
        System.out.println("1. Remove by ID");
        System.out.println("2. Remove by Name");
        System.out.print("Choose your option: ");
        int op = new Scanner(System.in).nextInt();
        switch (op){
            case 1-> removebyID();
            case 2-> removebyName();
        }
    }
    static void show(){
        System.out.println(list);
    }
    public static void main(String[] args) {
        System.out.println("This our option");
        System.out.println("1. Add");
        System.out.println("2. Show");
        System.out.println("3. Update");
        System.out.println("4. Remove");
        System.out.println("5. Exit");
        while (true){
            System.out.print("Choose your option: ");
            int op = new Scanner(System.in).nextInt();
            switch(op){
                case 1->add();
                case 2->show();
                case 3->update();
                case 4->remove();
                case 5->System.exit(0);
            }
        }
    }
}
