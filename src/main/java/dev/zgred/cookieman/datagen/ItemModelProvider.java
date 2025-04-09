package dev.zgred.cookieman.datagen;

import dev.zgred.cookieman.Cookieman;
import dev.zgred.cookieman.init.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {
    public ItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ItemInit.COOKIE_INGOT);
        handheldaxe(ItemInit.COOKIE_AXE);
        handheldhoe(ItemInit.COOKIE_HOE);
        handheldpickaxe(ItemInit.COOKIE_PICKAXE);
        handheldshovel(ItemInit.COOKIE_SHOVEL);
        handheldsword(ItemInit.COOKIE_SWORD);
        simpleItem(ItemInit.GOLD_COOKIE);
        simpleItem(ItemInit.HONEY_COOKIE);
        simpleItem(ItemInit.MACAROONS);
        simpleItem(ItemInit.RAW_COOKIE_INGOT);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Cookieman.MODID, "items/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldaxe(RegistryObject<AxeItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Cookieman.MODID, "items" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldhoe(RegistryObject<HoeItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Cookieman.MODID, "items" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldpickaxe(RegistryObject<PickaxeItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Cookieman.MODID, "items" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldshovel(RegistryObject<ShovelItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Cookieman.MODID, "items" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldsword(RegistryObject<SwordItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Cookieman.MODID, "items/" + item.getKey()));
    }
}
