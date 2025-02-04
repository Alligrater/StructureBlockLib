package com.github.shynixn.structureblocklibsample;

import com.github.shynixn.structureblocklib.bukkit.api.StructureBlockApi;
import com.github.shynixn.structureblocklibsample.commandexecutor.StructureBlockCommandExecutor;
import com.github.shynixn.structureblocklibsample.commandexecutor.StructureCommandExecutor;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Shynixn 2019.
 * <p>
 * Version 1.2
 * <p>
 * MIT License
 * <p>
 * Copyright (c) 2019 by Shynixn
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
public class StructureBlockLibSamplePlugin extends JavaPlugin {
    private static final String PREFIX_CONSOLE = ChatColor.YELLOW + "[SDemo] ";

    /**
     * On plugin enable.
     */
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(PREFIX_CONSOLE + ChatColor.GREEN + "Loading StructureBlockLibSample...");

        this.getCommand("structure").setExecutor(new StructureCommandExecutor(StructureBlockApi.INSTANCE.getStructurePersistenceService()));
        this.getCommand("structureblock").setExecutor(new StructureBlockCommandExecutor(StructureBlockApi.INSTANCE.getStructureBlockService()));

        Bukkit.getConsoleSender().sendMessage(PREFIX_CONSOLE + ChatColor.GREEN + "Enabled StructureBlockLibSample " + this.getDescription().getVersion() + " by Shynixn");
    }
}
