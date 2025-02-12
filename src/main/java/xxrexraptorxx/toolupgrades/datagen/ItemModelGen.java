package xxrexraptorxx.toolupgrades.datagen;

import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.resources.ResourceLocation;
import xxrexraptorxx.toolupgrades.registry.ModItems;

import java.util.function.BiConsumer;

public class ItemModelGen extends ItemModelGenerators {

    public ItemModelGen(ItemModelOutput itemModelOutput, BiConsumer<ResourceLocation, ModelInstance> modelOutput) {
        super(itemModelOutput, modelOutput);
    }


    @Override
    public void run() {

        this.generateFlatItem(ModItems.PASTE_BLAZE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.PASTE_GLOWSTONE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.PASTE_REDSTONE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.PASTE_SUGAR.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.PASTE_BONE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.PASTE_CLAY.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.PASTE_SLIME.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.PASTE_INK.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.PASTE_LAPIS.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.PASTE_GUNPOWDER.get(), ModelTemplates.FLAT_ITEM);

        this.generateFlatItem(ModItems.BINDING_REDSTONE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.BINDING_ENCHANTED.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.BINDING_ADVANCED.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.BINDING_ENCHANTED_ADVANCED.get(), ModelTemplates.FLAT_ITEM);

        this.generateFlatItem(ModItems.MODIFIER_BLANK.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_BLAZE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_GLOWSTONE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_REDSTONE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_SUGAR.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_BONE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_CLAY.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_SLIME.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_INK.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_LAPIS.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_GUNPOWDER.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_CURSED.get(), ModelTemplates.FLAT_ITEM);

        this.generateFlatItem(ModItems.MODIFIER_ADVANCED_BLANK.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_ADVANCED_BLAZE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_ADVANCED_GLOWSTONE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_ADVANCED_REDSTONE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_ADVANCED_SUGAR.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_ADVANCED_BONE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_ADVANCED_CLAY.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_ADVANCED_SLIME.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_ADVANCED_INK.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_ADVANCED_LAPIS.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.MODIFIER_ADVANCED_GUNPOWDER.get(), ModelTemplates.FLAT_ITEM);
    }

}
