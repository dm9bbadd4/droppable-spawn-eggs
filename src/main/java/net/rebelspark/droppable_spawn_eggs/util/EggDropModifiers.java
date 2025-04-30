package net.rebelspark.droppable_spawn_eggs.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class EggDropModifiers {
    private static final Identifier ALLAY = Identifier.of("minecraft", "entities/allay");
    private static final Identifier ARMADILLO = Identifier.of("minecraft", "entities/armadillo");
    private static final Identifier AXOLOTL = Identifier.of("minecraft", "entities/axolotl");
    private static final Identifier BAT = Identifier.of("minecraft", "entities/bat");
    private static final Identifier BEE = Identifier.of("minecraft", "entities/bee");
    private static final Identifier BLAZE = Identifier.of("minecraft", "entities/blaze");
    private static final Identifier BOGGED = Identifier.of("minecraft", "entities/bogged");
    private static final Identifier BREEZE = Identifier.of("minecraft", "entities/breeze");
    private static final Identifier CAMEL = Identifier.of("minecraft", "entities/camel");
    private static final Identifier CAT = Identifier.of("minecraft", "entities/cat");
    private static final Identifier CAVE_SPIDER = Identifier.of("minecraft", "entities/cave_spider");
    private static final Identifier CHICKEN = Identifier.of("minecraft", "entities/chicken");
    private static final Identifier COD = Identifier.of("minecraft", "entities/cod");
    private static final Identifier COW = Identifier.of("minecraft", "entities/cow");
    private static final Identifier CREAKING = Identifier.of("minecraft", "entities/creaking");
    private static final Identifier CREEPER = Identifier.of("minecraft", "entities/creeper");
    private static final Identifier DOLPHIN = Identifier.of("minecraft", "entities/dolphin");
    private static final Identifier DONKEY = Identifier.of("minecraft", "entities/donkey");
    private static final Identifier DROWNED = Identifier.of("minecraft", "entities/drowned");
    private static final Identifier ELDER_GUARDIAN = Identifier.of("minecraft", "entities/elder_guardian");
    private static final Identifier ENDERMAN = Identifier.of("minecraft", "entities/enderman");
    private static final Identifier ENDERMITE = Identifier.of("minecraft", "entities/endermite");
    private static final Identifier EVOKER = Identifier.of("minecraft", "entities/evoker");
    private static final Identifier FOX = Identifier.of("minecraft", "entities/fox");
    private static final Identifier FROG = Identifier.of("minecraft", "entities/frog");
    private static final Identifier GHAST = Identifier.of("minecraft", "entities/ghast");
    private static final Identifier GLOW_SQUID = Identifier.of("minecraft", "entities/glow_squid");
    private static final Identifier GOAT = Identifier.of("minecraft", "entities/goat");
    private static final Identifier GUARDIAN = Identifier.of("minecraft", "entities/guardian");
    private static final Identifier HOGLIN = Identifier.of("minecraft", "entities/hoglin");
    private static final Identifier HORSE = Identifier.of("minecraft", "entities/horse");
    private static final Identifier HUSK = Identifier.of("minecraft", "entities/husk");
    private static final Identifier IRON_GOLEM = Identifier.of("minecraft", "entities/iron_golem");
    private static final Identifier LLAMA = Identifier.of("minecraft", "entities/llama");
    private static final Identifier MAGMA_CUBE = Identifier.of("minecraft", "entities/magma_cube");
    private static final Identifier MOOSHROOM = Identifier.of("minecraft", "entities/mooshroom");
    private static final Identifier MULE = Identifier.of("minecraft", "entities/mule");
    private static final Identifier OCELOT = Identifier.of("minecraft", "entities/ocelot");
    private static final Identifier PANDA = Identifier.of("minecraft", "entities/panda");
    private static final Identifier PARROT = Identifier.of("minecraft", "entities/parrot");
    private static final Identifier PHANTOM = Identifier.of("minecraft", "entities/phantom");
    private static final Identifier PIG = Identifier.of("minecraft", "entities/pig");
    private static final Identifier PIGLIN = Identifier.of("minecraft", "entities/piglin");
    private static final Identifier PIGLIN_BRUTE = Identifier.of("minecraft", "entities/piglin_brute");
    private static final Identifier PILLAGER = Identifier.of("minecraft", "entities/pillager");
    private static final Identifier POLAR_BEAR = Identifier.of("minecraft", "entities/polar_bear");
    private static final Identifier PUFFERFISH = Identifier.of("minecraft", "entities/pufferfish");
    private static final Identifier RABBIT = Identifier.of("minecraft", "entities/rabbit");
    private static final Identifier RAVAGER = Identifier.of("minecraft", "entities/ravager");
    private static final Identifier SALMON = Identifier.of("minecraft", "entities/salmon");
    private static final Identifier SHEEP = Identifier.of("minecraft", "entities/sheep");
    private static final Identifier SHULKER = Identifier.of("minecraft", "entities/shulker");
    private static final Identifier SILVERFISH = Identifier.of("minecraft", "entities/silverfish");
    private static final Identifier SKELETON = Identifier.of("minecraft", "entities/skeleton");
    private static final Identifier SKELETON_HORSE = Identifier.of("minecraft", "entities/skeleton_horse");
    private static final Identifier SLIME = Identifier.of("minecraft", "entities/slime");
    private static final Identifier SNIFFER = Identifier.of("minecraft", "entities/sniffer");
    private static final Identifier SNOW_GOLEM = Identifier.of("minecraft", "entities/snow_golem");
    private static final Identifier SPIDER = Identifier.of("minecraft", "entities/spider");
    private static final Identifier SQUID = Identifier.of("minecraft", "entities/squid");
    private static final Identifier STRAY = Identifier.of("minecraft", "entities/stray");
    private static final Identifier STRIDER = Identifier.of("minecraft", "entities/strider");
    private static final Identifier TADPOLE = Identifier.of("minecraft", "entities/tadpole");
    private static final Identifier TRADER_LLAMA = Identifier.of("minecraft", "entities/trader_llama");
    private static final Identifier TROPICAL_FISH = Identifier.of("minecraft", "entities/tropical_fish");
    private static final Identifier TURTLE = Identifier.of("minecraft", "entities/turtle");
    private static final Identifier VEX = Identifier.of("minecraft", "entities/vex");
    private static final Identifier VILLAGER = Identifier.of("minecraft", "entities/villager");
    private static final Identifier VINDICATOR = Identifier.of("minecraft", "entities/vindicator");
    private static final Identifier WANDERING_TRADER = Identifier.of("minecraft", "entities/wandering_trader");
    private static final Identifier WARDEN = Identifier.of("minecraft", "entities/warden");
    private static final Identifier WITCH = Identifier.of("minecraft", "entities/witch");
    private static final Identifier WITHER_SKELETON = Identifier.of("minecraft", "entities/wither_skeleton");
    private static final Identifier WOLF = Identifier.of("minecraft", "entities/wolf");
    private static final Identifier ZOGLIN = Identifier.of("minecraft", "entities/zoglin");
    private static final Identifier ZOMBIE = Identifier.of("minecraft", "entities/zombie");
    private static final Identifier ZOMBIE_HORSE = Identifier.of("minecraft", "entities/zombie_horse");
    private static final Identifier ZOMBIE_VILLAGER = Identifier.of("minecraft", "entities/zombie_villager");
    private static final Identifier ZOMBIFIED_PIGLIN = Identifier.of("minecraft", "entities/zombified_piglin");



    public static void eggDrops() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {

            if(ALLAY.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.ALLAY_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(ARMADILLO.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.ARMADILLO_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(AXOLOTL.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.AXOLOTL_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BAT.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.BAT_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BEE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.BEE_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BLAZE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.BLAZE_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BOGGED.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.BOGGED_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BREEZE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.BREEZE_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(CAMEL.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.CAMEL_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(CAT.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.CAT_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(CAVE_SPIDER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.CAVE_SPIDER_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(CHICKEN.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.CHICKEN_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(COD.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.COD_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(COW.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.COW_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(CREAKING.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.CREAKING_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(CREEPER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.CREEPER_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(DOLPHIN.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.DOLPHIN_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(DONKEY.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.DONKEY_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(DROWNED.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.DROWNED_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(ELDER_GUARDIAN.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.ELDER_GUARDIAN_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(ENDERMAN.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.ENDERMAN_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(ENDERMITE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.ENDERMITE_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(EVOKER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.EVOKER_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(FOX.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.FOX_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(FROG.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.FROG_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(GHAST.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.GHAST_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(GLOW_SQUID.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.GLOW_SQUID_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(GOAT.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.GOAT_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(GUARDIAN.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.GUARDIAN_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(HOGLIN.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.HOGLIN_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(HORSE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.HORSE_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(HUSK.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.HUSK_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(IRON_GOLEM.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.IRON_GOLEM_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(LLAMA.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.LLAMA_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(MAGMA_CUBE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.MAGMA_CUBE_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(MOOSHROOM.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.MOOSHROOM_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(MULE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.MULE_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(OCELOT.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.OCELOT_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(PANDA.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.PANDA_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(PARROT.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.PARROT_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(PHANTOM.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.PHANTOM_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(PIG.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.PIG_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(PIGLIN.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.PIGLIN_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(PIGLIN_BRUTE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.PIGLIN_BRUTE_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(PILLAGER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.PILLAGER_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(POLAR_BEAR.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.POLAR_BEAR_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(PUFFERFISH.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.PUFFERFISH_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(RABBIT.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.RABBIT_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(RAVAGER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.RAVAGER_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(SALMON.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.SALMON_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(SHEEP.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.SHEEP_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(SHULKER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.SHULKER_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(SILVERFISH.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.SILVERFISH_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(SKELETON.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.SKELETON_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(SKELETON_HORSE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.SKELETON_HORSE_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(SLIME.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.SLIME_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(SNIFFER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.SNIFFER_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(SNOW_GOLEM.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.SNOW_GOLEM_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(SPIDER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.SPIDER_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(SQUID.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.SQUID_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(STRAY.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.STRAY_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(STRIDER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.STRIDER_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(TADPOLE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.TADPOLE_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(TRADER_LLAMA.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.TRADER_LLAMA_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }if(TROPICAL_FISH.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.TROPICAL_FISH_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(TURTLE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.TURTLE_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(VEX.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.VEX_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(VILLAGER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.VILLAGER_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(VINDICATOR.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.VINDICATOR_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(WANDERING_TRADER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.WANDERING_TRADER_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(WARDEN.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.WARDEN_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(WITCH.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.WITCH_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(WITHER_SKELETON.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.WITHER_SKELETON_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(WOLF.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.WOLF_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(ZOGLIN.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.ZOGLIN_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(ZOMBIE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.ZOMBIE_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(ZOMBIE_HORSE.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(1.0f))
                    .with(ItemEntry.builder(Items.ZOMBIE_HORSE_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(ZOMBIE_VILLAGER.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.ZOMBIE_VILLAGER_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(ZOMBIFIED_PIGLIN.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.ZOMBIFIED_PIGLIN_SPAWN_EGG)).apply(SetCountLootFunction
                            .builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }


        });
    }



}
