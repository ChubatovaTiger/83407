package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.triggers.schedule

object B14 : BuildType({
    name = "b14"

    vcs {
        root(DslContext.settingsRoot)
    }

    triggers {
        schedule {
            schedulingPolicy = cron {
                seconds = "0/20"
                minutes = "*"
            }
            branchFilter = ""
            triggerBuild = always()
        }
    }
})
