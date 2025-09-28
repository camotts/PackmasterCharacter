package thePackmaster.ui;

import com.badlogic.gdx.graphics.Texture;
import com.evacipated.cardcrawl.mod.stslib.icons.AbstractCustomIcon;
import thePackmaster.util.TexLoader;


public class InspirationTextIcon extends AbstractCustomIcon {
    public static final String ID = "InspirationText";
    private static InspirationTextIcon singleton;
    private static final Texture iconTex = TexLoader.getTexture("anniv5Resources/images/powers/Inspiration84.png");

    public InspirationTextIcon() {super(ID, iconTex);}

    public static InspirationTextIcon get() {
        if (singleton == null) {
            singleton = new InspirationTextIcon();
        }
        return singleton;
    }
}
