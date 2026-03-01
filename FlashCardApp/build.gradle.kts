// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
    implementation("androidx.navigation:navigation-compose:2.8.5") // Use latest version
}

private fun PluginDependenciesSpecScope.implementation(string: String) {}
