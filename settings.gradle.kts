pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "PhilipsTutorial"
include(":app")
include(":app:Tutorial2")
include(":app:tutorial3")
include(":app:tutorial4")
include(":app:tutorial5")
include(":app:tutorial6")
include(":app:tutorial7")
include(":app:tutorial8")
include(":app:tutorial9")
include(":app:tutorial10")
include(":app:tutorial11")
include(":tutorial12")
