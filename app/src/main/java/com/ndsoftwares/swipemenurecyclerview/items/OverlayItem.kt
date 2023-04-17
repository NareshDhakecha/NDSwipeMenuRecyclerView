package com.ndsoftwares.swipemenurecyclerview.items

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.ndsoftwares.swipemenurecyclerview.BaseItem
import com.ndsoftwares.swipemenurecyclerview.databinding.ItemOverlayBinding

class OverlayItem : BaseItem<ItemOverlayBinding>() {

    override fun inflate(inflater: LayoutInflater, parent: ViewGroup): ItemOverlayBinding {
        return ItemOverlayBinding.inflate(inflater, parent, false)
    }

    override val bindFun = fun(binding: ItemOverlayBinding, position: Int) {
        binding.content.text = "Overlay $position"
        binding.content.setOnClickListener {
            Toast.makeText(it.context, "Overlay $position", Toast.LENGTH_SHORT).show()
        }
        binding.leftMenu.setOnClickListener {
            Toast.makeText(it.context, "LEFT $position", Toast.LENGTH_SHORT).show()
        }
        binding.rightMenu.setOnClickListener {
            Toast.makeText(it.context, "RIGHT $position", Toast.LENGTH_SHORT).show()
        }
    }
}