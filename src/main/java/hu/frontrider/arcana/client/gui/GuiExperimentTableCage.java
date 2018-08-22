package hu.frontrider.arcana.client.gui;

import hu.frontrider.arcana.blocks.tiles.TileEntityExperimentTable;
import net.minecraft.block.Block;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static hu.frontrider.arcana.ThaumicArcana.MODID;

public class GuiExperimentTableCage extends GuiContainer {
    @GameRegistry.ObjectHolder(MODID + ":experiment_table")
    Block experimentTable = null;

    private static final ResourceLocation BG_TEXTURE = new ResourceLocation(MODID + ":textures/gui/experiment_table_cage.png");
    private InventoryPlayer playerInv;
    private final TileEntityExperimentTable experimentTableTileEntity;

    public GuiExperimentTableCage(Container container, InventoryPlayer playerInv, TileEntityExperimentTable experimentTableTileEntity) {
        super(container);
        this.playerInv = playerInv;
        this.experimentTableTileEntity = experimentTableTileEntity;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1, 1, 1, 1);
        mc.getTextureManager().bindTexture(BG_TEXTURE);
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        super.drawGuiContainerForegroundLayer(mouseX, mouseY);
    }
}