package net.lelink.awesome.Items;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class modFoods {
    public static final FoodProperties BISCUIT = new FoodProperties.Builder().fast().nutrition(3)
            .saturationMod(0.3f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100), 0.2f).build();
}
