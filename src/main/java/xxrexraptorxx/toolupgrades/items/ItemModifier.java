package xxrexraptorxx.toolupgrades.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
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
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "Bind effects on it..."));

        } else if (this == ModItems.MODIFIER_BLAZE.get() || this == ModItems.MODIFIER_ADVANCED_BLAZE.get()) {
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "+ fire aspect"));
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "+ fire protection"));

        } else if (this == ModItems.MODIFIER_BONE.get() || this == ModItems.MODIFIER_ADVANCED_BONE.get()) {
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "+ sweeping"));

        } else if (this == ModItems.MODIFIER_CLAY.get() || this == ModItems.MODIFIER_ADVANCED_CLAY.get()) {
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "+ unbreaking"));
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "+ infinity"));


        } else if (this == ModItems.MODIFIER_GLOWSTONE.get() || this == ModItems.MODIFIER_ADVANCED_GLOWSTONE.get()) {
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "+ fortune"));
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "+ looting"));


        } else if (this == ModItems.MODIFIER_GUNPOWDER.get() || this == ModItems.MODIFIER_ADVANCED_GUNPOWDER.get()) {
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "+ knockback"));
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "+ blast protection"));

        } else if (this == ModItems.MODIFIER_INK.get() || this == ModItems.MODIFIER_ADVANCED_INK.get()) {
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "+ thorns"));

        } else if (this == ModItems.MODIFIER_LAPIS.get() || this == ModItems.MODIFIER_ADVANCED_LAPIS.get()) {
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "+ sharpness"));

        } else if (this == ModItems.MODIFIER_REDSTONE.get() || this == ModItems.MODIFIER_ADVANCED_REDSTONE.get()) {
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "+ mending"));

        } else if (this == ModItems.MODIFIER_SLIME.get() || this == ModItems.MODIFIER_ADVANCED_SLIME.get()) {
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "+ silk touch"));
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "+ protection"));

        } else if (this == ModItems.MODIFIER_SUGAR.get() || this == ModItems.MODIFIER_ADVANCED_SUGAR.get()) {
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "+ efficiency"));
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "+ depth strider"));

        } else if (this == ModItems.MODIFIER_CURSED.get()) {
            tooltip.add(new TextComponent(ChatFormatting.OBFUSCATED + "+ cursed effects"));

        } else {
            tooltip.add(new TextComponent(ChatFormatting.DARK_PURPLE + "???"));
        }
    }

}
