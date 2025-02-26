import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class task{
    //id: A unique identifier for the task
    //description: A short description of the task
    //status: The status of the task (todo, in-progress, done)
    //createdAt: The date and time when the task was created
    //updatedAt: The date and time when the task was last updated

    private int last_id = 0;
    private int id;
    private String description;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    //Add, Update, and Delete tasks
    //Mark a task as in progress or done
    //List all tasks
    //List all tasks that are done
    //List all tasks that are not done
    //List all tasks that are in progress

    public task(String description){
        this.id = last_id;
        this.description = description;
        this.status = Status.TODO;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
            }

    public int getId(){
    return id; }

    public void markInprogress(){
        this.status= Status.IN_PROGRESS;
        this.updatedAt= LocalDateTime.now();
            }
    public void markDone(){
        this.status= Status.DONE;
        this.updatedAt= LocalDateTime.now();
    }

    public void updateDescription(){
        this.description= description;
        this.updatedAt= LocalDateTime.now();
    }
}
