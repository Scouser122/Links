package ru.scouser122.links.interfaces

import org.springframework.ui.Model

interface PageService {
    fun fillModel(pageId: Int, model: Model)
}