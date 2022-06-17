package xxrexraptorxx.toolupgrades.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import xxrexraptorxx.toolupgrades.main.ModItems;
import xxrexraptorxx.toolupgrades.utils.ItemGroup;

import javax.annotation.Nullable;
import java.util.List;

public class ItemModifier extends Item {

    public ItemModifier() {
        super(new Properties()
            .tab(ItemGroup.MOD_TAB)
            .rarity(Rarity.UNCOMMON)
            .stacksTo(16)
        );

    }


    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }


    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flags) {
        if(this == ModItems.MODIFIER_BLANK.get() || this == ModItems.MODIFIER_ADVANCED_BLANK.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "Bind effects on it..."));

        } else if (this == ModItems.MODIFIER_BLAZE.get() || this == ModItems.MODIFIER_ADVANCED_BLAZE.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.FIRE_ASPECT)));
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.FIRE_PROTECTION)));

        } else if (this == ModItems.MODIFIER_BONE.get() || this == ModItems.MODIFIER_ADVANCED_BONE.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.SWEEPING_EDGE)));

        } else if (this == ModItems.MODIFIER_CLAY.get() || this == ModItems.MODIFIER_ADVANCED_CLAY.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.UNBREAKING)));
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.INFINITY_ARROWS)));


        } else if (this == ModItems.MODIFIER_GLOWSTONE.get() || this == ModItems.MODIFIER_ADVANCED_GLOWSTONE.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.BLOCK_FORTUNE)));
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.MOB_LOOTING)));


        } else if (this == ModItems.MODIFIER_GUNPOWDER.get() || this == ModItems.MODIFIER_ADVANCED_GUNPOWDER.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.KNOCKBACK)));
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.BLAST_PROTECTION)));

        } else if (this == ModItems.MODIFIER_INK.get() || this == ModItems.MODIFIER_ADVANCED_INK.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.THORNS)));

        } else if (this == ModItems.MODIFIER_LAPIS.get() || this == ModItems.MODIFIER_ADVANCED_LAPIS.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.SHARPNESS)));

        } else if (this == ModItems.MODIFIER_REDSTONE.get() || this == ModItems.MODIFIER_ADVANCED_REDSTONE.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.MENDING)));

        } else if (this == ModItems.MODIFIER_SLIME.get() || this == ModItems.MODIFIER_ADVANCED_SLIME.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.SILK_TOUCH)));
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.ALL_DAMAGE_PROTECTION)));

        } else if (this == ModItems.MODIFIER_SUGAR.get() || this == ModItems.MODIFIER_ADVANCED_SUGAR.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.BLOCK_EFFICIENCY)));
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.DEPTH_STRIDER)));

        } else if (this == ModItems.MODIFIER_CURSED.get()) {
            tooltip.add(Component.literal(ChatFormatting.OBFUSCATED + "+ Curses"));

        } else {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "???"));
        }
    }


    private static String fixEnchantmentName(Enchantment enchantment) {
        return enchantment.getFullname(0).getString().replaceAll("enchantment.level.0", "");
    }

}
