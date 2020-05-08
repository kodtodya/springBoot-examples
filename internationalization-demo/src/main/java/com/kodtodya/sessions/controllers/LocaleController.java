package com.kodtodya.sessions.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocaleController {
   @RequestMapping("/locale")
   public String locale() {
      return "locale";
   }
}