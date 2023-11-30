package module_5;
import jakarta.persistence.*;
@Entity
@Table(name = "tasks", schema = "to_do_list")
public class ToDoList {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "task_name")
    private String taskName;
    public ToDoList(){
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;}

    @Override
    public String toString() {
        return "Task ID: " + id +". " + taskName;
    }
}
