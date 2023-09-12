package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.triggers.schedule

object B16 : BuildType({
    name = "b16"

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
            withPendingChangesOnly = false
        }
    }
})
