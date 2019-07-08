package com.example.demo.Controllers;

import com.example.demo.Model.DataProvider;
import com.example.demo.Model.User;
import com.example.demo.Model.ChangeName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/musiclibrary")

public class UserController {
    @Autowired

    private DataProvider dataProvider;
    User currentUser;


    @GetMapping(path = "/home")
    public String homePage() {
        return "home_page";
    }


    @GetMapping(path = "")
    public String returnHomePage(HttpSession session) {
        if (!isLoggedIn(session)) {
            //Redirect user if he is not logged in.
            return "redirect:/musiclibrary/userlogin";
        }

        return "home_page";
    }

    @GetMapping(path = "/userlogin")
    public String getLogin(HttpSession session, Model model) {
        if (isLoggedIn(session)) {
            //Thymeleaf allows simple redirection by returning "redirect:" + the name of the page to redirect to

            return "redirect:/musiclibrary/home";
        }
        return "loginform";
    }

    @PostMapping(path = "/userlogin")
    public String postLogin(HttpSession session, User user, Model model, HttpServletResponse response) {
        if (dataProvider.getValidUser().contains(user.getUsername())) {

            session.setAttribute("username", user.getUsername());
            currentUser = dataProvider.findUserByUserName(user.getUsername());
            session.setAttribute("user", currentUser);

            Cookie cookie = new Cookie("lastUser", "" + currentUser.getUsername());
            response.addCookie(cookie);

            return "redirect:/musiclibrary/home";
        } else {
            model.addAttribute("errormessage", "Username not valid!");
            return "loginform";
        }
    }

    @GetMapping("/password")
    public String changePassword(Model model) {
        model.addAttribute("password", "v");
        model.addAttribute("repeatPassword","v");
        return "new_passwordform";
    }

//    @PostMapping(path = "/password")
//    public String changePassword(@ModelAttribute String newPassword, @ModelAttribute String repeatPassword, Model model, HttpSession session) {
//        if (newPassword.equals(repeatPassword)) {
//            currentUser.setUsername(newPassword);
//
//            return "redirect:/musiclibrary/userlogin";
//        } else {
//            model.addAttribute("errormessage", "Password doesn't match");
//            return "new_passwordform";
//        }
//    }

    @PostMapping("/account/delete")
    public String deleteAccount(HttpSession session){
        session.removeAttribute("username");
        dataProvider.getAllUsers().remove(currentUser);
        dataProvider.getValidUser().remove(currentUser.getUsername());
        session.invalidate();
        return "redirect:/musiclibrary/userlogin";
    }

    @GetMapping("/username")
    public String changeUsername(Model model) {
        model.addAttribute("enterName", currentUser.getUsername());
        return "new_usernameform";
    }

    @PostMapping(path = "/username")
    public String changeUsername(@ModelAttribute ChangeName enterName, HttpSession session, Model model) {
        if (!enterName.getNewName().equalsIgnoreCase(currentUser.getUsername())&& !dataProvider.getValidUser().contains(enterName.getNewName())){
       session.setAttribute("enterName", enterName);
       System.out.println("we reach here with changed name: " + enterName.getNewName());

       System.out.println(currentUser.getUsername());

       User user = dataProvider.findUserByUserName(currentUser.getUsername());

       dataProvider.getValidUser().remove(user.getUsername());
       currentUser.setUsername(enterName.getNewName());
       dataProvider.getValidUser().add(enterName.getNewName());
       //currentUser.setFirstName(enterName.getNewName());
       user.setUsername(enterName.getNewName());
       session.setAttribute("user", currentUser);
       System.out.println(currentUser.getUsername());
       return "redirect:/musiclibrary/userlogin";}
        else {
            model.addAttribute("errormessage", "Username not change or already used! Enter a new one");
            return "new_usernameform";
        }
    }

    @GetMapping("/account/")
    public String createUser(Model model) {
        model.addAttribute("user", new User());
        return "user_create_account";
    }

    @PostMapping("/account/")
    public String createUserSubmit(@ModelAttribute User user, HttpSession session) {
        session.setAttribute("username", user.getUsername());
        currentUser = user;
        session.setAttribute("user", currentUser);
        dataProvider.getAllUsers().add(user);
        dataProvider.getValidUser().add(user.getUsername());
        return "redirect:/musiclibrary/userlogin";
    }

    private boolean isLoggedIn(HttpSession session) {
        return session.getAttribute("username") != null;
    }


    @GetMapping(path = "/user/profile")
    public String getProfile(HttpSession session) {
        if (!isLoggedIn(session)) {

            return "redirect:/musiclibrary/userlogin";
        }

        return "profile";
    }

    @PostMapping("/account/logout")
    public String postLogout(HttpSession session) {
        session.invalidate();

        return "redirect:/musiclibrary/userlogin";
    }

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("users", dataProvider.getAllUsers());
        return "allusers";
    }


}
