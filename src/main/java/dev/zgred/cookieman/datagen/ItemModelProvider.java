package dev.zgred.cookieman.datagen;

import dev.zgred.cookieman.Cookieman;
import dev.zgred.cookieman.init.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
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
        handheld(ItemInit.COOKIE_AXE);
        handheld(ItemInit.COOKIE_HOE);
        handheld(ItemInit.COOKIE_PICKAXE);
        handheld(ItemInit.COOKIE_SHOVEL);
        handheld(ItemInit.COOKIE_SWORD);
        simpleItem(ItemInit.GOLD_COOKIE);
        simpleItem(ItemInit.HONEY_COOKIE);
        simpleItem(ItemInit.MACAROONS);
        simpleItem(ItemInit.RAW_COOKIE_INGOT);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Cookieman.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheld(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Cookieman.MODID, "item/" + item.getId().getPath()));
    }
}
