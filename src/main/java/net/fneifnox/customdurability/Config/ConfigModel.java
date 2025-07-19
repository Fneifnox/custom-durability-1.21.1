package net.fneifnox.customdurability.Config;

import blue.endless.jankson.Comment;
import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.*;


@Sync(Option.SyncMode.OVERRIDE_CLIENT)
@Modmenu(modId = "custom-durability")
@Config(name = "custom-durability", wrapperName = "CustomD")
public class ConfigModel {
    @SectionHeader("Tools")

    @Comment("Default: 59")
    @Nest
    public ToolsWooden ToolsWooden = new ToolsWooden();
    public static class ToolsWooden {
        @SectionHeader("ToolsWooden Durability")

        @RestartRequired
        public int durabilityForWoodenSword = 59;
        @RestartRequired
        public int durabilityForWoodenShovel = 59;
        @RestartRequired
        public int durabilityForWoodenPickaxe = 59;
        @RestartRequired
        public int durabilityForWoodenAxe = 59;
        @RestartRequired
        public int durabilityForWoodenHoe = 59;

        @SectionHeader("ToolsWooden Unbreakable")

        @RestartRequired
        public boolean unbreakableWoodenSword = false;
        @RestartRequired
        public boolean unbreakableWoodenShovel = false;
        @RestartRequired
        public boolean unbreakableWoodenPickaxe = false;
        @RestartRequired
        public boolean unbreakableWoodenAxe = false;
        @RestartRequired
        public boolean unbreakableWoodenHoe = false;
    }

    @Comment("Default: 131")
    @Nest
    public ToolsStone ToolsStone = new ToolsStone();
    public static class ToolsStone {
        @SectionHeader("ToolsStone Durability")

        @RestartRequired
        public int durabilityForStoneSword = 131;
        @RestartRequired
        public int durabilityForStoneShovel = 131;
        @RestartRequired
        public int durabilityForStonePickaxe = 131;
        @RestartRequired
        public int durabilityForStoneAxe = 131;
        @RestartRequired
        public int durabilityForStoneHoe = 131;

        @SectionHeader("ToolsStone Unbreakable")

        @RestartRequired
        public boolean unbreakableStoneSword = false;
        @RestartRequired
        public boolean unbreakableStoneShovel = false;
        @RestartRequired
        public boolean unbreakableStonePickaxe = false;
        @RestartRequired
        public boolean unbreakableStoneAxe = false;
        @RestartRequired
        public boolean unbreakableStoneHoe = false;
    }

    @Comment("Default: 250")
    @Nest
    public ToolsIron ToolsIron = new ToolsIron();
    public static class ToolsIron {
        @SectionHeader("ToolsIron Durability")

        @RestartRequired
        public int durabilityForIronSword = 250;
        @RestartRequired
        public int durabilityForIronShovel = 250;
        @RestartRequired
        public int durabilityForIronPickaxe = 250;
        @RestartRequired
        public int durabilityForIronAxe = 250;
        @RestartRequired
        public int durabilityForIronHoe = 250;

        @SectionHeader("ToolsIron Unbreakable")

        @RestartRequired
        public boolean unbreakableIronSword = false;
        @RestartRequired
        public boolean unbreakableIronShovel = false;
        @RestartRequired
        public boolean unbreakableIronPickaxe = false;
        @RestartRequired
        public boolean unbreakableIronAxe = false;
        @RestartRequired
        public boolean unbreakableIronHoe = false;
    }

    @Comment("Default: 32")
    @Nest
    public ToolsGolden ToolsGolden = new ToolsGolden();
    public static class ToolsGolden {
        @SectionHeader("ToolsGolden Durability")

        @RestartRequired
        public int durabilityForGoldenSword = 32;
        @RestartRequired
        public int durabilityForGoldenShovel = 32;
        @RestartRequired
        public int durabilityForGoldenPickaxe = 32;
        @RestartRequired
        public int durabilityForGoldenAxe = 32;
        @RestartRequired
        public int durabilityForGoldenHoe = 32;

        @SectionHeader("ToolsGolden Unbreakable")

        @RestartRequired
        public boolean unbreakableGoldenSword = false;
        @RestartRequired
        public boolean unbreakableGoldenShovel = false;
        @RestartRequired
        public boolean unbreakableGoldenPickaxe = false;
        @RestartRequired
        public boolean unbreakableGoldenAxe = false;
        @RestartRequired
        public boolean unbreakableGoldenHoe = false;
    }

    @Comment("Default: 1561")
    @Nest
    public ToolsDiamond ToolsDiamond = new ToolsDiamond();
    public static class ToolsDiamond {
        @SectionHeader("ToolsDiamond Durability")

        @RestartRequired
        public int durabilityForDiamondSword = 1561;
        @RestartRequired
        public int durabilityForDiamondShovel = 1561;
        @RestartRequired
        public int durabilityForDiamondPickaxe = 1561;
        @RestartRequired
        public int durabilityForDiamondAxe = 1561;
        @RestartRequired
        public int durabilityForDiamondHoe = 1561;

        @SectionHeader("ToolsDiamond Unbreakable")

        @RestartRequired
        public boolean unbreakableDiamondSword = false;
        @RestartRequired
        public boolean unbreakableDiamondShovel = false;
        @RestartRequired
        public boolean unbreakableDiamondPickaxe = false;
        @RestartRequired
        public boolean unbreakableDiamondAxe = false;
        @RestartRequired
        public boolean unbreakableDiamondHoe = false;
    }

    @Comment("Default: 2031")
    @Nest
    public ToolsNetherite ToolsNetherite = new ToolsNetherite();
    public static class ToolsNetherite {
        @SectionHeader("ToolsNetherite Durability")

        @RestartRequired
        public int durabilityForNetheriteSword = 2031;
        @RestartRequired
        public int durabilityForNetheriteShovel = 2031;
        @RestartRequired
        public int durabilityForNetheritePickaxe = 2031;
        @RestartRequired
        public int durabilityForNetheriteAxe = 2031;
        @RestartRequired
        public int durabilityForNetheriteHoe = 2031;

        @SectionHeader("ToolsNetherite Unbreakable")

        @RestartRequired
        public boolean unbreakableNetheriteSword = false;
        @RestartRequired
        public boolean unbreakableNetheriteShovel = false;
        @RestartRequired
        public boolean unbreakableNetheritePickaxe = false;
        @RestartRequired
        public boolean unbreakableNetheriteAxe = false;
        @RestartRequired
        public boolean unbreakableNetheriteHoe = false;
    }

    @Nest
    public ToolsOther ToolsOther = new ToolsOther();
    public static class ToolsOther {
        @SectionHeader("ToolsOther Durability")

        @RestartRequired
        @Comment("Default: 250")
        public int durabilityForTrident = 250;
        @RestartRequired
        @Comment("Default: 500")
        public int durabilityForMace = 500;
        @RestartRequired
        @Comment("Default: 384")
        public int durabilityForBow = 384;
        @RestartRequired
        @Comment("Default: 465")
        public int durabilityForCrossbow = 465;
        @RestartRequired
        @Comment("Default: 336")
        public int durabilityForShield = 336;
        @RestartRequired
        @Comment("Default: 64")
        public int durabilityForFishingRod = 64;
        @RestartRequired
        @Comment("Default: 64")
        public int durabilityForFlintAndSteel = 64;
        @RestartRequired
        @Comment("Default: 238")
        public int durabilityForShears = 238;
        @RestartRequired
        @Comment("Default: 64")
        public int durabilityForBrush = 64;

        @SectionHeader("ToolsOther Unbreakable")

        @RestartRequired
        public boolean unbreakableTrident = false;
        @RestartRequired
        public boolean unbreakableMace = false;
        @RestartRequired
        public boolean unbreakableBow = false;
        @RestartRequired
        public boolean unbreakableCrossbow = false;
        @RestartRequired
        public boolean unbreakableShield = false;
        @RestartRequired
        public boolean unbreakableFishingRod = false;
        @RestartRequired
        public boolean unbreakableFlintAndSteel = false;
        @RestartRequired
        public boolean unbreakableShears = false;
        @RestartRequired
        public boolean unbreakableBrush = false;
    }

    @SectionHeader("Armor")

    @Nest
    public ArmorLeather ArmorLeather = new ArmorLeather();
    public static class ArmorLeather {
        @SectionHeader("ArmorLeather Durability")

        @RestartRequired
        @Comment("Default: 55")
        public int durabilityForLeatherHelmet = 55;
        @RestartRequired
        @Comment("Default: 80")
        public int durabilityForLeatherChestplate = 80;
        @RestartRequired
        @Comment("Default: 75")
        public int durabilityForLeatherLeggings = 75;
        @RestartRequired
        @Comment("Default: 65")
        public int durabilityForLeatherBoots = 65;

        @SectionHeader("ArmorLeather Unbreakable")

        @RestartRequired
        public boolean unbreakableLeatherHelmet = false;
        @RestartRequired
        public boolean unbreakableLeatherChestplate = false;
        @RestartRequired
        public boolean unbreakableLeatherLeggings = false;
        @RestartRequired
        public boolean unbreakableLeatherBoots = false;
    }

    @Nest
    public ArmorChainmail ArmorChainmail = new ArmorChainmail();
    public static class ArmorChainmail {
        @SectionHeader("ArmorChainmail Durability")

        @RestartRequired
        @Comment("Default: 165")
        public int durabilityForChainmailHelmet = 165;
        @RestartRequired
        @Comment("Default: 240")
        public int durabilityForChainmailChestplate = 240;
        @RestartRequired
        @Comment("Default: 225")
        public int durabilityForChainmailLeggings = 225;
        @RestartRequired
        @Comment("Default: 195")
        public int durabilityForChainmailBoots = 195;

        @SectionHeader("ArmorChainmail Unbreakable")

        @RestartRequired
        public boolean unbreakableChainmailHelmet = false;
        @RestartRequired
        public boolean unbreakableChainmailChestplate = false;
        @RestartRequired
        public boolean unbreakableChainmailLeggings = false;
        @RestartRequired
        public boolean unbreakableChainmailBoots = false;
    }

    @Nest
    public ArmorIron ArmorIron = new ArmorIron();
    public static class ArmorIron {
        @SectionHeader("ArmorIron Durability")

        @RestartRequired
        @Comment("Default: 165")
        public int durabilityForIronHelmet = 165;
        @RestartRequired
        @Comment("Default: 240")
        public int durabilityForIronChestplate = 240;
        @RestartRequired
        @Comment("Default: 225")
        public int durabilityForIronLeggings = 225;
        @RestartRequired
        @Comment("Default: 195")
        public int durabilityForIronBoots = 195;

        @SectionHeader("ArmorIron Unbreakable")

        @RestartRequired
        public boolean unbreakableIronHelmet = false;
        @RestartRequired
        public boolean unbreakableIronChestplate = false;
        @RestartRequired
        public boolean unbreakableIronLeggings = false;
        @RestartRequired
        public boolean unbreakableIronBoots = false;
    }

    @Nest
    public ArmorGolden ArmorGolden = new ArmorGolden();
    public static class ArmorGolden {
        @SectionHeader("ArmorGolden Durability")

        @RestartRequired
        @Comment("Default: 77")
        public int durabilityForGoldenHelmet = 77;
        @RestartRequired
        @Comment("Default: 112")
        public int durabilityForGoldenChestplate = 112;
        @RestartRequired
        @Comment("Default: 105")
        public int durabilityForGoldenLeggings = 105;
        @RestartRequired
        @Comment("Default: 91")
        public int durabilityForGoldenBoots = 91;

        @SectionHeader("ArmorGolden Unbreakable")

        @RestartRequired
        public boolean unbreakableGoldenHelmet = false;
        @RestartRequired
        public boolean unbreakableGoldenChestplate = false;
        @RestartRequired
        public boolean unbreakableGoldenLeggings = false;
        @RestartRequired
        public boolean unbreakableGoldenBoots = false;
    }

    @Nest
    public ArmorDiamond ArmorDiamond = new ArmorDiamond();
    public static class ArmorDiamond {
        @SectionHeader("ArmorDiamond Durability")

        @RestartRequired
        @Comment("Default: 363")
        public int durabilityForDiamondHelmet = 363;
        @RestartRequired
        @Comment("Default: 528")
        public int durabilityForDiamondChestplate = 528;
        @RestartRequired
        @Comment("Default: 495")
        public int durabilityForDiamondLeggings = 495;
        @RestartRequired
        @Comment("Default: 429")
        public int durabilityForDiamondBoots = 429;

        @SectionHeader("ArmorDiamond Unbreakable")

        @RestartRequired
        public boolean unbreakableDiamondHelmet = false;
        @RestartRequired
        public boolean unbreakableDiamondChestplate = false;
        @RestartRequired
        public boolean unbreakableDiamondLeggings = false;
        @RestartRequired
        public boolean unbreakableDiamondBoots = false;

    }

    @Nest
    public ArmorNetherite ArmorNetherite = new ArmorNetherite();
    public static class ArmorNetherite {
        @SectionHeader("ArmorNetherite Durability")

        @RestartRequired
        @Comment("Default: 407")
        public int durabilityForNetheriteHelmet = 407;
        @RestartRequired
        @Comment("Default: 592")
        public int durabilityForNetheriteChestplate = 592;
        @RestartRequired
        @Comment("Default: 555")
        public int durabilityForNetheriteLeggings = 555;
        @RestartRequired
        @Comment("Default: 481")
        public int durabilityForNetheriteBoots = 481;

        @SectionHeader("ArmorNetherite Unbreakable")

        @RestartRequired
        public boolean unbreakableNetheriteHelmet = false;
        @RestartRequired
        public boolean unbreakableNetheriteChestplate = false;
        @RestartRequired
        public boolean unbreakableNetheriteLeggings = false;
        @RestartRequired
        public boolean unbreakableNetheriteBoots = false;
    }

    @Nest
    public ArmorOther ArmorOther = new ArmorOther();
    public static class ArmorOther {
        @SectionHeader("ArmorOther Durability")

        @RestartRequired
        @Comment("Default: 275")
        public int durabilityForTurtleHelmet = 275;
        @RestartRequired
        @Comment("Default: 432")
        public int durabilityForElytra = 432;
        @RestartRequired
        @Comment("Default: 64")
        public int durabilityForAnimalArmor = 64;

        @SectionHeader("ArmorOther Unbreakable")

        @RestartRequired
        public boolean unbreakableTurtleHelmet = false;
        @RestartRequired
        public boolean unbreakableElytra = false;
        @RestartRequired
        @Comment("If enabled let's your wolf become invincible")
        public boolean unbreakableAnimalArmor = false;
    }

    @SectionHeader("Modded Items")


    @Nest
    public Waystones waystones = new Waystones();
    public static class Waystones {
        @SectionHeader("Durability Waystones")
        @RestartRequired
        @Comment("Default: 128")
        public int durabilityForWarpStone = 128;

        @SectionHeader("Unbreakable Waystones")
        @RestartRequired
        public boolean unbreakableWarpStone = false;
    }
}
