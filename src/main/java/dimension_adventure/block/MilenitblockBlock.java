
package dimension_adventure.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

import dimension_adventure.itemgroup.DAItemGroup;

import dimension_adventure.DimensionAdventureModElements;

@DimensionAdventureModElements.ModElement.Tag
public class MilenitblockBlock extends DimensionAdventureModElements.ModElement {
	@ObjectHolder("dimension_adventure:milenitblock")
	public static final Block block = null;
	public MilenitblockBlock(DimensionAdventureModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(DAItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5f, 30f).lightValue(0).harvestLevel(2)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("milenitblock");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(MilenitblockBlock.block, (int) (1)));
		}
	}
}
