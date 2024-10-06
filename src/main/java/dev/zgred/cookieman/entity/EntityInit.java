package dev.zgred.cookieman.entity;

import dev.zgred.cookieman.Cookieman;
import dev.zgred.cookieman.entity.custom.OreomanEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType.Builder;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES;
    public static final RegistryObject<EntityType<OreomanEntity>> OREOMAN;
    public EntityInit() {
    }

    public static <T extends Mob> RegistryObject<EntityType<T>> registerMob(String name, EntityType.EntityFactory<T> entity, float width, float height, int primaryEggColor, int secondaryEggColor) {
        RegistryObject<EntityType<T>> entityType = ENTITIES.register(name, () -> {
            return Builder.of(entity, MobCategory.CREATURE).sized(width, height).build(name);
        });
        return entityType;
    }

    static {
        ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Cookieman.MODID);
        OREOMAN = registerMob("oreoman", OreomanEntity::new, 0.7F, 1.3F, 2039583, 855309);
    }
}