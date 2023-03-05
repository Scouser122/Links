package ru.scouser122.links.model

import jakarta.persistence.*

@Table(name = "link")
class Link {
    var id: Int? = null
    var title: String? = null
    var url: String? = null
    @ManyToOne
    @JoinColumn(name = "page_id", nullable = false)
    var page: Page? = null
}