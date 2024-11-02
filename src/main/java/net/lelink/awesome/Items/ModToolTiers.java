package net.lelink.awesome.Items;

import net.lelink.awesome.Awesome;
import net.lelink.awesome.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier RUBY = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1900, 13f,4f,22,
                    ModTags.Blocks.NEEDS_RUBY_TOOL, () -> Ingredient.of(Moditems.RUBY.get())),
            new ResourceLocation(Awesome.MOD_ID, "ruby"), List.of(Tiers.NETHERITE), List.of()
    );

}
