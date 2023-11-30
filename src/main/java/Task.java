import jakarta.persistence.*;
import module_5.ToDoList;
import java.util.List;

/**
 * Class that contains CRUD methods for manipulating MySQL database
 */
public class Task {
    /**
     * method that removes an item from the ToDo list
     * @param item represents ID of the item to be removed
     */
    public void removeItem(int item) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager session = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = session.getTransaction();
       try {
           transaction.begin();
           ToDoList task = session.find(ToDoList.class, item);
           session.remove(task);
           transaction.commit();
    }
        finally {
            if(transaction.isActive()){
                transaction.rollback();
            }
            session.close();
            entityManagerFactory.close();
        }
    }
    /**
     * method that ads an item to the ToDo list
     * @param item represents an item to be added to the list
     */
    public void addItem(String item){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager session = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = session.getTransaction();
        try {
            transaction.begin();
            ToDoList task = new ToDoList();
            task.setTaskName(item);
            session.persist(task);
            transaction.commit();
        }
        finally {
            if(transaction.isActive()){
                transaction.rollback();
            }
            session.close();
            entityManagerFactory.close();
        }
    }

    /**
     * method that prints ToDo list
     */
    public void showItems(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager session = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = session.getTransaction();
        try{
            transaction.begin();
            Query query= session.createQuery("select T from ToDoList T",ToDoList.class);
            List results = query.getResultList();
            System.out.println("TO DO LIST");
            System.out.println("-----------------");
            results.forEach(System.out::println);
            transaction.commit();
        }
        finally {
            if(transaction.isActive()){
                transaction.rollback();
        }
            session.close();
            entityManagerFactory.close();
      }
    }

    /**
     * method that prints instructions for ToDo list
     */
    public void printInstructions(){
        System.out.println("-----------------");
        System.out.println("Main Menu");
        System.out.println("0. Exit");
        System.out.println("1. Display To-Do-List");
        System.out.println("2. Add item");
        System.out.println("3. Remove item");
        System.out.println("Enter choice: ");
    }
}
