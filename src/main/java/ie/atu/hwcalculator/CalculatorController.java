package ie.atu.hwcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public CalculatorData calculate(@RequestParam int num1, int num2, String operation) {
        switch(operation) {
            case "add" : num1 + num2;
            case "subtract" : num1 - num2;
            case "multiply" : num1 * num2;
            case "divide" : num1 / num2;
            default : "Not valid";
        }
    }
}
