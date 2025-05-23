package net.fneifnox.customdurability.Config;
import blue.endless.jankson.Comment;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.RestartRequired;
import io.wispforest.owo.config.annotation.SectionHeader;

@Modmenu(modId = "custom-durability")
@Config(name = "custom-durability", wrapperName = "CustomD")
public class ConfigModel {
    @SectionHeader("Durability")
    @RestartRequired
    @Comment("Default: 59")
    public int durabilityForWoodenTools = 59; // Default: 59
    @RestartRequired
    @Comment("Default: 131")
    public int durabilityForStoneTools = 131; // Default: 131
    @RestartRequired
    @Comment("Default: 250")
    public int durabilityForIronTools = 250; // Default: 250
    @RestartRequired
    @Comment("Default: 32")
    public int durabilityForGoldenTools = 32; // Default: 32
    @RestartRequired
    @Comment("Default: 1561")
    public int durabilityForDiamondTools = 1561; // Default: 1561
    @RestartRequired
    @Comment("Default: 2031")
    public int durabilityForNetheriteTools = 2031; // Default: 2031
    @RestartRequired
    @Comment("Default: 250")
    public int durabilityForTrident = 250; // Default: 250
    @RestartRequired
    @Comment("Default: 500")
    public int durabilityForMace = 500; // Default: 500
    @RestartRequired
    @Comment("Default: 384")
    public int durabilityForBow = 384; // Default: 384
    @RestartRequired
    @Comment("Default: 465")
    public int durabilityForCrossbow = 465; // Default: 465
    @RestartRequired
    @Comment("Default: 336")
    public int durabilityForShield = 336; // Default: 336
    @RestartRequired
    @Comment("Default: 64")
    public int durabilityForFishingRod = 64; // Default: 64
    @RestartRequired
    @Comment("Default: 64")
    public int durabilityForFlintAndSteel = 64; // Default: 64
    @RestartRequired
    @Comment("Default: 238")
    public int durabilityForShears = 238; // Default: 238
    @RestartRequired
    @Comment("Default: 64")
    public int durabilityForBrush = 64; // Default: 64
    @RestartRequired
    @Comment("Default: 432")
    public int durabilityForElytra = 432; // Default: 432
    @RestartRequired
    @Comment("Default: 64")
    public int durabilityForAnimalArmor = 64; // Default 64

    @SectionHeader("Unbreakable")
    public boolean unbreakableWoodenTools = false;
    public boolean unbreakableStoneTools = false;
    public boolean unbreakableIronTools = false;
    public boolean unbreakableGoldenTools = false;
    public boolean unbreakableDiamondTools = false;
    public boolean unbreakableNetheriteTools = false;
    @Comment("Buggy - If enabled doesn't let you throw the trident")
    public boolean unbreakableTrident = false; // buggy
    public boolean unbreakableMace = false;
    public boolean unbreakableBow = false;
    public boolean unbreakableCrossbow = false;
    public boolean unbreakableShield = false;
    public boolean unbreakableFishingRod = false;
    public boolean unbreakableFlintAndSteel = false;
    public boolean unbreakableShears = false;
    public boolean unbreakableBrush = false;
    public boolean unbreakableElytra = false; // buggy
    @Comment("If enabled let's your wolf become invincible")
    public boolean unbreakableAnimalArmor = false;
}
