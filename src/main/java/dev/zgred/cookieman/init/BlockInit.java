package dev.zgred.cookieman.init;

import dev.zgred.cookieman.blocks.CookieSaplingGrow;
import dev.zgred.cookieman.Cookieman;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Cookieman.MODID);

    public static final RegistryObject<Block> COOKIE_GRASS_BLOCK = BLOCKS.register( "cookie_grass_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(0.9f)
                    .dynamicShape()
                    .forceSolidOn()));

    public static final RegistryObject<Block> COOKIE_DIRT = BLOCKS.register( "cookie_dirt",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(0.9f)
                    .dynamicShape()
                    .forceSolidOn()));

    public static final RegistryObject<Block> COOKIE_COBBLESTONE = BLOCKS.register( "cookie_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(10.0f)
                    .dynamicShape()
                    .forceSolidOn()));

    public static final RegistryObject<Block> COOKIE_STONE = BLOCKS.register( "cookie_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(10.0f)
                    .dynamicShape()
                    .forceSolidOn()));

    public static final RegistryObject<Block> COOKIE_STONE_BRICKS = BLOCKS.register( "cookie_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(10.0f)
                    .dynamicShape()
                    .forceSolidOn()));

    public static final RegistryObject<Block> COOKIE_PLANKS = BLOCKS.register( "cookie_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(1.0f)
                    .dynamicShape()
                    .forceSolidOn()));

    public static final RegistryObject<Block> COOKIE_LOG = BLOCKS.register( "cookie_log",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(2.0f)
                    .dynamicShape()
                    .forceSolidOn()));

    public static final RegistryObject<Block> COOKIE_WOOD = BLOCKS.register( "cookie_wood",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(2.0f)
                    .dynamicShape()
                    .forceSolidOn()));

    public static final RegistryObject<Block> COOKIE_LEAVES = BLOCKS.register( "cookie_leaves",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(0.2f)
                    .dynamicShape()
                    .forceSolidOn().noOcclusion().noCollission()));

    public static final RegistryObject<Block> OREO_STONE = BLOCKS.register( "oreo_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(10.0f)
                    .dynamicShape()
                    .forceSolidOn()));

    public static final RegistryObject<Block> OREO_COBBLESTONE = BLOCKS.register( "oreo_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(10.0f)
                    .dynamicShape()
                    .forceSolidOn()));

    public static final RegistryObject<Block> COOKIE_SAPLING = BLOCKS.register("cookie_sapling",
            () -> new SaplingBlock(new CookieSaplingGrow(), BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .noCollission()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .pushReaction(PushReaction.DESTROY)));
}
