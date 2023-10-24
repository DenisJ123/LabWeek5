package ie.atu.week5;

import org.springframework.stereotype.Service;

@Service
public class FeignService {
    private final ToDoClient toDoClient;

    public FeignService(ToDoClient toDoClient){
        this.toDoClient = toDoClient;
    }

    public TodoResponse fetchData(){
        TodoResponse td = toDoClient.fetchData();
        System.out.println(td);
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        return td;
    }
}
