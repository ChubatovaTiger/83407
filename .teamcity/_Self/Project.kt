package _Self

import _Self.buildTypes.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project
import java.util.concurrent.TimeUnit

object Project : Project({
    TimeUnit.SECONDS.sleep(10L)
    throw Exception("Hi!")
    buildType(B19)
    buildType(B9)
    buildType(B8)
    buildType(B10)
    buildType(B20)
    buildType(B12)
    buildType(B5)
    buildType(B11)
    buildType(B4)
    buildType(B14)
    buildType(B7)
    buildType(B13)
    buildType(B6)
    buildType(B1)
    buildType(B16)
    buildType(B15)
    buildType(B18)
    buildType(B3)
    buildType(B17)
    buildType(B2)
})
