/*
 * @author  Ruslan Gronyuk
 */

package com.vntu.pipz.crm_mobile_electric_transport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping(value = "/")
    public String getIndexPage(Model model) {
        return "index";
    }

    @GetMapping(value = "/home")
    public String getHome(Model model) {
        return "home";
    }
}
