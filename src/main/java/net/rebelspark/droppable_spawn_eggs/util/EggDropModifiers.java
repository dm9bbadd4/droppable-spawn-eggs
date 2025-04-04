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
    private static final Identifier ENDERMITE = Identifier.of("minecraft", "entities/evoker");
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



    public static void eggDrops() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {

            if(ALLAY.equals(key.getValue())) { LootPool.Builder poolBuilder = LootPool.builder() .rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.builder(0.0005f))
                    .with(ItemEntry.builder(Items.ALLAY_SPAWN_EGG)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build()); tableBuilder.pool(poolBuilder.build());
            }

        });
    }



}
