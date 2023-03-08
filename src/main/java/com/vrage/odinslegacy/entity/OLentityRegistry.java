package com.vrage.odinslegacy.entity;

import com.vrage.odinslegacy.OdinsLegacy;
import com.vrage.odinslegacy.items.ItemBase;
import com.vrage.odinslegacy.items.Mjolnir;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

import javax.swing.text.html.parser.Entity;
@Mod.EventBusSubscriber(modid = "your_mod_id", bus = Mod.EventBusSubscriber.Bus.MOD)
public class OLentityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, OdinsLegacy.MOD_ID);

    public static void register(IEventBus eventBus){
        ENTITIES.register(eventBus);
    }

//    public static final EntityType<?> CHOCOLATE_SLIME = ENTITIES.register("chocolate_slime", EntityType.Builder.<ZombieEntity>create(ZombieEntity::new, EntityClassification.MONSTER);

}
