package net.xstarlotte.snsnf.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.xstarlotte.snsnf.block.SNSBlock;

import java.util.Set;

public class SNSBlockLootTableProvider extends BlockLootSubProvider {
    protected SNSBlockLootTableProvider(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }
    @Override
    protected void generate() {


        dropSelf(SNSBlock.CANDY_CANE_COBBLESTONE.get());
        dropSelf(SNSBlock.CANDY_CANE_COBBLESTONE_BUTTON.get());
        this.add(SNSBlock.CANDY_CANE_COBBLESTONE_COAL_ORE.get(),
                block -> createMultipleOreDrops(SNSBlock.CANDY_CANE_COBBLESTONE_COAL_ORE.get(), Items.COAL, 2, 5));
        this.add(SNSBlock.CANDY_CANE_COBBLESTONE_DOOR.get(),
                block -> createDoorTable(SNSBlock.CANDY_CANE_COBBLESTONE.get()));
        dropSelf(SNSBlock.CANDY_CANE_COBBLESTONE_PRESSURE_PLATE.get());
        this.add(SNSBlock.CANDY_CANE_COBBLESTONE_SLAB.get(),
                block -> createSlabItemTable(SNSBlock.CANDY_CANE_COBBLESTONE_SLAB.get()));
        dropSelf(SNSBlock.CANDY_CANE_COBBLESTONE_STAIRS.get());
        dropSelf(SNSBlock.CANDY_CANE_COBBLESTONE_TRAPDOOR.get());
        dropSelf(SNSBlock.CANDY_CANE_COBBLESTONE_WALL.get());

    }
    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return SNSBlock.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
