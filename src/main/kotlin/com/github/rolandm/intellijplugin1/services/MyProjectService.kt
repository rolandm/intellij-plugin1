package com.github.rolandm.intellijplugin1.services

import com.intellij.openapi.project.Project
import com.github.rolandm.intellijplugin1.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
