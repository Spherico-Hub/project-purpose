package com.spherico.purpose.neoforge;

import net.neoforged.fml.common.Mod;

import com.spherico.purpose.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
