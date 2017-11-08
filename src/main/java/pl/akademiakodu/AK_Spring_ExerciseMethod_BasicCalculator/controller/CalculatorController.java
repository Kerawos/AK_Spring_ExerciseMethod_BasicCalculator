package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculator.models.CalculatorSimple;
import pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculator.models.OperationModel;

@Controller
public class CalculatorController {

    CalculatorSimple calculatorSimple = new CalculatorSimple();
    OperationModel operationModel = new OperationModel();

    @GetMapping("/")
    public String indexGet(Model model){
        model.addAttribute("operationModel", operationModel);
        return "index";
    }

    @RequestMapping(params = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorSimple.add(operationModel.getA(), operationModel.getB()));
        return "index";
    }

    @RequestMapping(params = "sub", method = RequestMethod.POST)
    public String subtract(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorSimple.subtrackt(operationModel.getA(), operationModel.getB()));
        return "index";
    }

    @RequestMapping(params = "mul", method = RequestMethod.POST)
    public String multiplication(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorSimple.multiplication(operationModel.getA(), operationModel.getB()));
        return "index";
    }

    @RequestMapping(params = "div", method = RequestMethod.POST)
    public String division(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorSimple.division(operationModel.getA(), operationModel.getB()));
        return "index";
    }

    @GetMapping("/desc")
    public String descGet(){
        return "desc";
    }



}
