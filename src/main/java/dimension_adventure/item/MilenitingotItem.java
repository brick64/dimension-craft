
package dimension_adventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import dimension_adventure.itemgroup.DAItemGroup;

import dimension_adventure.DimensionAdventureModElements;

@DimensionAdventureModElements.ModElement.Tag
public class MilenitingotItem extends DimensionAdventureModElements.ModElement {
	@ObjectHolder("dimension_adventure:milenitingot")
	public static final Item block = null;
	public MilenitingotItem(DimensionAdventureModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(DAItemGroup.tab).maxStackSize(64));
			setRegistryName("milenitingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
