package com.github.pierreyvesjegou.trainingintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.pierreyvesjegou.trainingintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
