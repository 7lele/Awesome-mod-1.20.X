package net.lelink.awesome.block;

import net.lelink.awesome.Awesome;
import net.lelink.awesome.Items.Moditems;
import net.lelink.awesome.block.customs.SoundBlock;
import net.lelink.awesome.block.customs.TomatoCropBlock;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Awesome.MOD_ID);


    public static final RegistryObject<Block> RUBY_BLOCK = registerBlocks("ruby_block", //copier ca pour creer un autre block
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.FROGLIGHT)));

    public static final RegistryObject<Block> RUBY_ORE = registerBlocks("ruby_ore", //copier ca pour creer un autre block
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlocks("deepslate_ruby_ore", //copier ca pour creer un autre block
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHER_RUBY_ORE = registerBlocks("nether_ruby_ore", //copier ca pour creer un autre block
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,7)));
    public static final RegistryObject<Block> END_STONE_RUBY_ORE = registerBlocks("end_stone_ruby_ore", //copier ca pour creer un autre block
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3,7)));


    public static final RegistryObject<Block> SOUND_BLOCK= registerBlocks("sound_block", //copier ca pour creer un autre block
            () -> new SoundBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));







    public static final RegistryObject<Block> RUBY_STAIRS = registerBlocks("ruby_stairs",
            () -> new StairBlock(() -> ModBlocks.RUBY_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> RUBY_SLAB = registerBlocks("ruby_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> RUBY_BUTTON = registerBlocks("ruby_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.IRON, 40, true));

    public static final RegistryObject<Block> RUBY_PRESSURE_PLATE = registerBlocks("ruby_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.WOOD),
                    BlockSetType.IRON));

    public static final RegistryObject<Block> RUBY_FENCE = registerBlocks("ruby_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> RUBY_FENCE_GATE = registerBlocks("ruby_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.WOOD), SoundEvents.CHERRY_WOOD_DOOR_OPEN, SoundEvents.BAMBOO_WOOD_DOOR_CLOSE));

    public static final RegistryObject<Block> RUBY_WALL = registerBlocks("ruby_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> RUBY_DOOR = registerBlocks("ruby_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.WOOD).noOcclusion(), BlockSetType.IRON));

    public static final RegistryObject<Block> RUBY_TRAPDOOR = registerBlocks("ruby_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.WOOD).noOcclusion(), BlockSetType.IRON));

    public static final RegistryObject<Block> TOMATO_CROP = registerBlocks("tomato_crop",
            () -> new TomatoCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).sound(SoundType.SWEET_BERRY_BUSH).noOcclusion().noCollission()));






    private static <T extends Block> RegistryObject<T> registerBlocks(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;

    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }




    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
