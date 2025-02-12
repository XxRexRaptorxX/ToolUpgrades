package xxrexraptorxx.toolupgrades.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import xxrexraptorxx.toolupgrades.registry.ModItems;

import java.util.List;

public class ItemModifier extends Item {

    public ItemModifier(Item.Properties properties) {
        super(properties
            .rarity(Rarity.UNCOMMON)
            .stacksTo(16)
        );

    }


    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }


    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        if(this == ModItems.MODIFIER_BLANK.get() || this == ModItems.MODIFIER_ADVANCED_BLANK.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "Bind effects on it..."));

        } else if (this == ModItems.MODIFIER_BLAZE.get() || this == ModItems.MODIFIER_ADVANCED_BLAZE.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.FIRE_ASPECT)));
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.FIRE_PROTECTION)));

        } else if (this == ModItems.MODIFIER_BONE.get() || this == ModItems.MODIFIER_ADVANCED_BONE.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.SWEEPING_EDGE)));

        } else if (this == ModItems.MODIFIER_CLAY.get() || this == ModItems.MODIFIER_ADVANCED_CLAY.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.UNBREAKING)));
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.INFINITY)));


        } else if (this == ModItems.MODIFIER_GLOWSTONE.get() || this == ModItems.MODIFIER_ADVANCED_GLOWSTONE.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.FORTUNE)));
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.LOOTING)));


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
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.PROTECTION)));

        } else if (this == ModItems.MODIFIER_SUGAR.get() || this == ModItems.MODIFIER_ADVANCED_SUGAR.get()) {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.EFFICIENCY)));
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "+ " + fixEnchantmentName(Enchantments.DEPTH_STRIDER)));

        } else if (this == ModItems.MODIFIER_CURSED.get()) {
            tooltip.add(Component.literal( ChatFormatting.OBFUSCATED + "+ Curses").withStyle(ChatFormatting.DARK_PURPLE));

        } else {
            tooltip.add(Component.literal(ChatFormatting.DARK_PURPLE + "???"));
        }
    }


    private static String fixEnchantmentName(ResourceKey<Enchantment> enchantment) {
        String name = enchantment.location().getPath().replace("_", " ");

        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

}
