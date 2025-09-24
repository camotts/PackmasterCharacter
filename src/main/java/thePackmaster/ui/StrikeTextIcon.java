package thePackmaster.ui;

import com.badlogic.gdx.graphics.Texture;
import com.evacipated.cardcrawl.mod.stslib.icons.AbstractCustomIcon;
import thePackmaster.util.TexLoader;

public class StrikeTextIcon extends AbstractCustomIcon {
    public static final String ID = "StrikeText";
    private static StrikeTextIcon singleton;
    private static final Texture iconTex = TexLoader.getTexture("anniv5Resources/images/Strike.png");

    public StrikeTextIcon() {super(ID, iconTex);}

    public static StrikeTextIcon get() {
        if (singleton == null) {
            singleton = new StrikeTextIcon();
        }
        return singleton;
    }
}
