package com.github.demiusacademius.quarkusplugin.services

import com.intellij.openapi.project.Project
import com.github.demiusacademius.quarkusplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
