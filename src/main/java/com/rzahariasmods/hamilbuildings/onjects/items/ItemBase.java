package com.rzahariasmods.hamilbuildings.onjects.items;

import com.rzahariasmods.hamilbuildings.Main;
import com.rzahariasmods.hamilbuildings.init.ItemInit;
import com.rzahariasmods.hamilbuildings.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
