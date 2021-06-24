package gg.twinhead.compressed.common;

import java.util.List;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.FallingBlock;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.BlockView;

public class CompressedFallingBlock extends FallingBlock{

    String name;
    public String blockName = "";
    String[] parts, blockArrayName;
    int blockSize;
    public CompressedFallingBlock(FabricBlockSettings fabricBlockSettings) {
        super(fabricBlockSettings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {
        if(Screen.hasShiftDown()){
            tooltip.add( new LiteralText(blockSize + blockName));
        } else {
            tooltip.add(new LiteralText("Hold Shift").formatted(Formatting.ITALIC, Formatting.GRAY));
        }
        
    }

    public String GetName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
        parts = name.split("_");

        if(parts[parts.length-1].equals("i")){
            blockSize = (int)Math.pow(9, 1);
        } else if(parts[parts.length-1].equals("ii")){
            blockSize = (int)Math.pow(9, 2);
        } else if(parts[parts.length-1].equals("iii")){
            blockSize = (int)Math.pow(9, 3);
        } else if(parts[parts.length-1].equals("iv")){
            blockSize = (int)Math.pow(9, 4);
        } else if(parts[parts.length-1].equals("v")){
            blockSize = (int)Math.pow(9, 5);
        } else{
            blockSize = 1;
        }

        
        for(int i=0; i < parts.length-1; i++){
            blockName = blockName + " " + parts[i];
        }
    }
    
}
