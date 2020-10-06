package bloxboss6.mod.objects.items.quiz;

import bloxboss6.mod.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class GuiQuiz extends GuiScreen {

    private final int quizImageHeight = 192;
    private final int quizImageWidth = 192;
    private int currPage = 0;
    private static final int quizTotalPages = 4;
    private static ResourceLocation[] quizPageTextures = new ResourceLocation[quizTotalPages];
    private static String[] stringPageText = new String[quizTotalPages];
    private GuiButton buttonDone;
    private NextPageButton buttonNextPage;
    private NextPageButton buttonPreviousPage;

    public GuiQuiz() {
        quizPageTextures[0] = new ResourceLocation(Reference.MODID + ":textures/gui/quiz_cover.png");
        quizPageTextures[1] = new ResourceLocation(Reference.MODID + ":textures/gui/quiz.png");
        quizPageTextures[2] = new ResourceLocation(Reference.MODID + ":textures/gui/quiz.png");
        stringPageText[0] = "";
        stringPageText[1] = "The Mysterious Stranger admired your family cow and asked if it was for sale.\n\nWhen you nodded, he offered to trade some Magic Beans, that (if planted in tilled dirt) would lead to more wealth than you could imagine.";
        stringPageText[2] = "So you handed him your cow, and grabbed the Magic Beans.\n\nPleased with yourself, you hurried away, looking for tilled dirt in which to plant the Magic Beans.\n\nYou couldn't wait to see how proud your mother would be for";
        stringPageText[3] = "being so shrewd!  Untold wealth in return for an old, milkless cow; what a good deal you made!\n\nSo off you went, looking for a place to plant the Magic Beans with room to grow...";
    }

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    @Override
    public void initGui() {
        if(Minecraft.getMinecraft().gameSettings.guiScale==1)
        {
            Minecraft.getMinecraft().gameSettings.guiScale=2;
            ScaledResolution res = new ScaledResolution(this.mc);
            this.width = res.getScaledWidth();
            this.height = res.getScaledHeight();
            Minecraft.getMinecraft().gameSettings.guiScale=1;
        }

        // DEBUG
        System.out.println("GuiQuiz initGUI()");
        buttonList.clear();
        Keyboard.enableRepeatEvents(true);

        buttonDone = this.addButton(new GuiButton(0, width / 2 + 2, 4 + quizImageHeight, 98, 20, I18n.format("gui.done", new Object[0])));

        buttonList.add(buttonDone);
        int offsetFromScreenLeft = (width - quizImageWidth) / 2;
        this.buttonNextPage = this.addButton(new NextPageButton(1, offsetFromScreenLeft + 120, 156, true));
        this.buttonPreviousPage = this.addButton(new NextPageButton(2, offsetFromScreenLeft + 38, 156, false));
    }

    /**
     * Called from the main game loop to update the screen.
     */
    @Override
    public void updateScreen() {
        buttonDone.visible = (currPage == quizTotalPages - 1);
        buttonNextPage.visible = (currPage < quizTotalPages - 1);
        buttonPreviousPage.visible = currPage > 0;
    }

    /**
     * Draws the screen and all the components in it.
     */
    @Override
    public void drawScreen(int parWidth, int parHeight, float p_73863_3_) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (currPage == 0) {
            mc.getTextureManager().bindTexture(quizPageTextures[0]);
        } else {
            mc.getTextureManager().bindTexture(quizPageTextures[1]);
        }
        int offsetFromScreenLeft = (width - quizImageWidth ) / 2;
        drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, quizImageWidth, quizImageHeight);

        int widthOfString;
        String stringPageIndicator = I18n.format("quiz.pageIndicator", currPage + 1, quizTotalPages);
        widthOfString = fontRenderer.getStringWidth(stringPageIndicator);
        fontRenderer.drawString(stringPageIndicator, offsetFromScreenLeft - widthOfString + quizImageWidth - 44, 18, 0);
        fontRenderer.drawSplitString(stringPageText[currPage], offsetFromScreenLeft + 36, 34, 116, 0);
        super.drawScreen(parWidth, parHeight, p_73863_3_);
    }

    /**
     * Called when a mouse button is pressed and the mouse is moved around. 
     * Parameters are : mouseX, mouseY, lastButtonClicked & 
     * timeSinceMouseClick.
     */
    @Override
    protected void mouseClickMove(int parMouseX, int parMouseY, int parLastButtonClicked, long parTimeSinceMouseClick) {}

    @Override
    protected void actionPerformed(GuiButton parButton) {
        if (parButton == buttonDone) {
            // You can send a packet to server here if you need server to do 
            // something
            this.mc.displayGuiScreen((GuiScreen)null);
        } else if (parButton == buttonNextPage) {
            if (currPage < quizTotalPages - 1) {
                ++currPage;
            }
        } else if (parButton == buttonPreviousPage) {
            if (currPage > 0) {
                --currPage;
            }
        }
    }

    /**
     * Called when the screen is unloaded. Used to disable keyboard repeat
     * events
     */
    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents(false);
    }

    /**
     * Returns true if this GUI should pause the game when it is displayed in
     * single-player
     */
    @Override
    public boolean doesGuiPauseGame() {
        return true;
    }

    @SideOnly(Side.CLIENT)
    static class NextPageButton extends GuiButton {
        private final boolean isNextButton;

        public NextPageButton(int parButtonId, int parPosX, int parPosY, boolean parIsNextButton) {
            super(parButtonId, parPosX, parPosY, 23, 13, "");
            isNextButton = parIsNextButton;
        }

        /**
         * Draws this button to the screen.
         */
        public void drawButton(Minecraft mc, int parX, int parY, float partialTicks) {
            if (visible) {
                boolean isButtonPressed = (parX >= this.x && parY >= this.y && parX < this.x + this.width && parY < this.y + this.height);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                mc.getTextureManager().bindTexture(quizPageTextures[1]);
                int textureX = 0;
                int textureY = 192;

                if (isButtonPressed) {
                    textureX += 23;
                }

                if (!isNextButton) {
                    textureY += 13;
                }

                drawTexturedModalRect(this.x, this.y, textureX, textureY, 23, 13);
            }
        }
    }

}
