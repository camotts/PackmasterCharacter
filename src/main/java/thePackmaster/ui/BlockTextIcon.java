package thePackmaster.ui;

import com.badlogic.gdx.graphics.Texture;
import com.evacipated.cardcrawl.mod.stslib.icons.AbstractCustomIcon;
import thePackmaster.util.TexLoader;

public class BlockTextIcon extends AbstractCustomIcon {
    public static final String ID = "BlockText";
    private static BlockTextIcon singleton;
    private static final Texture iconTex = TexLoader.getTexture("anniv5Resources/images/Defend.png");

    public BlockTextIcon() {super(ID, iconTex);}

    public static BlockTextIcon get() {
        if (singleton == null) {
            singleton = new BlockTextIcon();
        }
        return singleton;
    }
}
