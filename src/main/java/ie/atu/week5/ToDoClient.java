package ie.atu.week5;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "jsonplaceholder", url = "https://jsonplaceholder.typicode.com")
public interface ToDoClient {

    @GetMapping("/todos/1")
    TodoResponse fetchData();
}
