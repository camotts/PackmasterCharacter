package thePackmaster.ui;

import com.badlogic.gdx.graphics.Texture;
import com.evacipated.cardcrawl.mod.stslib.icons.AbstractCustomIcon;
import thePackmaster.util.TexLoader;

public class WeakenedTextIcon extends AbstractCustomIcon {
    public static final String ID = "WeakenedText";
    private static WeakenedTextIcon singleton;
    private static final Texture iconTex = TexLoader.getTexture("anniv5Resources/images/Weak.png");

    public WeakenedTextIcon() {super(ID, iconTex);}

    public static WeakenedTextIcon get() {
        if (singleton == null) {
            singleton = new WeakenedTextIcon();
        }
        return singleton;
    }
}
