package ru.scouser122.links.repositories

import org.springframework.data.repository.CrudRepository
import ru.scouser122.links.model.Page

interface PageRepository : CrudRepository<Page, Int>