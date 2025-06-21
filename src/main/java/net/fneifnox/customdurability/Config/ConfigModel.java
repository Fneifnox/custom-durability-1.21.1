package net.fneifnox.customdurability.Config;

import blue.endless.jankson.Comment;
import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.*;

import java.util.List;
import java.util.Map;

@Sync(Option.SyncMode.OVERRIDE_CLIENT)
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
    @Nest
    public UnbreakableTools unbreakableTools = new UnbreakableTools();
    public static class UnbreakableTools {
        public boolean unbreakableAllTools = false;
        @Nest
        public UnbreakableTools.UnbreakableToolsWooden unbreakableToolsWooden = new UnbreakableTools.UnbreakableToolsWooden();
        public static class UnbreakableToolsWooden {
            public boolean unbreakableWoodenSword = false;
            public boolean unbreakableWoodenShovel = false;
            public boolean unbreakableWoodenPickaxe = false;
            public boolean unbreakableWoodenAxe = false;
            public boolean unbreakableWoodenHoe = false;
        }

        @Nest
        public UnbreakableTools.UnbreakableToolsStone unbreakableToolsStone = new UnbreakableTools.UnbreakableToolsStone();
        public static class UnbreakableToolsStone {
            public boolean unbreakableStoneSword = false;
            public boolean unbreakableStoneShovel = false;
            public boolean unbreakableStonePickaxe = false;
            public boolean unbreakableStoneAxe = false;
            public boolean unbreakableStoneHoe = false;
        }

        @Nest
        public UnbreakableTools.UnbreakableToolsIron unbreakableToolsIron = new UnbreakableTools.UnbreakableToolsIron();
        public static class UnbreakableToolsIron {
            public boolean unbreakableIronSword = false;
            public boolean unbreakableIronShovel = false;
            public boolean unbreakableIronPickaxe = false;
            public boolean unbreakableIronAxe = false;
            public boolean unbreakableIronHoe = false;
        }

        @Nest
        public UnbreakableTools.UnbreakableToolsGolden unbreakableToolsGolden = new UnbreakableTools.UnbreakableToolsGolden();
        public static class UnbreakableToolsGolden {
            public boolean unbreakableGoldenSword = false;
            public boolean unbreakableGoldenShovel = false;
            public boolean unbreakableGoldenPickaxe = false;
            public boolean unbreakableGoldenAxe = false;
            public boolean unbreakableGoldenHoe = false;
        }

        @Nest
        public UnbreakableTools.UnbreakableToolsDiamond unbreakableToolsDiamond = new UnbreakableTools.UnbreakableToolsDiamond();
        public static class UnbreakableToolsDiamond {
            public boolean unbreakableDiamondSword = false;
            public boolean unbreakableDiamondShovel = false;
            public boolean unbreakableDiamondPickaxe = false;
            public boolean unbreakableDiamondAxe = false;
            public boolean unbreakableDiamondHoe = false;
        }

        @Nest
        public UnbreakableTools.UnbreakableToolsNetherite unbreakableToolsNetherite = new UnbreakableTools.UnbreakableToolsNetherite();
        public static class UnbreakableToolsNetherite {
            public boolean unbreakableNetheriteSword = false;
            public boolean unbreakableNetheriteShovel = false;
            public boolean unbreakableNetheritePickaxe = false;
            public boolean unbreakableNetheriteAxe = false;
            public boolean unbreakableNetheriteHoe = false;
        }

        @Nest
        public UnbreakableTools.UnbreakableToolsOther unbreakableToolsOther = new UnbreakableTools.UnbreakableToolsOther();
        public static class UnbreakableToolsOther {
            public boolean unbreakableTrident = false; // buggy
            public boolean unbreakableMace = false;
            public boolean unbreakableBow = false;
            public boolean unbreakableCrossbow = false;
            public boolean unbreakableShield = false;
            public boolean unbreakableFishingRod = false;
            public boolean unbreakableFlintAndSteel = false;
            public boolean unbreakableShears = false;
            public boolean unbreakableBrush = false;
        }
    }

    @Nest
    public UnbreakableArmor unbreakableArmor = new UnbreakableArmor();
    public static class UnbreakableArmor {
        public boolean unbreakableAllArmor = false;
        @Nest
        public UnbreakableArmor.UnbreakableArmorLeather unbreakableArmorLeather = new UnbreakableArmor.UnbreakableArmorLeather();
        public static class UnbreakableArmorLeather {
            public boolean unbreakableLeatherHelmet = false;
            public boolean unbreakableLeatherChestplate = false;
            public boolean unbreakableLeatherLeggings = false;
            public boolean unbreakableLeatherBoots = false;
        }

        @Nest
        public UnbreakableArmor.UnbreakableArmorChainmail unbreakableArmorChainmail = new UnbreakableArmor.UnbreakableArmorChainmail();
        public static class UnbreakableArmorChainmail {
            public boolean unbreakableChainmailHelmet = false;
            public boolean unbreakableChainmailChestplate = false;
            public boolean unbreakableChainmailLeggings = false;
            public boolean unbreakableChainmailBoots = false;
        }

        @Nest
        public UnbreakableArmor.UnbreakableArmorIron unbreakableArmorIron = new UnbreakableArmor.UnbreakableArmorIron();
        public static class UnbreakableArmorIron {
            public boolean unbreakableIronHelmet = false;
            public boolean unbreakableIronChestplate = false;
            public boolean unbreakableIronLeggings = false;
            public boolean unbreakableIronBoots = false;
        }

        @Nest
        public UnbreakableArmor.UnbreakableArmorGolden unbreakableArmorGolden = new UnbreakableArmor.UnbreakableArmorGolden();
        public static class UnbreakableArmorGolden {
            public boolean unbreakableGoldenHelmet = false;
            public boolean unbreakableGoldenChestplate = false;
            public boolean unbreakableGoldenLeggings = false;
            public boolean unbreakableGoldenBoots = false;
        }

        @Nest
        public UnbreakableArmor.UnbreakableArmorDiamond unbreakableArmorDiamond = new UnbreakableArmor.UnbreakableArmorDiamond();
        public static class UnbreakableArmorDiamond {
            public boolean unbreakableDiamondHelmet = false;
            public boolean unbreakableDiamondChestplate = false;
            public boolean unbreakableDiamondLeggings = false;
            public boolean unbreakableDiamondBoots = false;
        }

        @Nest
        public UnbreakableArmor.UnbreakableArmorNetherite unbreakableArmorNetherite = new UnbreakableArmor.UnbreakableArmorNetherite();
        public static class UnbreakableArmorNetherite {
            public boolean unbreakableNetheriteHelmet = false;
            public boolean unbreakableNetheriteChestplate = false;
            public boolean unbreakableNetheriteLeggings = false;
            public boolean unbreakableNetheriteBoots = false;
        }

        @Nest
        public UnbreakableArmor.UnbreakableArmorOther unbreakableArmorOther = new UnbreakableArmor.UnbreakableArmorOther();
        public static class UnbreakableArmorOther {
            public boolean unbreakableTurtleHelmet = false;
            public boolean unbreakableElytra = false;
            @Comment("If enabled let's your wolf become invincible")
            public boolean unbreakableAnimalArmor = false;
        }
    }
}
