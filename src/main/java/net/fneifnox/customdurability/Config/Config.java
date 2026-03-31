package net.fneifnox.customdurability.Config;

import blue.endless.jankson.Comment;
import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.*;


@Sync(Option.SyncMode.OVERRIDE_CLIENT)
@Modmenu(modId = "custom-durability")
@io.wispforest.owo.config.annotation.Config(name = "custom-durability", wrapperName = "CustomD")
public class Config {
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

    @Comment("Default: 190")
    @Nest
    public ToolsCopper ToolsCopper = new ToolsCopper();
    public static class ToolsCopper {
        @SectionHeader("ToolsCopper Durability")

        @RestartRequired
        public int durabilityForCopperSword = 190;
        @RestartRequired
        public int durabilityForCopperShovel = 190;
        @RestartRequired
        public int durabilityForCopperPickaxe = 190;
        @RestartRequired
        public int durabilityForCopperAxe = 190;
        @RestartRequired
        public int durabilityForCopperHoe = 190;

        @SectionHeader("ToolsCopper Unbreakable")

        @RestartRequired
        public boolean unbreakableCopperSword = false;
        @RestartRequired
        public boolean unbreakableCopperShovel = false;
        @RestartRequired
        public boolean unbreakableCopperPickaxe = false;
        @RestartRequired
        public boolean unbreakableCopperAxe = false;
        @RestartRequired
        public boolean unbreakableCopperHoe = false;
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
    public ArmorCopper ArmorCopper = new ArmorCopper();
    public static class ArmorCopper {
        @SectionHeader("ArmorCopper Durability")

        @RestartRequired
        @Comment("Default: 121")
        public int durabilityForCopperHelmet = 121;
        @RestartRequired
        @Comment("Default: 176")
        public int durabilityForCopperChestplate = 176;
        @RestartRequired
        @Comment("Default: 165")
        public int durabilityForCopperLeggings = 165;
        @RestartRequired
        @Comment("Default: 143")
        public int durabilityForCopperBoots = 143;

        @SectionHeader("ArmorCopper Unbreakable")

        @RestartRequired
        public boolean unbreakableCopperHelmet = false;
        @RestartRequired
        public boolean unbreakableCopperChestplate = false;
        @RestartRequired
        public boolean unbreakableCopperLeggings = false;
        @RestartRequired
        public boolean unbreakableCopperBoots = false;
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
        public int durabilityForWolfArmor = 64;

        @SectionHeader("ArmorOther Unbreakable")

        @RestartRequired
        public boolean unbreakableTurtleHelmet = false;
        @RestartRequired
        public boolean unbreakableElytra = false;
        @RestartRequired
        @Comment("If enabled lets your wolf become invincible")
        public boolean unbreakableWolfArmor = false;
    }

    @SectionHeader("Modded Items")

    @Nest
    public AdvancedNetherite advancedNetherite = new AdvancedNetherite();
    public static class AdvancedNetherite {
        @RestartRequired
        public boolean enableAdvancedNetherite = true;

        @SectionHeader("Tools AdvancedNetherite")

        @Comment("Default: 2281")
        @Nest
        public AdvancedNetherite.NetheriteIronTools netheriteIronTools = new AdvancedNetherite.NetheriteIronTools();
        public static class NetheriteIronTools {
            @SectionHeader("Durability NetheriteIronTools")

            @RestartRequired
            public int durabilityForNetheriteIronSword = 2281;
            @RestartRequired
            public int durabilityForNetheriteIronShovel = 2281;
            @RestartRequired
            public int durabilityForNetheriteIronPickaxe = 2281;
            @RestartRequired
            public int durabilityForNetheriteIronAxe = 2281;
            @RestartRequired
            public int durabilityForNetheriteIronHoe = 2281;

            @SectionHeader("Unbreakable NetheriteIronTools")

            @RestartRequired
            public boolean unbreakableNetheriteIronSword = false;
            @RestartRequired
            public boolean unbreakableNetheriteIronShovel = false;
            @RestartRequired
            public boolean unbreakableNetheriteIronPickaxe = false;
            @RestartRequired
            public boolean unbreakableNetheriteIronAxe = false;
            @RestartRequired
            public boolean unbreakableNetheriteIronHoe = false;
        }

        @Comment("Default: 2313")
        @Nest
        public AdvancedNetherite.NetheriteGoldTools netheriteGoldTools = new AdvancedNetherite.NetheriteGoldTools();
        public static class NetheriteGoldTools {
            @SectionHeader("Durability NetheriteGoldTools")

            @RestartRequired
            public int durabilityForNetheriteGoldSword = 2313;
            @RestartRequired
            public int durabilityForNetheriteGoldShovel = 2313;
            @RestartRequired
            public int durabilityForNetheriteGoldPickaxe = 2313;
            @RestartRequired
            public int durabilityForNetheriteGoldAxe = 2313;
            @RestartRequired
            public int durabilityForNetheriteGoldHoe = 2313;

            @SectionHeader("Unbreakable NetheriteGoldTools")

            @RestartRequired
            public boolean unbreakableNetheriteGoldSword = false;
            @RestartRequired
            public boolean unbreakableNetheriteGoldShovel = false;
            @RestartRequired
            public boolean unbreakableNetheriteGoldPickaxe = false;
            @RestartRequired
            public boolean unbreakableNetheriteGoldAxe = false;
            @RestartRequired
            public boolean unbreakableNetheriteGoldHoe = false;
        }

        @Comment("Default: 2651")
        @Nest
        public AdvancedNetherite.NetheriteEmeraldTools netheriteEmeraldTools = new AdvancedNetherite.NetheriteEmeraldTools();
        public static class NetheriteEmeraldTools {
            @SectionHeader("Durability NetheriteEmeraldTools")

            @RestartRequired
            public int durabilityForNetheriteEmeraldSword = 2651;
            @RestartRequired
            public int durabilityForNetheriteEmeraldShovel = 2651;
            @RestartRequired
            public int durabilityForNetheriteEmeraldPickaxe = 2651;
            @RestartRequired
            public int durabilityForNetheriteEmeraldAxe = 2651;
            @RestartRequired
            public int durabilityForNetheriteEmeraldHoe = 2651;

            @SectionHeader("Unbreakable NetheriteEmeraldTools")

            @RestartRequired
            public boolean unbreakableNetheriteEmeraldSword = false;
            @RestartRequired
            public boolean unbreakableNetheriteEmeraldShovel = false;
            @RestartRequired
            public boolean unbreakableNetheriteEmeraldPickaxe = false;
            @RestartRequired
            public boolean unbreakableNetheriteEmeraldAxe = false;
            @RestartRequired
            public boolean unbreakableNetheriteEmeraldHoe = false;
        }

        @Comment("Default: 3092")
        @Nest
        public AdvancedNetherite.NetheriteDiamondTools netheriteDiamondTools = new AdvancedNetherite.NetheriteDiamondTools();
        public static class NetheriteDiamondTools {
            @SectionHeader("Durability NetheriteDiamondTools")

            @RestartRequired
            public int durabilityForNetheriteDiamondSword = 3092;
            @RestartRequired
            public int durabilityForNetheriteDiamondShovel = 3092;
            @RestartRequired
            public int durabilityForNetheriteDiamondPickaxe = 3092;
            @RestartRequired
            public int durabilityForNetheriteDiamondAxe = 3092;
            @RestartRequired
            public int durabilityForNetheriteDiamondHoe = 3092;

            @SectionHeader("Unbreakable NetheriteDiamondTools")

            @RestartRequired
            public boolean unbreakableNetheriteDiamondSword = false;
            @RestartRequired
            public boolean unbreakableNetheriteDiamondShovel = false;
            @RestartRequired
            public boolean unbreakableNetheriteDiamondPickaxe = false;
            @RestartRequired
            public boolean unbreakableNetheriteDiamondAxe = false;
            @RestartRequired
            public boolean unbreakableNetheriteDiamondHoe = false;
        }


        @SectionHeader("Armor AdvancedNetherite")

        @Nest
        public AdvancedNetherite.NetheriteIronArmor netheriteIronArmor = new AdvancedNetherite.NetheriteIronArmor();
        public static class NetheriteIronArmor {
            @SectionHeader("Durability NetheriteIronArmor")

            @RestartRequired
            @Comment("Default: 429")
            public int durabilityForNetheriteIronHelmet = 429;
            @RestartRequired
            @Comment("Default: 624")
            public int durabilityForNetheriteIronChestplate = 624;
            @RestartRequired
            @Comment("Default: 585")
            public int durabilityForNetheriteIronLeggings = 585;
            @RestartRequired
            @Comment("Default: 507")
            public int durabilityForNetheriteIronBoots = 507;

            @SectionHeader("Unbreakable NetheriteIronArmor")

            @RestartRequired
            public boolean unbreakableNetheriteIronHelmet = false;
            @RestartRequired
            public boolean unbreakableNetheriteIronChestplate = false;
            @RestartRequired
            public boolean unbreakableNetheriteIronLeggings = false;
            @RestartRequired
            public boolean unbreakableNetheriteIronBoots = false;
        }

        @Nest
        public AdvancedNetherite.NetheriteGoldArmor netheriteGoldArmor = new AdvancedNetherite.NetheriteGoldArmor();
        public static class NetheriteGoldArmor {
            @SectionHeader("Durability NetheriteGoldArmor")

            @RestartRequired
            @Comment("Default: 451")
            public int durabilityForNetheriteGoldHelmet = 451;
            @RestartRequired
            @Comment("Default: 656")
            public int durabilityForNetheriteGoldChestplate = 656;
            @RestartRequired
            @Comment("Default: 615")
            public int durabilityForNetheriteGoldLeggings = 615;
            @RestartRequired
            @Comment("Default: 533")
            public int durabilityForNetheriteGoldBoots = 533;

            @SectionHeader("Unbreakable NetheriteGoldArmor")

            @RestartRequired
            public boolean unbreakableNetheriteGoldHelmet = false;
            @RestartRequired
            public boolean unbreakableNetheriteGoldChestplate = false;
            @RestartRequired
            public boolean unbreakableNetheriteGoldLeggings = false;
            @RestartRequired
            public boolean unbreakableNetheriteGoldBoots = false;
        }

        @Nest
        public AdvancedNetherite.NetheriteEmeraldArmor netheriteEmeraldArmor = new AdvancedNetherite.NetheriteEmeraldArmor();
        public static class NetheriteEmeraldArmor {
            @SectionHeader("Durability NetheriteEmeraldArmor")

            @RestartRequired
            @Comment("Default: 473")
            public int durabilityForNetheriteEmeraldHelmet = 473;
            @RestartRequired
            @Comment("Default: 688")
            public int durabilityForNetheriteEmeraldChestplate = 688;
            @RestartRequired
            @Comment("Default: 645")
            public int durabilityForNetheriteEmeraldLeggings = 645;
            @RestartRequired
            @Comment("Default: 559")
            public int durabilityForNetheriteEmeraldBoots = 559;

            @SectionHeader("Unbreakable NetheriteEmeraldArmor")

            @RestartRequired
            public boolean unbreakableNetheriteEmeraldHelmet = false;
            @RestartRequired
            public boolean unbreakableNetheriteEmeraldChestplate = false;
            @RestartRequired
            public boolean unbreakableNetheriteEmeraldLeggings = false;
            @RestartRequired
            public boolean unbreakableNetheriteEmeraldBoots = false;
        }

        @Nest
        public AdvancedNetherite.NetheriteDiamondArmor netheriteDiamondArmor = new AdvancedNetherite.NetheriteDiamondArmor();
        public static class NetheriteDiamondArmor {
            @SectionHeader("Durability NetheriteDiamondArmor")

            @RestartRequired
            @Comment("Default: 517")
            public int durabilityForNetheriteDiamondHelmet = 517;
            @RestartRequired
            @Comment("Default: 752")
            public int durabilityForNetheriteDiamondChestplate = 752;
            @RestartRequired
            @Comment("Default: 705")
            public int durabilityForNetheriteDiamondLeggings = 705;
            @RestartRequired
            @Comment("Default: 611")
            public int durabilityForNetheriteDiamondBoots = 611;

            @SectionHeader("Unbreakable NetheriteDiamondArmor")

            @RestartRequired
            public boolean unbreakableNetheriteDiamondHelmet = false;
            @RestartRequired
            public boolean unbreakableNetheriteDiamondChestplate = false;
            @RestartRequired
            public boolean unbreakableNetheriteDiamondLeggings = false;
            @RestartRequired
            public boolean unbreakableNetheriteDiamondBoots = false;
        }
    }

    @Nest
    public FarmersDelight farmersDelight = new FarmersDelight();
    public static class FarmersDelight {
        @RestartRequired
        public boolean enableFarmersDelight = true;
        @SectionHeader("Durability Knife")
        @RestartRequired
        @Comment("Default: 131")
        public int durabilityForFlintKnife = 131;
        @RestartRequired
        @Comment("Default: 190")
        public int durabilityForCopperKnife = 190;
        @RestartRequired
        @Comment("Default: 250")
        public int durabilityForIronKnife = 250;
        @RestartRequired
        @Comment("Default: 32")
        public int durabilityForGoldenKnife = 32;
        @RestartRequired
        @Comment("Default: 1561")
        public int durabilityForDiamondKnife = 1561;
        @RestartRequired
        @Comment("Default: 2031")
        public int durabilityForNetheriteKnife = 2031;

        @SectionHeader("Unbreakable Knife")
        @RestartRequired
        public boolean unbreakableFlintKnife = false;
        @RestartRequired
        public boolean unbreakableCopperKnife = false;
        @RestartRequired
        public boolean unbreakableIronKnife = false;
        @RestartRequired
        public boolean unbreakableGoldenKnife = false;
        @RestartRequired
        public boolean unbreakableDiamondKnife = false;
        @RestartRequired
        public boolean unbreakableNetheriteKnife = false;
    }

    @Nest
    public IllagerInvasion illagerInvasion = new IllagerInvasion();
    public static class IllagerInvasion {
        @RestartRequired
        public boolean enableIllagerInvasion = true;

        @SectionHeader("Durability PlatinumInfusedHatchet")
        @RestartRequired
        @Comment("Default: 327")
        public int durabilityForPlatinumInfusedHatchet = 327;

        @SectionHeader("Unbreakable PlatinumInfusedHatchet")
        @RestartRequired
        public boolean unbreakablePlatinumInfusedHatchet = false;
    }

    @Nest
    public LateGamePlus lateGamePlus = new LateGamePlus();
    public static class LateGamePlus {
        @RestartRequired
        public boolean enableLateGamePlus = true;
        @SectionHeader("Durability LateGamePlus")
        @RestartRequired
        @Comment("Default: 500")
        public int durabilityForNetheriteBow = 500;
        @RestartRequired
        @Comment("Default: 700")
        public int durabilityForNetheriteCrossbow = 700;
        @RestartRequired
        @Comment("Default: 648")
        public int durabilityForNetheriteElytra = 648;
        @RestartRequired
        @Comment("Default: 256")
        public int durabilityForNetheriteFishingRod = 256;
        @RestartRequired
        @Comment("Default: 128")
        public int durabilityForNetheriteWolfArmor = 128;

        @SectionHeader("Unbreakable LateGamePlus")
        @RestartRequired
        public boolean unbreakableNetheriteBow       = false;
        @RestartRequired
        public boolean unbreakableNetheriteCrossbow  = false;
        @RestartRequired
        public boolean unbreakableNetheriteElytra    = false;
        @RestartRequired
        public boolean unbreakableNetheriteFishingRod = false;
        @RestartRequired
        public boolean unbreakableNetheriteWolfArmor = false;
    }

    @Nest
    public MoreDelight moreDelight = new MoreDelight();
    public static class MoreDelight {
        @RestartRequired
        public boolean enableMoreDelight = true;
        @SectionHeader("Durability Knife")
        @RestartRequired
        @Comment("Default: 59")
        public int durabilityForWoodenKnife = 59;
        @RestartRequired
        @Comment("Default: 131")
        public int durabilityForStoneKnife  = 131;

        @SectionHeader("Unbreakable Knife")
        @RestartRequired
        public boolean unbreakableWoodenKnife = false;
        @RestartRequired
        public boolean unbreakableStoneKnife  = false;
    }

    @Nest
    public NetheriteExtras netheriteExtras = new NetheriteExtras();
    public static class NetheriteExtras {
        @RestartRequired
        public boolean enableNetheriteExtras = true;
        @SectionHeader("Durability NetheriteExtras")
        @RestartRequired
        @Comment("Default: 128")
        public int durabilityForNetheriteWolfArmor = 128;

        @SectionHeader("Unbreakable NetheriteExtras")
        @RestartRequired
        public boolean unbreakableNetheriteWolfArmor = false;
    }

    @Nest
    public ToughAsNails toughAsNails = new ToughAsNails();
    public static class ToughAsNails {
        @RestartRequired
        public boolean enableToughAsNails = true;
        @SectionHeader("Durability LeafArmor")
        @RestartRequired
        @Comment("Default: 55")
        public int durabilityForLeafHelmet = 55;
        @RestartRequired
        @Comment("Default: 80")
        public int durabilityForLeafChestplate = 80;
        @RestartRequired
        @Comment("Default: 75")
        public int durabilityForLeafLeggings = 75;
        @RestartRequired
        @Comment("Default: 65")
        public int durabilityForLeafBoots = 65;

        @SectionHeader("Unbreakable LeafArmor")
        @RestartRequired
        public boolean unbreakableLeafHelmet     = false;
        @RestartRequired
        public boolean unbreakableLeafChestplate = false;
        @RestartRequired
        public boolean unbreakableLeafLeggings   = false;
        @RestartRequired
        public boolean unbreakableLeafBoots      = false;

        @SectionHeader("Durability WoolArmor")
        @RestartRequired
        @Comment("Default: 55")
        public int durabilityForWoolHelmet = 55;
        @RestartRequired
        @Comment("Default: 80")
        public int durabilityForWoolChestplate = 80;
        @RestartRequired
        @Comment("Default: 75")
        public int durabilityForWoolLeggings = 75;
        @RestartRequired
        @Comment("Default: 65")
        public int durabilityForWoolBoots = 65;

        @SectionHeader("Unbreakable WoolArmor")
        @RestartRequired
        public boolean unbreakableWoolHelmet     = false;
        @RestartRequired
        public boolean unbreakableWoolChestplate = false;
        @RestartRequired
        public boolean unbreakableWoolLeggings   = false;
        @RestartRequired
        public boolean unbreakableWoolBoots      = false;

        @SectionHeader("Durability Canteens")
        @RestartRequired
        @Comment("Default: 5")
        public int durabilityForLeatherCanteen  = 5;
        @RestartRequired
        @Comment("Default: 6")
        public int durabilityForCopperCanteen   = 6;
        @RestartRequired
        @Comment("Default: 7")
        public int durabilityForIronCanteen     = 7;
        @RestartRequired
        @Comment("Default: 10")
        public int durabilityForGoldCanteen     = 10;
        @RestartRequired
        @Comment("Default: 15")
        public int durabilityForDiamondCanteen  = 15;
        @RestartRequired
        @Comment("Default: 25")
        public int durabilityForNetheriteCanteen= 25;

        @SectionHeader("Unbreakable Canteens")
        @RestartRequired
        public boolean unbreakableLeatherCanteen = false;
        @RestartRequired
        public boolean unbreakableCopperCanteen = false;
        @RestartRequired
        public boolean unbreakableIronCanteen = false;
        @RestartRequired
        public boolean unbreakableGoldCanteen = false;
        @RestartRequired
        public boolean unbreakableDiamondCanteen = false;
        @RestartRequired
        public boolean unbreakableNetheriteCanteen = false;
    }

    @Nest
    public Waystones waystones = new Waystones();
    public static class Waystones {
        @RestartRequired
        public boolean enableWaystones = true;
        @SectionHeader("Durability Waystones")
        @RestartRequired
        @Comment("Default: 128")
        public int durabilityForWarpStone = 128;

        @SectionHeader("Unbreakable Waystones")
        @RestartRequired
        public boolean unbreakableWarpStone = false;
    }
}
