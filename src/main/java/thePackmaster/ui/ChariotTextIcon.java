package thePackmaster.ui;

import com.badlogic.gdx.graphics.Texture;
import com.evacipated.cardcrawl.mod.stslib.icons.AbstractCustomIcon;
import thePackmaster.util.TexLoader;


public class ChariotTextIcon extends AbstractCustomIcon {
    public static final String ID = "ChariotText";
    private static ChariotTextIcon singleton;
    private static final Texture iconTex = TexLoader.getTexture("anniv5Resources/images/powers/TheChariotPower84.png");

    public ChariotTextIcon() {super(ID, iconTex);}

    public static ChariotTextIcon get() {
        if (singleton == null) {
            singleton = new ChariotTextIcon();
        }
        return singleton;
    }
}
