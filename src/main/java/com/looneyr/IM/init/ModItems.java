package com.looneyr.IM.init;

import com.looneyr.IM.item.ItemIM;
import com.looneyr.IM.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by looney on 07/08/2014.
 */
public class ModItems
{
    public static final ItemIM mapleleaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleleaf,"mapleLeaf");
    }
}
