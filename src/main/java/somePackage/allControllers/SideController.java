package somePackage.allControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home2")
public class SideController {

    @GetMapping("/test")
    String test(){
        return "Test";
    }

    @GetMapping("/params")
    String returnMeParams
            (@RequestParam(value = "name") String input,
             @RequestParam(value = "surname") String input2){
        return "Hello " + input + " and " + input2;
    }

    @GetMapping("/param")
    String retunrMeParam
            (@RequestParam(value = "name", required = false ,defaultValue = "World")
                     String input){
        return "Hello " + input;
    }

    @GetMapping("/{path}")
    String returnMePath(@PathVariable String path){
        return "hello " + path;
    }
}
