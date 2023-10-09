package ie.atu.hwcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public CalculatorData calculate(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2,
            @RequestParam("operation") String operation) {

        return switch(operation) {
            case "add" -> new CalculatorData(num1 + num2, operation);
            case "subtract" -> new CalculatorData(num1 - num2, operation);
            case "multiply" -> new CalculatorData(num1 * num2, operation);
            case "divide" -> new CalculatorData((float)num1 / num2, operation);
            default -> throw new IllegalArgumentException("Invalid Operation" + operation);
        };
    }
}
