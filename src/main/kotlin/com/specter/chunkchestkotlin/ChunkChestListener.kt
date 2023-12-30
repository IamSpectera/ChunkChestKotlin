package com.specter.chunkchestkotlin

import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDeathEvent

class ChunkChestListener(chunkChest: ChunkChest) : Listener {

    private var plugin: ChunkChest? = null

    fun ChunkChestListener(plugin: ChunkChest?) {
        this.plugin = plugin
    }


    @EventHandler
    fun onEntityDeath(event: EntityDeathEvent) {
        if (event.entity !is Player) {
            event.drops.clear()
        }
    }
}
