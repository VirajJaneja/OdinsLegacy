package com.vrage.odinslegacy.items;

import net.minecraft.block.material.Material;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum modItemTier implements IItemTier {

    LEGENDARY(0, 0, 1, 20, 0),
    MIDGARDIAN_STEEL(3,1102,8.5f,4f,13),
    MIDGARDIAN_RUNESTEEL(3,1602,9.5f,4.5f,15);


    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;


    modItemTier(int HarvestLevel, int MaxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
        harvestLevel = HarvestLevel;
        maxUses = MaxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    modItemTier(int HarvestLevel, int MaxUses, float efficiency, float attackDamage, int enchantability){
        harvestLevel = HarvestLevel;
        maxUses = MaxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        repairMaterial = null;
    }

    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }
}
