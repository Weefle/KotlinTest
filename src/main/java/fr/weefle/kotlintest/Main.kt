package fr.weefle.kotlintest

import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin() {

    companion object {
        var instance: Main? = null
            private set
    }

    override fun onEnable() {
        super.onEnable()
        instance = this
    }

}