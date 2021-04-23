
package dimension_adventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import dimension_adventure.itemgroup.DAItemGroup;

import dimension_adventure.DimensionAdventureModElements;

@DimensionAdventureModElements.ModElement.Tag
public class MilenitSwordItem extends DimensionAdventureModElements.ModElement {
	@ObjectHolder("dimension_adventure:milenit_sword")
	public static final Item block = null;
	public MilenitSwordItem(DimensionAdventureModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 300;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 3;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MilenitingotItem.block, (int) (1)));
			}
		}, 3, -2.4000000000000001f, new Item.Properties().group(DAItemGroup.tab)) {
		}.setRegistryName("milenit_sword"));
	}
}
