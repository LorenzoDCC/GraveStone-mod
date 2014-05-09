package gravestone.core.compatibility;

import baubles.api.BaublesApi;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class GSCompatibilityBaubles {

    protected static boolean isInstalled = false;

    private GSCompatibilityBaubles() {

    }

    public static void addItems(List<ItemStack> items, EntityPlayer player) {
        if (isInstalled()) {
            IInventory inventory = BaublesApi.getBaubles(player);
            if (inventory != null) {
                for (int slot = 0; slot < inventory.getSizeInventory(); slot++) {
                    items.add(inventory.getStackInSlot(slot));
                }
            }
        }
    }

    public static boolean isInstalled() {
        return isInstalled;
    }
}