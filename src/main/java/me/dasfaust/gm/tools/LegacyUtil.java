package me.dasfaust.gm.tools;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class LegacyUtil {

    private static boolean newMats = false;

    static {
        try {
            Material.valueOf("LOG");
        } catch (IllegalArgumentException exception) {
            newMats = true;
        }
    }

    public static final ItemStack BLACK_STAINED_GLASS_PANE = newMats ? new ItemStack(Material.valueOf("BLACK_STAINED_GLASS_PANE")) : new ItemStack(Material.valueOf("STAINED_GLASS_PANE"), 1, (short) 15);

    public static final String LIME_STAINED_GLASS_PANE_ID = newMats ? "LIME_STAINED_GLASS_PANE" : "STAINED_GLASS_PANE:5";
    public static final String RED_STAINED_GLASS_PANE_ID = newMats ? "RED_STAINED_GLASS_PANE" : "RED_GLASS_PANE:14";
    public static final String MAP_ID = newMats ? "MAP" : "EMPTY_MAP:0";

}
