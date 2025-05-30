package xxrexraptorxx.toolupgrades.utils;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.TriState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import xxrexraptorxx.magmacore.utils.FormattingHelper;
import xxrexraptorxx.toolupgrades.main.References;
import xxrexraptorxx.toolupgrades.registry.ModItems;


@EventBusSubscriber(modid = References.MODID, bus = EventBusSubscriber.Bus.GAME)
public class Events {

    /** ENCHANTER **/
    @SubscribeEvent
    public static void enchantBinding(PlayerInteractEvent.RightClickBlock event) {
        Item item = event.getItemStack().getItem();
        Level world = event.getLevel();
        BlockPos pos = event.getPos();
        Player player = event.getEntity();

        if(Config.getPassiveEnchanting()) {
            if (item == ModItems.BINDING_REDSTONE.get()) {
                if (world.getBlockState(pos).getBlock() == Blocks.BOOKSHELF) {

                    if (player.experienceLevel >= Config.getBindingEnchantingCost()) {

                        world.playSound((Player) null, pos, SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.BLOCKS, 0.5F, world.random.nextFloat() * 0.15F + 0.F);

                        for (int i = 0; i < 2; i++) {
                            world.addParticle(ParticleTypes.LAVA, pos.getX() + 0.5F, pos.getY() + 1.3F, pos.getZ() + 0.5F, 0.0D, 0.0D, 0.0D);
                            world.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() + 1.1F, pos.getY() + 0.5F, pos.getZ() + 0.5F, 0.0D, 0.0D, 0.0D);
                            world.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() - 0.1F, 0.0D, 0.0D, 0.0D);
                            world.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() - 0.1F, pos.getY() + 0.5F, pos.getZ() + 0.5F, 0.0D, 0.0D, 0.0D);
                            world.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() + 1.1F, 0.0D, 0.0D, 0.0D);
                        }

                        if (!world.isClientSide) {
                            event.getItemStack().shrink(1);
                            player.onEnchantmentPerformed(null, Config.getBindingEnchantingCost());
                            player.addItem(new ItemStack(ModItems.BINDING_ENCHANTED.get()));

                            event.setUseBlock(TriState.FALSE);
                            event.setUseItem(TriState.FALSE);
                            event.setCanceled(true);
                        }

                    } else {
                        if (world.isClientSide)
                            player.displayClientMessage(FormattingHelper.setModLangComponent("message", References.MODID, "not_enough_levels"), true);
                    }
                } else {
                    if (world.isClientSide)
                        player.displayClientMessage(FormattingHelper.setModLangComponent("message", References.MODID, "wrong_block"), true);
                }
            }
        }
    }


    @SubscribeEvent
    public static void enchantAdvancedBinding(PlayerInteractEvent.RightClickBlock event) {
        Item item = event.getItemStack().getItem();
        Level world = event.getLevel();
        BlockPos pos = event.getPos();
        Player player = event.getEntity();

        if(Config.getPassiveEnchanting()) {
            if (item == ModItems.BINDING_ADVANCED.get()) {
                if (world.getBlockState(pos).getBlock() == Blocks.BOOKSHELF) {

                    if (player.experienceLevel >= Config.getAdvancedBindingEnchantingCost()) {

                        world.playSound((Player) null, pos, SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.BLOCKS, 0.5F, world.random.nextFloat() * 0.15F + 0.F);

                        for (int i = 0; i < 2; i++) {
                            world.addParticle(ParticleTypes.LAVA, pos.getX() + 0.5F, pos.getY() + 1.3F, pos.getZ() + 0.5F, 0.0D, 0.0D, 0.0D);
                            world.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() + 1.1F, pos.getY() + 0.5F, pos.getZ() + 0.5F, 0.0D, 0.0D, 0.0D);
                            world.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() - 0.1F, 0.0D, 0.0D, 0.0D);
                            world.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() - 0.1F, pos.getY() + 0.5F, pos.getZ() + 0.5F, 0.0D, 0.0D, 0.0D);
                            world.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() + 1.1F, 0.0D, 0.0D, 0.0D);
                        }

                        if (!world.isClientSide) {
                            event.getItemStack().shrink(1);
                            player.onEnchantmentPerformed(null, Config.getAdvancedBindingEnchantingCost());
                            player.addItem(new ItemStack(ModItems.BINDING_ENCHANTED_ADVANCED.get()));

                            event.setUseBlock(TriState.FALSE);
                            event.setUseItem(TriState.FALSE);
                            event.setCanceled(true);
                        }
                    } else {
                        if (world.isClientSide)
                            player.displayClientMessage(FormattingHelper.setModLangComponent("message",References.MODID, "not_enough_levels"), true);
                    }
                } else {
                    if (world.isClientSide)
                        player.displayClientMessage(FormattingHelper.setModLangComponent("message",References.MODID, "wrong_block"), true);
                }
            }
        }
    }

}
