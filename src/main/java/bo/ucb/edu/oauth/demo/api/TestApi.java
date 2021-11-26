package bo.ucb.edu.oauth.demo.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestApi {

    @GetMapping(value = "/api/foo", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> foo() {
        Map<String, String> result = new HashMap<>();
        result.put("Hello", "From foo GET");
        return result;
    }

    @PostMapping(value = "/api/bar", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> bar(@RequestBody Map<String, String> body) {
        System.out.println(body);
        body.put("Hello", "From bar POST");
        return body;

    }
}
