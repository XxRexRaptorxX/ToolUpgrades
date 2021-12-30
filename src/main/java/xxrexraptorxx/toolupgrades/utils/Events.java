package xxrexraptorxx.toolupgrades.utils;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.VersionChecker;
import net.minecraftforge.fml.common.Mod;
import xxrexraptorxx.toolupgrades.main.ModItems;
import xxrexraptorxx.toolupgrades.main.References;

import java.util.UUID;

@Mod.EventBusSubscriber(modid = References.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Events {


    /** Update-Checker **/
    private static boolean hasShownUp = false;

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (Config.UPDATE_CHECKER.get()) {
            if (!hasShownUp && Minecraft.getInstance().screen == null) {
                if (VersionChecker.getResult(ModList.get().getModContainerById(References.MODID).get().getModInfo()).status() == VersionChecker.Status.OUTDATED ||
                        VersionChecker.getResult(ModList.get().getModContainerById(References.MODID).get().getModInfo()).status() == VersionChecker.Status.BETA_OUTDATED ) {

                    Minecraft.getInstance().player.sendMessage(new TextComponent(ChatFormatting.BLUE + "A newer version of " + ChatFormatting.YELLOW + References.NAME + ChatFormatting.BLUE + " is available!"), UUID.randomUUID());
                    Minecraft.getInstance().player.sendMessage(new TextComponent(ChatFormatting.GRAY + References.URL), UUID.randomUUID());

                    hasShownUp = true;
                } else if (VersionChecker.getResult(ModList.get().getModContainerById(References.MODID).get().getModInfo()).status() == VersionChecker.Status.FAILED) {
                    System.err.println(References.NAME + "'s version checker failed!");
                }
            }
        }
    }


    /** ENCHANTER **/
    @SubscribeEvent
    public static void enchantBinding(PlayerInteractEvent.RightClickBlock event) {
        Item item = event.getItemStack().getItem();
        Level world = event.getWorld();
        BlockPos pos = event.getPos();
        Player player = event.getPlayer();
        if(Config.PASSIVE_ENCHANTING.get()) {

            if (item == ModItems.BINDING_REDSTONE.get()) {
                if (world.getBlockState(pos).getBlock() == Blocks.BOOKSHELF) {

                    if (player.experienceLevel >= Config.BINDING_ENCHANTING_COST.get()) {

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
                            player.onEnchantmentPerformed(null, Config.BINDING_ENCHANTING_COST.get());
                            player.addItem(new ItemStack(ModItems.BINDING_ENCHANTED.get()));

                            event.setUseBlock(Event.Result.DENY);
                            event.setUseItem(Event.Result.DENY);
                            event.setCanceled(true);
                        }
                    } else {
                        if (world.isClientSide)
                            player.sendMessage(new TranslatableComponent("message.toolupgrades.not_enough_levels", new Object[]{10}), UUID.randomUUID());
                    }
                } else {
                    if (world.isClientSide)
                        player.sendMessage(new TranslatableComponent("message.toolupgrades.wrong_block", new Object[]{10}), UUID.randomUUID());
                }
            }
        }
    }


    @SubscribeEvent
    public static void enchantAdvancedBinding(PlayerInteractEvent.RightClickBlock event) {
        Item item = event.getItemStack().getItem();
        Level world = event.getWorld();
        BlockPos pos = event.getPos();
        Player player = event.getPlayer();

        if(Config.PASSIVE_ENCHANTING.get()) {
            if (item == ModItems.BINDING_ADVANCED.get()) {
                if (world.getBlockState(pos).getBlock() == Blocks.BOOKSHELF) {

                    if (player.experienceLevel >= Config.ADVANCED_BINDING_ENCHANTING_COST.get()) {

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
                            player.onEnchantmentPerformed(null, Config.ADVANCED_BINDING_ENCHANTING_COST.get());
                            player.addItem(new ItemStack(ModItems.BINDING_ENCHANTED_ADVANCED.get()));

                            event.setUseBlock(Event.Result.DENY);
                            event.setUseItem(Event.Result.DENY);
                            event.setCanceled(true);
                        }
                    } else {
                        if (world.isClientSide)
                            player.sendMessage(new TranslatableComponent("message.toolupgrades.not_enough_levels", new Object[]{10}), UUID.randomUUID());
                    }
                } else {
                    if (world.isClientSide)
                        player.sendMessage(new TranslatableComponent("message.toolupgrades.wrong_block", new Object[]{10}), UUID.randomUUID());
                }
            }
        }
    }


}
