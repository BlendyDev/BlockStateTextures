package me.blendy.blockstatetextures

import net.minecraft.init.Blocks
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = "blockstatetextures", useMetadata = true)
class BlockStateTextures {
    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {

        println("Dirt: ${Blocks.dirt.unlocalizedName}")
    }
}
