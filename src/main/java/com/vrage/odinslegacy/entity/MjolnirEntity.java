package com.vrage.odinslegacy.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.IPacket;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class MjolnirEntity extends ArrowEntity {
    private final LivingEntity owner;
    public MjolnirEntity(World world, LivingEntity shooter) {
        super(world, shooter);
        owner = shooter;
    }

    protected ItemStack getArrowStack() {
        // Replace with your desired item representation
        return new ItemStack(Items.DIAMOND_AXE);
    }

    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
