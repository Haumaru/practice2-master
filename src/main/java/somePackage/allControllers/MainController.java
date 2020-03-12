package somePackage.allControllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value ={"/", "/default", "/home"})
public class MainController {

    @Value("${some.value.one}")
    String stringOne;
    @Value("${some.value.another}")
    String stringTwo;


    @GetMapping("/value")
    String returnMeValue(){
        return stringTwo;
    }
    @GetMapping("/string")
    String returnMeString(){

        return "Hello World";
    }

    @GetMapping("/list")
    List<String> returnMeList(){
        List<String> stringList = new ArrayList<>();
        stringList.add("Jhon");
        stringList.add("Jack");
        stringList.add("Maxim");
        return stringList;
    }

    @GetMapping("/map")
    Map<Integer, String> returnMeMap(){
        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(1, "Jhon");
        newMap.put(2, "Jack");
        newMap.put(3, "Maxim");
        return newMap;
    }
}
