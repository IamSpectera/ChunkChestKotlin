package com.specter.chunkchestkotlin

import org.bukkit.configuration.file.FileConfiguration
import org.bukkit.plugin.java.JavaPlugin

class ChunkChest : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic

        server.pluginManager.registerEvents(ChunkChestListener(this), this)
        getCommand("chunkchest")!!.setExecutor(ChunkChestCommand(this))


        // Loads the configuration file
    }

}