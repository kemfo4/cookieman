package dev.zgred.cookieman.init;


import dev.zgred.cookieman.Cookieman;
import dev.zgred.cookieman.init.CustomItem.AxoArmorInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Cookieman.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ItemInit.AXO_HELMET);
    }

    private void simpleItem(RegistryObject<AxoArmorInit> axoHelmet) {
    }
}