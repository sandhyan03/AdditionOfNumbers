package com.example.AddTwoNumbers.AddController;

import com.example.AddTwoNumbers.utility.AdditionUtility;
import com.example.AddTwoNumbers.domain.Addition;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/addingNumbers")
@Controller
public class AdditionController
{
    @PostMapping("/add")
    @ResponseBody
    public Addition addNumbers(@RequestBody Addition addition)
    {
        Addition result = new Addition();
        result.setNum1(addition.getNum1());
        result.setNum2(addition.getNum2());

        int addResult = AdditionUtility.add(addition.getNum1(), addition.getNum2());
        result.setSum(addResult);
        return result;

    }
}