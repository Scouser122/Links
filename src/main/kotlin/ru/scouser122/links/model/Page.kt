package ru.scouser122.links.model

import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Table(name = "page")
class Page {
    var id: Int? = null
    var title: String? = null
    @OneToMany(mappedBy = "page")
    var links: List<Link>? = null
}