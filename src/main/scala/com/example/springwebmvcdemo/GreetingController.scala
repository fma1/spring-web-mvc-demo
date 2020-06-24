package com.example.springwebmvcdemo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestMapping, RequestParam}

@Controller
class GreetingController {
  @RequestMapping(Array("/greeting"))
  def greeting(@RequestParam(name = "name", required = false, defaultValue = "World") name: String, model: Model): String = {
    model.addAttribute("name", name)
    "greeting"
  }
}
