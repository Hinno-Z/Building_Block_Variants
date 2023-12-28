package net.hinno.variants.datagen;

import net.hinno.variants.datagen.loot.modConcreteBlockLootTables;
import net.hinno.variants.datagen.loot.modTerracottaBlockLootTables;
import net.hinno.variants.datagen.loot.modClayBlockLootTables;
import net.hinno.variants.datagen.loot.modWoodBlockLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class modLootTablesGenerator {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider (output, Set.of (), List.of (
                new LootTableProvider.SubProviderEntry (modConcreteBlockLootTables::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry (modClayBlockLootTables::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry (modTerracottaBlockLootTables::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry (modWoodBlockLootTables::new, LootContextParamSets.BLOCK)
        ));
    }



}
