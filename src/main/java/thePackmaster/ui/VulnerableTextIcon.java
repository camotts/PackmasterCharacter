package thePackmaster.ui;

import com.badlogic.gdx.graphics.Texture;
import com.evacipated.cardcrawl.mod.stslib.icons.AbstractCustomIcon;
import thePackmaster.util.TexLoader;

public class VulnerableTextIcon extends AbstractCustomIcon {
    public static final String ID = "VulnerableText";
    private static VulnerableTextIcon singleton;
    private static final Texture iconTex = TexLoader.getTexture("anniv5Resources/images/Vulnerable.png");

    public VulnerableTextIcon() {super(ID, iconTex);}

    public static VulnerableTextIcon get() {
        if (singleton == null) {
            singleton = new VulnerableTextIcon();
        }
        return singleton;
    }
}
