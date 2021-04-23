
package dimension_adventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import dimension_adventure.itemgroup.DAItemGroup;

import dimension_adventure.DimensionAdventureModElements;

@DimensionAdventureModElements.ModElement.Tag
public class MilenitpicaxeItem extends DimensionAdventureModElements.ModElement {
	@ObjectHolder("dimension_adventure:milenitpicaxe")
	public static final Item block = null;
	public MilenitpicaxeItem(DimensionAdventureModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(DAItemGroup.tab)) {
		}.setRegistryName("milenitpicaxe"));
	}
}
