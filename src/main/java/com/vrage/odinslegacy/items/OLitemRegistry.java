package com.vrage.odinslegacy.items;

import com.vrage.odinslegacy.OdinsLegacy;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OLitemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OdinsLegacy.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


    public static final RegistryObject<Item> NORDIC_STEEL = ITEMS.register("nordic_steel", ItemBase::new);

    public static final RegistryObject<Item> MJOLNIR = ITEMS.register("mjolnir", Mjolnir::new);

    public static final RegistryObject<Item> MIDGARDIAN_STEEL_SWORD = ITEMS.register("midgardian_steel_sword", () -> new SwordItem(modItemTier.MIDGARDIAN_STEEL, 3, -2.4f, new Item.Properties().tab(OdinsLegacy.OLTAB) ));
    public static final RegistryObject<Item> MIDGARDIAN_STEEL_PICK = ITEMS.register("midgardian_steel_pick", () -> new PickaxeItem(modItemTier.MIDGARDIAN_STEEL, 1, -2.8f, new Item.Properties().tab(OdinsLegacy.OLTAB) ));
    public static final RegistryObject<Item> MIDGARDIAN_STEEL_AXE = ITEMS.register("midgardian_steel_axe", () -> new AxeItem(modItemTier.MIDGARDIAN_STEEL, 5, -3f, new Item.Properties().tab(OdinsLegacy.OLTAB) ));
    public static final RegistryObject<Item> MIDGARDIAN_STEEL_HOE = ITEMS.register("midgardian_steel_hoe", () -> new HoeItem(modItemTier.MIDGARDIAN_STEEL, -4, 0f, new Item.Properties().tab(OdinsLegacy.OLTAB) ));
    public static final RegistryObject<Item> MIDGARDIAN_STEEL_SHOVEL = ITEMS.register("midgardian_steel_shovel", () -> new ShovelItem(modItemTier.MIDGARDIAN_STEEL, -1, -3f, new Item.Properties().tab(OdinsLegacy.OLTAB) ));





    public static final RegistryObject<Item> RUNE_FRAGMENT = ITEMS.register("rune_fragment", RunicFragment::new);
    public static final RegistryObject<Item> EMPTY_RUNE = ITEMS.register("empty_rune", ()->new RuneBase(""));
    public static final RegistryObject<Item> MUSPELHEIM_RUNE = ITEMS.register("muspelheim_rune", ()->new RuneBase("MuspelheimD"));
    public static final RegistryObject<Item> ALFHEIM_RUNE = ITEMS.register("alfheim_rune", ()->new RuneBase("AlfheimD"));
    public static final RegistryObject<Item> ASGARD_RUNE = ITEMS.register("asgard_rune", ()->new RuneBase("AsgardD"));
    public static final RegistryObject<Item> VANAHEIM_RUNE = ITEMS.register("vanaheim_rune", ()->new RuneBase("VanaheimD"));
    public static final RegistryObject<Item> NIFLHEIM_RUNE = ITEMS.register("niflheim_rune", ()->new RuneBase("NiflheimD"));
    public static final RegistryObject<Item> SVARTALFHEIM_RUNE = ITEMS.register("svartalfheim_rune", ()->new RuneBase("SvartalheimD"));
    public static final RegistryObject<Item> HEL_RUNE = ITEMS.register("hel_rune", ()->new RuneBase("HelD"));
    public static final RegistryObject<Item> JOTUNNHEIM_RUNE = ITEMS.register("jotunnheim_rune", ()->new RuneBase("JotunnheimD"));
}
