package com.ashish.demo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {
    @RequestMapping("/")  // to map the request
    public String home(){
        System.out.println("home method called");
        return "index" ;  // we can use index.jsp also but this is more readable
    }

//    @RequestMapping("add")
//    public  String  add(HttpServletRequest req , HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2 ;
//        session.setAttribute("result" ,result); // when we call add the dispatcher servlet called result.jsp
//
//        System.out.println("in add");
//        return "result.jsp";
//    }
    //Approach 2 to sending data to mvc

//@RequestMapping("add")
//public  String  add(int num1 ,int num2 , Model model){
//    int result = num1 + num2 ;
//    model.addAttribute("result" ,result); // when we call add the dispatcher servlet called result.jsp
//
//    System.out.println("in add");
//    return "result";
//}

   // approach three to sending data to mvc
@RequestMapping("calculator")
public  ModelAndView  add(int num1 ,String operator ,int num2 , ModelAndView mv ){
    int result;
    switch(operator){
        case "+" :
            result = num1 +num2;
            break;
        case "-" :
            result = num1- num2 ;
            break;
        case "*" :
            result = num1 * num2 ;
            break;
        case "/" :
            // Optional: handle divide-by-zero case
            if (num2 == 0) {
                mv.addObject("error", "Cannot divide by zero");
                mv.setViewName("result");
                return mv;
            }
            result = num1 / num2;
            break;
        default:
            mv.addObject("error", "Invalid operator");
            mv.setViewName("result");
            return mv;
    }
    mv.addObject("result" ,result); // when we call add the dispatcher servlet called result.jsp

    mv.setViewName("result");
    System.out.println("in add");
    return mv ;  // return object directly no need to specify the type
}
}
