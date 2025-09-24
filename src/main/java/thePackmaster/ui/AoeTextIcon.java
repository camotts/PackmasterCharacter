package thePackmaster.ui;

import com.badlogic.gdx.graphics.Texture;
import com.evacipated.cardcrawl.mod.stslib.icons.AbstractCustomIcon;
import thePackmaster.util.TexLoader;

public class AoeTextIcon extends AbstractCustomIcon {
    public static final String ID = "AoeText";
    private static AoeTextIcon singleton;
    private static final Texture iconTex = TexLoader.getTexture("anniv5Resources/images/Aoe.png");

    public AoeTextIcon() {super(ID, iconTex);}

    public static AoeTextIcon get() {
        if (singleton == null) {
            singleton = new AoeTextIcon();
        }
        return singleton;
    }
}
