package thePackmaster.ui;

import com.badlogic.gdx.graphics.Texture;
import com.evacipated.cardcrawl.mod.stslib.icons.AbstractCustomIcon;
import thePackmaster.util.TexLoader;

public class StrengthTextIcon extends AbstractCustomIcon {
    public static final String ID = "StrengthText";
    private static StrengthTextIcon singleton;
    private static final Texture iconTex = TexLoader.getTexture("anniv5Resources/images/Strength.png");

    public StrengthTextIcon() {super(ID, iconTex);}

    public static StrengthTextIcon get() {
        if (singleton == null) {
            singleton = new StrengthTextIcon();
        }
        return singleton;
    }
}
