package ru.scouser122.links.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainPageController {
    val pageTitle = "Main page"
    val pageText = "Here will be links list"

    @GetMapping("/main")
    fun getPage(model: Model): String {
        model.addAttribute("title", pageTitle)
        model.addAttribute("pageText", pageText)
        return "index"
    }
}