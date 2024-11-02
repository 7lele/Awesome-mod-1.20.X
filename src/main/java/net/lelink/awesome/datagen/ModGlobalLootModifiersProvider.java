package net.lelink.awesome.datagen;

import net.lelink.awesome.Awesome;
import net.lelink.awesome.Items.Moditems;
import net.lelink.awesome.loot.AddItemModifier;
import net.lelink.awesome.loot.AddSusSandModifier;
import net.minecraft.data.PackOutput;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {

    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Awesome.MOD_ID);
    }

    @Override
    protected void start() {
        add("pine_cone_from_leaves", new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.OAK_LEAVES).build(),
                LootItemRandomChanceCondition.randomChance(0.20f).build()}, Moditems.PINE_CONE.get() ));
        add("biscuit_from_zombie", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/creeper")).build()}, Moditems.BISCUIT.get()));
        add("metal_detector_from_temples", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/buried_treasure")).build()}, Moditems.METAL_DETECTOR.get()));

        add("metal_detector_from_suspicious_sand", new AddSusSandModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_pyramid")).build()}, Moditems.METAL_DETECTOR.get()));


    }
}
