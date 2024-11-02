package net.lelink.awesome.datagen;

import net.lelink.awesome.Awesome;
import net.lelink.awesome.Items.Moditems;
import net.lelink.awesome.block.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public static final List<ItemLike> RUBY_SMELTABLES = List.of(Moditems.RAW_RUBY.get(),
            ModBlocks.RUBY_ORE.get(),ModBlocks.DEEPSLATE_RUBY_ORE.get(),ModBlocks.NETHER_RUBY_ORE.get(),ModBlocks.END_STONE_RUBY_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, RUBY_SMELTABLES,  RecipeCategory.MISC, Moditems.RUBY.get(), 0.30f,150, "ruby");
        oreBlasting(pWriter, RUBY_SMELTABLES,  RecipeCategory.MISC, Moditems.RUBY.get(), 0.30f,150, "ruby");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', Moditems.RUBY.get())
                .unlockedBy(getHasName(Moditems.RUBY.get()), has(Moditems.RUBY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Moditems.METAL_DETECTOR.get())
                .pattern(" CC")
                .pattern(" BC")
                .pattern("B  ")
                .define('C', Items.COPPER_INGOT)
                .define('B', Items.STICK)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(pWriter);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.RUBY_BOOTS.get())

                .pattern("R R")
                .pattern("R R")
                .define('R', Moditems.RUBY.get())
                .unlockedBy(getHasName(Moditems.RUBY.get()), has(Moditems.RUBY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.RUBY_LEGGINGS.get())
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .define('R', Moditems.RUBY.get())
                .unlockedBy(getHasName(Moditems.RUBY.get()), has(Moditems.RUBY.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.RUBY_CHESTPLATE.get())
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', Moditems.RUBY.get())
                .unlockedBy(getHasName(Moditems.RUBY.get()), has(Moditems.RUBY.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.RUBY_HELMET.get())

                .pattern("RRR")
                .pattern("R R")
                .define('R', Moditems.RUBY.get())
                .unlockedBy(getHasName(Moditems.RUBY.get()), has(Moditems.RUBY.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Moditems.RUBY_SWORD.get())
                .pattern("R")
                .pattern("R")
                .pattern("#")
                .define('R', Moditems.RUBY.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(Moditems.RUBY.get()), has(Moditems.RUBY.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Moditems.RUBY_AXE.get())
                .pattern("RR")
                .pattern("#R")
                .pattern("# ")
                .define('R', Moditems.RUBY.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(Moditems.RUBY.get()), has(Moditems.RUBY.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Moditems.RUBY_PICKAXE.get())
                .pattern("RRR")
                .pattern(" # ")
                .pattern(" # ")
                .define('R', Moditems.RUBY.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(Moditems.RUBY.get()), has(Moditems.RUBY.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Moditems.RUBY_SHOVEL.get())
                .pattern("R")
                .pattern("#")
                .pattern("#")
                .define('R', Moditems.RUBY.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(Moditems.RUBY.get()), has(Moditems.RUBY.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Moditems.RUBY_HOE.get())
                .pattern("RR")
                .pattern(" #")
                .pattern(" #")
                .define('R', Moditems.RUBY.get())
                .define('#', Items.STICK)
                .unlockedBy(getHasName(Moditems.RUBY.get()), has(Moditems.RUBY.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Moditems.RUBY_STAFF.get())
                .pattern(" R ")
                .pattern("CCC")
                .pattern(" # ")
                .define('R', Moditems.RUBY.get())
                .define('#', Items.STICK)
                .define('C', Items.COPPER_INGOT)
                .unlockedBy(getHasName(Moditems.RUBY.get()), has(Moditems.RUBY.get()))
                .save(pWriter);




       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Moditems.RUBY.get(), 9)
               .requires(ModBlocks.RUBY_BLOCK.get())
               .unlockedBy(getHasName(ModBlocks.RUBY_BLOCK.get()), has(ModBlocks.RUBY_BLOCK.get()))
               .save(pWriter);
    }


    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, Awesome.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }


}
