package com.specter.chunkchestkotlin

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class ChunkChestCommand(chunkChest: ChunkChest) : CommandExecutor {
    override fun onCommand(p0: CommandSender, p1: Command, p2: String, p3: Array<out String>?): Boolean {


        return true
    }

}
