package net.dominosq.dqsre4.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.level.Level;

public class HealingItem extends Item {

    private final float healAmount;
    private final boolean increaseMaxHealth;

    public HealingItem(Properties properties, float healAmount, boolean increaseMaxHealth) {
        super(properties);
        this.healAmount = healAmount;
        this.increaseMaxHealth = increaseMaxHealth;
    }

//    @Override
//    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
//        if(entity instanceof Player player) {
//
//            // Heal player
//            player.heal(healAmount);
//
//            // Optional max health increase effect
//            if(increaseMaxHealth) {
//                //
//                // Replace later with permanent HP upgrade system
//                player.addEffect(new MobEffectInstance(
//                        net.minecraft.world.effect.MobEffects.ABSORPTION,
//                        20 * 60, // 1 minute
//                        1
//                ));
//            }
//
//            // Consume item if not creative
//            if(!player.getAbilities().instabuild) {
//                itemStack.shrink(1);
//            }
//        }
//
//        return itemStack;
//    }
//
//    @Override
//    public int getUseDuration(ItemStack itemStack, LivingEntity user) {
//        return 32;
//    }
//
//    @Override
//    public ItemUseAnimation getUseAnimation(ItemStack itemStack) {
//        return ItemUseAnimation.DRINK;
//    }


//    @Override
//    public InteractionResult use(Level level, Player player, InteractionHand hand) {
//        ItemStack itemstack = player.getItemInHand(hand);
//
//        player.startUsingItem(hand);
//
//        return InteractionResult.CONSUME;
//    }
}
